// package for all repository classes
package com.bank.account.accountmanager.dao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.accountmanager.dao.models.Account;

/**
 * interface for Account repository 
 * which will be handled by JPA
 * @author varun
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}