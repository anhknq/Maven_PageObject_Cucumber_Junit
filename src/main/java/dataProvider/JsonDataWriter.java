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
	private final static String accountsFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Accounts.json";
	private final static String transactionsFilePath = FileReaderManager.getInstance().getConfigReader()
			.getOutputTestDataResourcePath() + "Transactions.json";

	private List<User> usersList;
	private List<Account> accountsList;
	private List<Transaction> transList;

	public JsonDataWriter() {
		usersList = FileReaderManager.getInstance().getJsonReader().getUsersData();
		accountsList = FileReaderManager.getInstance().getJsonReader().getAccountsData();
		transList = FileReaderManager.getInstance().getJsonReader().getTransactionsOuput();
	}

	public void addNewUser(User user) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		usersList.add(user);
		try (FileWriter writer = new FileWriter(userFilePath)) {
			gson.toJson(usersList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addNewCustomer(Customer newCustomer, String registerEmail) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : usersList) {
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
			gson.toJson(usersList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateEditCustomer(Customer editCustomer, String customerID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : usersList) {
			for (int i = 0; i < u.getCustomer().size(); i++) {
				if (u.getCustomer().get(i).getCustomerID().equalsIgnoreCase(customerID)) {
					// error ConcurrentModificationException when use for each: use for loop
					u.getCustomer().remove(i);
					u.getCustomer().add(i, editCustomer);
				}
			}
		}
		try (FileWriter writer = new FileWriter(userFilePath)) {
			gson.toJson(usersList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomer(String customerID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (User u : usersList) {
			for (int i = 0; i < u.getCustomer().size(); i++) {
				if (u.getCustomer().get(i).getCustomerID().equalsIgnoreCase(customerID)) {
					u.getCustomer().remove(i);
					break;
				}
			}
			try (FileWriter writer = new FileWriter(userFilePath)) {
				gson.toJson(usersList, writer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addNewAccount(Account account) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		accountsList.add(account);
		try (FileWriter writer = new FileWriter(accountsFilePath)) {
			gson.toJson(accountsList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateEditAccount(Account acc, String accountID) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountsList.size(); i++) {
			if (accountsList.get(i).getAccountID().equalsIgnoreCase(accountID)) {
				accountsList.remove(i);
				accountsList.add(i, acc);
			}
		}
		try (FileWriter writer = new FileWriter(accountsFilePath)) {
			gson.toJson(accountsList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteAccount(Account account) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountsList.size(); i++) {
			if (accountsList.get(i).getAccountID().equalsIgnoreCase(account.getAccountID())) {
				accountsList.remove(i);
				break;
			}
		}
		try (FileWriter writer = new FileWriter(accountsFilePath)) {
			gson.toJson(accountsList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void updateBalance(String accountID, int balance) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		for (int i = 0; i < accountsList.size(); i++) {
			if (accountsList.get(i).getAccountID().equalsIgnoreCase(accountID)) {
				accountsList.get(i).setCurrentAmount(balance);
			}
		}
		try (FileWriter writer = new FileWriter(accountsFilePath)) {
			gson.toJson(accountsList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addNewTransaction(Transaction trans) {
		Gson gson = new GsonBuilder().setPrettyPrinting().setLenient().create();
		transList.add(trans);
		try (FileWriter writer = new FileWriter(transactionsFilePath)) {
			gson.toJson(transList, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
