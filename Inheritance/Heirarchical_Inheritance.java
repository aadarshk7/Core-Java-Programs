package Inheritance;
class Music {
    public void song() {
        System.out.println("I like songs");
    }

}
class Guiter extends Music{
    public void song(){
        System.out.println("Songs are awesome");
    }
}
class Madaal extends Music{
    public void song(){
        System.out.println("See you again!");
    }
}
public class Heirarchical_Inheritance {
    public static void main(String[] args) {
      Music m=new Music();
      m.song();
      Music mm=new Guiter();
      m.song();
      Music mmm=new Madaal();
      mmm.song();

    }
}