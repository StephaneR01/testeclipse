package com.formation;

import java.util.Arrays;

public class BuyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));
	}

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		// your code
		double solde = 0;
		int month = 0;
		double priceOld = (double)startPriceOld;
		double priceNew = (double)startPriceNew;
		double percentLossTotal = (1.0 - percentLossByMonth/100);
		
		if (startPriceOld >= startPriceNew) {
			solde = startPriceOld - startPriceNew;
		} else {
			while (solde <= 0) {
				priceOld = priceOld*percentLossTotal;
				priceNew = priceNew*percentLossTotal;
				solde = priceOld + (double) savingperMonth * (month + 1) - priceNew;
				if (month % 2 == 0) {
					percentLossTotal -= 0.005;
				}
				month++;
			}
		}

		int[] arr = { month, (int)Math.round(solde) };
		return arr;
	}

}
