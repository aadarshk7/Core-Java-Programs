package Interface;
interface Song{
    void singer();
    void music();

}
class MySong implements Song{
    public void singer(){
        System.out.println("I like singers.");
    }
    public void music(){
        System.out.println("See you again!");
    }
        }
public class BasicInterface {
    public static void main(String[] args) {
        MySong ms=new MySong();
        ms.singer();
        ms.music();
    }
}
