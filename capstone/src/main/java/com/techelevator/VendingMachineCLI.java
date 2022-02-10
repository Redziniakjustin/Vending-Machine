package com.techelevator;

import com.techelevator.view.Display;
import com.techelevator.view.Menu;

import javax.crypto.spec.PSource;

public class VendingMachineCLI extends Display {

	//MAIN MENU FINAL VARIABLES
	private static final String MMO_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MMO_PURCHASE = "Purchase";
	private static final String[] MM_OPTIONS = { MMO_DISPLAY_ITEMS, MMO_PURCHASE };

	//PURCHASE MENU FINAL VARIABLES
	private static final String PMO = "Feed money";
	private static final String PM0_SELECT_PRODUCT ="Select Product";
	private static final String PMO_FINISH = "Finish Transaction";
	private static final String [] PMO_OPTIONS = { PMO, PM0_SELECT_PRODUCT, PMO_FINISH};

	private String list;

	public String getList() {
		return list;
	}




	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MM_OPTIONS);

			if (choice.equals(MMO_DISPLAY_ITEMS)) {
				System.out.println(list);

			} else if (choice.equals(MMO_PURCHASE)) {
				choice= (String) menu.getChoiceFromOptions(PMO_OPTIONS);
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
