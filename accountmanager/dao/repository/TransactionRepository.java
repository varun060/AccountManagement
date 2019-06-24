// package for all repository classes
package com.bank.account.accountmanager.dao.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.accountmanager.dao.models.Transaction;

/**
 * interface for Transaction repository 
 * which will be handled by JPA
 * @author varun
 *
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
	List<Transaction> findByAccId(Integer accId);
   // Optional<Transaction> findByIdAndAccId(Integer id, Integer accId);

}