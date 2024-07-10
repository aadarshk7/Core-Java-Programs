package Polymorphims;
class Arithmetic {
    public void sound() {
        System.out.println("Dog can bark");
    }
}
  class Caat extends Arithmetic {
      public void sound() {
          System.out.println("meoww");
      }
  }
      class Liion extends Arithmetic {
          public void sound() {
              System.out.println("Grrillllll");
          }
      }
public class Static_poly {
          public static void main(String[] args) {
          Arithmetic atm=new Arithmetic();
          atm.sound();
          Arithmetic attm=new Caat();
          attm.sound();
          Arithmetic atttm=new Liion();
          atttm.sound();
          }
          }
