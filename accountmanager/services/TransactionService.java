package com.bank.account.accountmanager.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.account.accountmanager.dao.models.Transaction;
/**
 * interface for all transaction related services
 * @author varun
 *
 */
@Service
public interface TransactionService {

	public List<Transaction> getAllTransactions(int accId);
}
