package Abstraction;

abstract class Song {
   // public abstract void method();

    public void name() {
        System.out.println("The song is Despacito");
    }
}

class Music extends Song {
    public void method() {
        System.out.println("My fav song is see you again");
    }

    public void soong() {
        System.out.println("I loves song");
    }
    public void singer(){
        System.out.println("I love paul walker");
    }
}



public class Abstraction_exp {
    public static void main(String[] args) {
       Music m=new Music();
       m.method();
       m.singer();
       m.soong();
    }
}
