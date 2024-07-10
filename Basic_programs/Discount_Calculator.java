package Basic_programs;

import java.util.Scanner;

public class Discount_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for Bat");
        System.out.println("2 for Furniture");
        System.out.println("3 for Laptop");
        int price, discount, exit;
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter the amount of bat");
                price = sc.nextInt();
                if (price > 5000 && price < 10000) {
                    System.out.println("You have got 5% discount");
                    discount = price * 5 / 100;
                    price = price - discount;
                    System.out.println("Your Price after discount is: " + price);
                }/*else{
                    System.out.println("Sorry no discount available");
                }*/
            case 2:
                System.out.println("Enter the price of Furniture");
                price = sc.nextInt();
                if (price > 10000 && price < 15000) {
                    System.out.println("You have got 10% discount");
                    discount = price * 10 / 1000;
                    price = price - discount;
                    System.out.println("Your price after discount is: " + price);
                } else {
                    System.out.println("No discount availabe");
                }

        }
    }
}