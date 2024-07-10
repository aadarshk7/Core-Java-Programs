package No_Args__Constructor;
//NO args constructor may be private or public
public class NO_args {
  private  String name;

    NO_args() {
        name = "Aadarsh";
    }

    public static void main(String[] args) {
        NO_args n = new NO_args();
        System.out.println(n.name);
    }
}
