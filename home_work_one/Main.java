package home_work_one;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Invoice i01 = new Invoice("#345632", "Spare part", 5, 43);
		out.println(i01.getPartDescription() + " " + i01.getPartNumber()
				+ " quantity: " + i01.getQuantity() + " with price of " + i01.getPrice());
		out.println("Total invoice amount is: " + i01.getInvoiceAmount());
	}
}
