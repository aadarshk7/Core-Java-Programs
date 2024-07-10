package Thread;


public class Basic extends Thread {
public void run(){
    try{
        for(int i=1;i<=20;i++){
            System.out.println("I love Aadarsh");
            Thread.sleep(100);
        }
    }catch (Exception e){

    }
}
}


class Threadd {
    public static void main(String[] args) {
        Basic b = new Basic();
       // b.eat();
        b.run();
        //System.out.println("Aadarsh");
    }
}

