package com.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public List<Account> getAccount(int userid) {
		return accountRepository.getAccountByUserid(userid);
	}
	
	public String addAccount(Account account) {
		if (account != null) {
			accountRepository.save(account);
			return "Account Added Successfully";
		} else {
			return "Account Details cannot be empty";
		}
	}
	
	public String deleteAccount(int accountNum) {
		accountRepository.deleteById(accountNum);
		return "Account Deleted Successfully";
 	}
}
