package dataProvider;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import testData.Account;
import testData.Customer;
import testData.Transaction;
import testData.User;

public class JsonDataWriter {

	private final static String userFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Users.json";
	private final static String accountFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Accounts.json";
	private final static String transactionFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Transactions.json";

	private List<User> userList;
	private List<Account> accountList;
	private List<Transaction> transList;

	public JsonDataWriter() {
		userList = FileReaderManager.getInstance().getJsonReader().getUserData();
		accountList = FileReaderManager.getInstance().getJsonReader().getAccountData();
		transList = FileReaderManager.getInstance().getJsonReader().getTransactionOuput();
	}

	public void addNewUser(User user) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		userList.add(user);
		try (FileWriter writer = new FileWriter(userFilePath)) {
			gson.toJson(userList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addNewCustomer(Customer newCustomer, String registerEmail) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : userList) {
			if (u.getRegisterEmail().equalsIgnoreCase(registerEmail)) {
				if (u.getCustomer() == null) {
					List<Customer> newCustomerList = new ArrayList<Customer>();
					newCustomerList.add(newCustomer);
					u.setCustomer(newCustomerList);
				} else {
					u.getCustomer().add(newCustomer);
				}
			}
		}
		try (FileWriter writer = new FileWriter(userFilePath)) {
			gson.toJson(userList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateEditCustomer(Customer editCustomer, String customerID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : userList) {
			for (int i = 0; i < u.getCustomer().size(); i++) {
				if (u.getCustomer().get(i).getCustomerID().equalsIgnoreCase(customerID)) {
					// error ConcurrentModificationException when use for each: use for loop
					u.getCustomer().remove(i);
					u.getCustomer().add(i, editCustomer);
				}
			}
		}
		try (FileWriter writer = new FileWriter(userFilePath)) {
			gson.toJson(userList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomer(String customerID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : userList) {
			for (int i = 0; i < u.getCustomer().size(); i++) {
				if (u.getCustomer().get(i).getCustomerID().equalsIgnoreCase(customerID)) {
					u.getCustomer().remove(i);
				}
			}
			try (FileWriter writer = new FileWriter(userFilePath)) {
				gson.toJson(userList, writer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addNewAccount(Account account) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		accountList.add(account);
		try (FileWriter writer = new FileWriter(accountFilePath)) {
			gson.toJson(accountList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateEditAccount(Account acc, String accountID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountID().equalsIgnoreCase(accountID)) {
				accountList.remove(i);
				accountList.add(i, acc);
			}
		}
		try (FileWriter writer = new FileWriter(accountFilePath)) {
			gson.toJson(accountList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteAccount(Account account) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountID().equalsIgnoreCase(account.getAccountID())) {
				accountList.remove(i);
			}
		}
		try (FileWriter writer = new FileWriter(accountFilePath)) {
			gson.toJson(accountList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateBalance(String accountID, int balance) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountID().equalsIgnoreCase(accountID)) {
				accountList.get(i).setCurrentAmount(balance);
			}
		}
		try (FileWriter writer = new FileWriter(accountFilePath)) {
			gson.toJson(accountList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addNewTransaction(Transaction trans) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		transList.add(trans);
		try (FileWriter writer = new FileWriter(transactionFilePath)) {
			gson.toJson(transList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
