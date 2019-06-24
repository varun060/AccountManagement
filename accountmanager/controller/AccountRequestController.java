

/**
 * Package for all controllers
 */
package com.bank.account.accountmanager.controller;

//import util features
import java.util.List;
//import logs and spring related classes
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import custom classes
import com.bank.account.accountmanager.dao.models.Account;
import com.bank.account.accountmanager.dao.models.Transaction;
import com.bank.account.accountmanager.services.AccountService;
import com.bank.account.accountmanager.services.TransactionService;


/**
 * Class to handle requests from UI
 * It passes relevant parameters from UI to
 * Service classes
 * @author Varun K R
 *
 */
@RestController
public class AccountRequestController {

	// account business logic object declaration
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionService transService;

	// log declaration
	private static final Logger logger = LogManager.getLogger(AccountRequestController.class);


	/**
	 * Method to get all accounts in a list from service class
	 * It calls service class method to get relevant details
	 * @return List of accounts
	 */
	@RequestMapping("/getAccounts") List<Account> getAllAccounts() {
		logger.info("getting all accounts "); // Getting all currency names from
		// call account service to get details from repository
		return accountService.getAllAccounts();

	}

	
	/**
	 * Method to get all get list of transactions related to one account
	 * It calls method in service to get relevant details from repository
	 * @param accId
	 * @param pageable
	 * @return
	 */
	@RequestMapping("/trans/{accId}/")
	public List<Transaction> getAllCommentsByPostId(@PathVariable (value = "accId") int accId,
			Pageable pageable) {

		logger.info("getting all transactions of "+accId); 
		
		return transService.getAllTransactions(accId);
		

	}






}
