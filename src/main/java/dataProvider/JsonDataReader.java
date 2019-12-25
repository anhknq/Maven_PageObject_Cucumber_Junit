package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

import testData.Account;
import testData.Customer;
import testData.RegisterEmail;
import testData.Transaction;
import testData.User;

public class JsonDataReader {
	private final String newCustomerFilePath = FileReaderManager.getInstance().getConfigReader()
			.getInputTestDataResourcePath() + "NewCustomer.json";
	private final String editCustomerFilePath = FileReaderManager.getInstance().getConfigReader()
			.getInputTestDataResourcePath() + "EditCustomer.json";
	private final String emailFilePath = FileReaderManager.getInstance().getConfigReader()
			.getInputTestDataResourcePath() + "RegisterEmail.json";
	private final String newAccountFilePath = FileReaderManager.getInstance().getConfigReader()
			.getInputTestDataResourcePath() + "NewAccount.json";
	private final String transactionFilePath = FileReaderManager.getInstance().getConfigReader()
			.getInputTestDataResourcePath() + "Transaction.json";

	private final String userFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Users.json";
	private final String accountFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Accounts.json";
	private final String transactionsFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Transactions.json";

	private List<User> userList;
	private List<RegisterEmail> emailList;
	private List<Account> accountList;

	public JsonDataReader() {
	}

	public List<RegisterEmail> getEmailData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(emailFilePath));
			List<RegisterEmail> emails = new LinkedList<>(
					Arrays.asList(gson.fromJson(bufferReader, RegisterEmail[].class)));
			return emails;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + emailFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public List<User> getUserData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(userFilePath));
			List<User> users = new LinkedList<>(Arrays.asList(gson.fromJson(bufferReader, User[].class)));
			return users;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + userFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public User getUserByUserID(String userID) {
		userList = getUserData();
		for (User user : userList) {
			if (user.getUserID().equalsIgnoreCase(userID))
				return user;
		}
		return null;
	}

	public User getUserByEmail(String email) {
		userList = getUserData();
		for (User user : userList) {
			if (user.getRegisterEmail().equalsIgnoreCase(email))
				return user;
		}
		return null;
	}

	public List<Customer> getNewCustomerData() {
		return getCustomerData(newCustomerFilePath);
	}

	public List<Customer> getEditCustomerData() {
		return getCustomerData(editCustomerFilePath);
	}

	private List<Customer> getCustomerData(String filePath) {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(filePath));
			List<Customer> customers = new LinkedList<>(Arrays.asList(gson.fromJson(bufferReader, Customer[].class)));
			return customers;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + filePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public String getCustomerIDByEmail(int indexOfEmailInList, int indexOfCustomerInList) {
		return getCustomerByEmail(indexOfEmailInList, indexOfCustomerInList).getCustomerID();
	}

	public Customer getCustomerByEmail(int indexOfEmailInList, int indexOfCustomerInList) {
		String email = getEmailInList(indexOfEmailInList);
		return getUserByEmail(email).getCustomer().get(indexOfCustomerInList);
	}

	public Customer getCustomerByCustomerID(String customerID) {
		userList = getUserData();
		for (User user : userList) {
			for (Customer cus : user.getCustomer()) {
				if (cus.getCustomerID().equalsIgnoreCase(customerID)) {
					return cus;
				}
			}
		}
		return null;
	}

	public String getEmailInList(int indexOfEmailInList) {
		emailList = FileReaderManager.getInstance().getJsonReader().getEmailData();
		return emailList.get(indexOfEmailInList).getEmailID();
	}

	public Account getAccountByAccountID(String accountID) {
		accountList = getAccountData();
		for (Account acc : accountList) {
			if (acc.getAccountID().equalsIgnoreCase(accountID)) {
				return acc;
			}
		}
		return null;
	}

	public List<Account> getAccountByCustomerID(String customerID) {
		accountList = getAccountData();
		List<Account> newList = new ArrayList<Account>();
		for (Account acc : accountList) {
			if (acc.getCustomerID().equalsIgnoreCase(customerID)) {
				newList.add(acc);
			}
		}
		return newList;
	}
	
	public List<Account> getAccountData() {
		return getAccountData(accountFilePath);
	}

	public List<Account> getNewAccountData() {
		return getAccountData(newAccountFilePath);
	}

	public List<Account> getAccountData(String filePath) {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(filePath));
			List<Account> accounts = new LinkedList<>(Arrays.asList(gson.fromJson(bufferReader, Account[].class)));
			return accounts;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + filePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public List<Transaction> getTransactionInput() {
		return getTransactionData(transactionFilePath);
	}

	public List<Transaction> getTransactionOuput() {
		return getTransactionData(transactionsFilePath);
	}

	public List<Transaction> getTransactionData(String filePath) {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(filePath));
			List<Transaction> trans = new LinkedList<>(Arrays.asList(gson.fromJson(bufferReader, Transaction[].class)));
			return trans;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + filePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

}