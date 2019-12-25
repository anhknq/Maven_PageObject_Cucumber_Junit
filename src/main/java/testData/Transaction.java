package testData;

public class Transaction {
	private String transactionID;
	private String accountID;
	private String fromAccountID;
	private String toAccountID;
	private int amount;
	private String transactionType;
	private String dateOfTransaction;
	private String description;
	
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getFromAccountIndex() {
		return fromAccountID;
	}
	public void setFromAccountIndex(String fromAccountIndex) {
		this.fromAccountID = fromAccountIndex;
	}
	public String getToAccountIndex() {
		return toAccountID;
	}
	public void setToAccountIndex(String toAccountIndex) {
		this.toAccountID = toAccountIndex;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
