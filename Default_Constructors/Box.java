package Default_Constructors;
//basic example of default constructor.
public class Box {
    double height;
    double width;
    double depth;
   Box(){
        height=10;
        width=10;
        depth=10;
    }
    public void volume(){
      // double volume;
      // volume=height*width*depth;
        System.out.println("THis is aadarsh");
    }

    public static void main(String[] args) {
        Box b=new Box();
       b.volume();

    }
}
