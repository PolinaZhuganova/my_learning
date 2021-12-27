/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package hw_ATM;

import java.util.ArrayList;

/**
 * Класс ATM_is_working
 */
public class ATM_Functional {

	public static void main(String[] args) {
	//	System.out.println(10/1000);
	MoneyOperations balanceChange= new BalanceChange();

		balanceChange.actualBalance();
		balanceChange.cashIn();
		balanceChange.actualBalance();
		balanceChange.cashOut();
		balanceChange.actualBalance();
		balanceChange.cashOut();
		balanceChange.actualBalance();
		balanceChange.cashOut();
		balanceChange.actualBalance();
		balanceChange.cashOut();
		balanceChange.actualBalance();
		balanceChange.cashOut();
		balanceChange.actualBalance();

	}
}