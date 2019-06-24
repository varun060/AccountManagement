// package for all services
package com.bank.account.accountmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.accountmanager.dao.models.Account;
import com.bank.account.accountmanager.dao.repository.AccountRepository;

/**
 * Class is to handle business logic on data that is received from 
 * repository classes.
 * This will directly access repository class to get objects mapped to table
 * @author varun
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;
	/**
	 * Method to interact with repository classes and
	 * apply business logic on the data received from it
	 * it calls account repository for getting all account details
	 * @param accId
	 * @return
	 */
	public List<Account> getAllAccounts() {
		
		return accountRepo.findAll();
	}
	
	

}
