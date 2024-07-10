package Basic_programs;

public class With_p_method {
    double height;
    double width;
    double breadth;

    With_p_method(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;

    }

    public void run(){
    double volume;
        volume = height * width * breadth;
        System.out.println(volume);
    }

    public static void main(String[] args) {
        With_p_method p = new With_p_method(10, 20, 20);
           p.run();
    }
}
