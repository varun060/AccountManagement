package com.bank.account.accountmanager.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.account.accountmanager.dao.models.Account;

/**
 * interface for Account services
 * @author varun
 *
 */
@Service
public interface AccountService {
	// method to get all services
	public List<Account> getAllAccounts();

}
