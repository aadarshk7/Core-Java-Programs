package Inheritance;

import java.util.Objects;

public class Hello {
    int i;
    int j;
     public void method(int a, int b) {
         i = a;
         j = b;


     }
}
 class Javas extends Hello {

     int result;

     void total() {
         result = i * j;

     }

     public static void main(String[] args) {
         Javas h = new Javas();
         h.method(10, 10);
         h.total();
         System.out.println("The total is: " + h.result);

         // System.out.println(h.method(10,20));
     }
 }


