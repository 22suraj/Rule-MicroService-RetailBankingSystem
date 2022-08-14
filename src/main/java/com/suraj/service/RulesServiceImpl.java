package com.suraj.service;

import com.suraj.model.Account;
import com.suraj.model.RulesInput;

public class RulesServiceImpl implements RulesService {

	@Override
	public boolean evaluate(RulesInput account) {
		int min = 1000;
		double check = account.getCurrentBalance() - account.getAmount();
		if (check >= min)
			return true;
		else
			return false;
	}

	@Override
	public double serviceCharges(Account account) {
		double detected = account.getCurrentBalance() / 10;
		if (account.getCurrentBalance() < 2000 && (account.getCurrentBalance() - detected) > 0) {
			return detected;
		} 
		return 0.0;
	}

}
