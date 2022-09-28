package home_work_one;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private int price;

	public Invoice(String number, String description, int q, int p) {
		partNumber = number;
		partDescription = description;
		quantity = (q < 0) ? 0 : q;
		price = (p < 0) ? 0 : p;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String number) {
		partNumber = number;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String description) {
		partDescription = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int q) {
		quantity = (q < 0) ? 0 : q;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		price = (p < 0) ? 0 : p;
	}

	public int getInvoiceAmount() {
		return price * quantity;
	}
}
