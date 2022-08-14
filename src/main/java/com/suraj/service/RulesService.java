package com.suraj.service;

import com.suraj.model.Account;
import com.suraj.model.RulesInput;

public interface RulesService {
	
	public boolean evaluate(RulesInput account);
	
	public double serviceCharges(Account account);

}
