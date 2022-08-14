package com.suraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.feign.AccountFeign;
import com.suraj.model.Account;
import com.suraj.model.AccountInput;
import com.suraj.model.RulesInput;
import com.suraj.service.RulesService;
import com.suraj.service.RulesServiceImpl;


@RestController
public class RulesController {

	
//	public RulesService rulesService = new RulesServiceImpl();
	
	@Autowired
	public RulesService rulesService;
	@Autowired
	AccountFeign accountFeign;
	
	@PostMapping("/evaluateMinBal")
	public ResponseEntity<?> evaluate(@RequestBody RulesInput account) {
		if (account.getCurrentBalance() == 0) {
			System.out.println("INVALID");
			return new ResponseEntity<Boolean>(false, HttpStatus.METHOD_FAILURE);
		} else {
			boolean status = rulesService.evaluate(account);

			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		}	
	}
	
	@PostMapping("/serviceCharges")
	public ResponseEntity<?> serviceCharges(@RequestHeader("Authorization") String token) {
	//	rulesService.hasPermission(token);
		try {
			List<Account> body = accountFeign.getAllacc(token).getBody();
			for (com.suraj.model.Account acc : body) {
				if (rulesService.serviceCharges(acc) > 0) {
					accountFeign.servicecharge(token, new AccountInput(acc.getAccountId(), rulesService.serviceCharges(acc)));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return ResponseEntity.ok(accountFeign.getAllacc(token).getBody());
	}
	
}
