package JavaBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double expensesStatistsPriceClothes = 0.00;


        if (statists <= 150) {
            expensesStatistsPriceClothes = statists * priceClothes;
        } else {
            expensesStatistsPriceClothes = statists * priceClothes * 0.90;
        }
        double totalExpenses = expensesStatistsPriceClothes + decor;
        if (totalExpenses <= budget) {
            System.out.printf("Action!%nWingard starts filming with %.02f leva left.", (budget - totalExpenses));
        } else {
            System.out.printf("Not enough money!%nWingard needs %.02f leva more.", Math.abs(budget - totalExpenses));
        }
    }
}
