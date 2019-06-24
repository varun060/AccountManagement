// package for all services
package com.bank.account.accountmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.accountmanager.dao.models.Transaction;
import com.bank.account.accountmanager.dao.repository.TransactionRepository;

/**
 * Class is to handle business logic on data that is received from 
 * repository classes.
 * This will directly access repository class to get objects mapped to table
 * @author varun
 *
 */
@Service
public class TransactionServiceImpl implements TransactionService {

	// declare transaction repository
	@Autowired
	TransactionRepository transRepo;
	/**
	 * Method to interact with repository classes and
	 * apply business logic on the data received from it
	 * it calls transaction repository for getting all transactions related
	 * to one account
	 * @param accId
	 * @return
	 */
	public List<Transaction> getAllTransactions(int accId) {
		// call repository method
		return transRepo.findByAccId(accId);
	}

}
