abstract class Vegitables {
    public void method() {
        System.out.println("Hello i am vegitables");
    }
}
    class Cabbage extends Abstractionss {
        public void method() {
            System.out.println("Cabbage is vegitables");
        }
    }
        class Cauliflower extends Abstractionss {
            public void method() {
                System.out.println("Hllo this is in abstract");
            }
        }



    public class Abstractionss {
        public static void main(String[] args) {
            Cabbage c = new Cabbage();
            c.method();
         Cauliflower cw=new Cauliflower();
         cw.method();

        }

}


