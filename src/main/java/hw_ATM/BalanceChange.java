package hw_ATM;

import java.util.*;

/**
 * Класс Balance
 */
public class BalanceChange implements MoneyOperations {


	private int updatedNotesCounter = 0;
	private int notesCounter = 0;
	private int cashInto = 0;



	@Override
	public void actualBalance() {
		int balance =
			((BankNotes.getFIFTY_counter() * 50) +
				(BankNotes.getTWO_HUNDRED_counter() * 200) +
				(BankNotes.getHUNDRED_counter() * 100) +
				(BankNotes.getFIVE_HUNDRED_counter() * 500) +
				(BankNotes.getTHOUSAND_counter() * 1000));
		System.out.println("Ваш текущий баланс " + balance);
	}

	@Override
	public void start() {
		System.out.println("Вставьте деньги в деньгоприемник");
		Scanner scanner = new Scanner(System.in);
		cashInto = scanner.nextInt();

	}



	@Override
	public void cashIn() {

		start();


		if (cashInto >= BankNotes.getTHOUSAND()) {
			notesCounter = cashInto / BankNotes.getTHOUSAND();
			if (notesCounter > 5) {
				notesCounter = 5;
				BankNotes.setTHOUSAND_counter(notesCounter);
				cashInto -= notesCounter * BankNotes.getTHOUSAND();

			} else {
				updatedNotesCounter = BankNotes.getTHOUSAND_counter() + notesCounter;
				BankNotes.setTHOUSAND_counter(updatedNotesCounter);
				cashInto -= notesCounter * BankNotes.getTHOUSAND();

			}
		}

		if (cashInto >= BankNotes.getFiveHundred()) {
			notesCounter = cashInto / BankNotes.getFiveHundred();
			if (notesCounter > 5) {
				notesCounter = 5;
				BankNotes.setFIVE_HUNDRED_counter(notesCounter);
				cashInto -= notesCounter * BankNotes.getFiveHundred();
			} else {
				updatedNotesCounter = BankNotes.getFIVE_HUNDRED_counter() + notesCounter;
				BankNotes.setFIVE_HUNDRED_counter(updatedNotesCounter);
				cashInto -= notesCounter * BankNotes.getFiveHundred();

			}
		}

		if (cashInto >= BankNotes.getTwoHundred()) {
			notesCounter = cashInto / BankNotes.getTwoHundred();
			if (notesCounter > 5) {
				notesCounter = 5;
				BankNotes.setTWO_HUNDRED_counter(notesCounter);
				cashInto -= notesCounter * BankNotes.getTwoHundred();
			} else {
				updatedNotesCounter = BankNotes.getTWO_HUNDRED_counter() + notesCounter;
				BankNotes.setTWO_HUNDRED_counter(updatedNotesCounter);
				cashInto -= notesCounter * BankNotes.getTwoHundred();
			}
		}

		if (cashInto >= BankNotes.getHUNDRED()) {
			notesCounter = cashInto / BankNotes.getHUNDRED();
			if (notesCounter > 5) {
				notesCounter = 5;
				BankNotes.setHUNDRED_counter(notesCounter);
				cashInto -= notesCounter * BankNotes.getHUNDRED();
			} else {
				updatedNotesCounter = BankNotes.getHUNDRED_counter() + notesCounter;
				BankNotes.setHUNDRED_counter(updatedNotesCounter);
				cashInto -= notesCounter * BankNotes.getHUNDRED();
			}
		}

		if (cashInto >= BankNotes.getFIFTY()) {
			notesCounter = cashInto / BankNotes.getFIFTY();
			updatedNotesCounter = BankNotes.getFIFTY_counter() + notesCounter;
			BankNotes.setFIFTY_counter(updatedNotesCounter);


		}
	}


	@Override
	public void cashOut() {

		System.out.println("Введите сумму");
		Scanner scanner = new Scanner(System.in);
		int SumToCashOut = scanner.nextInt();


		if (SumToCashOut >= BankNotes.getTHOUSAND()) {
			notesCounter = SumToCashOut / BankNotes.getTHOUSAND();
			if (notesCounter <= BankNotes.getTHOUSAND_counter() && BankNotes.getTHOUSAND_counter() != 0) {
				updatedNotesCounter = BankNotes.getTHOUSAND_counter() - notesCounter;
				BankNotes.setTHOUSAND_counter(updatedNotesCounter);
				SumToCashOut -= notesCounter * BankNotes.getTHOUSAND();

			}
		}

		if (SumToCashOut >= BankNotes.getFiveHundred()) {
			notesCounter = SumToCashOut / BankNotes.getFiveHundred();
			if (notesCounter <= BankNotes.getFIVE_HUNDRED_counter() && BankNotes.getFIVE_HUNDRED_counter() != 0) {
				updatedNotesCounter = BankNotes.getFIVE_HUNDRED_counter() - notesCounter;
				BankNotes.setFIVE_HUNDRED_counter(updatedNotesCounter);
				SumToCashOut -= notesCounter * BankNotes.getFiveHundred();

			}
		}


		if (SumToCashOut >= BankNotes.getTwoHundred()) {
			notesCounter = SumToCashOut / BankNotes.getTwoHundred();
			if (notesCounter <= BankNotes.getTWO_HUNDRED_counter() && BankNotes.getTWO_HUNDRED_counter() != 0) {
				updatedNotesCounter = BankNotes.getTWO_HUNDRED_counter() - notesCounter;
				BankNotes.setTWO_HUNDRED_counter(updatedNotesCounter);
				SumToCashOut -= notesCounter * BankNotes.getTwoHundred();

			}
		}

		if (SumToCashOut >= BankNotes.getHUNDRED()) {
			notesCounter = SumToCashOut / BankNotes.getHUNDRED();
			if (notesCounter <= BankNotes.getHUNDRED_counter() && BankNotes.getTWO_HUNDRED_counter() != 0) {
				updatedNotesCounter = BankNotes.getHUNDRED_counter() - notesCounter;
				BankNotes.setHUNDRED_counter(updatedNotesCounter);
				SumToCashOut -= notesCounter * BankNotes.getTwoHundred();

			}
		}

		if (SumToCashOut >= BankNotes.getFIFTY()) {
			notesCounter = SumToCashOut / BankNotes.getFIFTY();
			if (notesCounter <= BankNotes.getFIFTY_counter() && BankNotes.getFIFTY_counter() != 0) {
				updatedNotesCounter = BankNotes.getFIFTY_counter() - notesCounter;
				BankNotes.setFIFTY_counter(updatedNotesCounter);

			} else {
				System.out.println("Выдать запрошенную сумму невозможно");
			}

		}


	}


}

