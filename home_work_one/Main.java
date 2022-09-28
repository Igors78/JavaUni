package home_work_one;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Invoice i01 = new Invoice("#345632", "Spare part", 5, 40);
		out.println(i01.getPartDescription() + " " + i01.getPartNumber()
				+ " quantity: " + i01.getQuantity() + " with price of " + i01.getPrice());
		out.println("Total invoice amount is: " + i01.getInvoiceAmount());
		i01.setQuantity(-5);
		out.println(i01.getPartDescription() + " " + i01.getPartNumber()
				+ " quantity: " + i01.getQuantity() + " with price of " + i01.getPrice());
		out.println("Total invoice amount is: " + i01.getInvoiceAmount());
		i01.setQuantity(5);
		i01.setPrice(-40);
		out.println(i01.getPartDescription() + " " + i01.getPartNumber()
				+ " quantity: " + i01.getQuantity() + " with price of " + i01.getPrice());
		out.println("Total invoice amount is: " + i01.getInvoiceAmount());
		i01.setPrice(40);
		out.println(i01.getPartDescription() + " " + i01.getPartNumber()
				+ " quantity: " + i01.getQuantity() + " with price of " + i01.getPrice());
		out.println("Total invoice amount is: " + i01.getInvoiceAmount());
		Invoice i02 = new Invoice("#300002", " Another Spare part", -15, -240);
		out.println(i02.getPartDescription() + " " + i02.getPartNumber()
				+ " quantity: " + i02.getQuantity() + " with price of " + i02.getPrice());
		out.println("Total invoice amount is: " + i02.getInvoiceAmount());

	}
}
