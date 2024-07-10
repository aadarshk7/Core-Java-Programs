package Basic_programs;

// create a class with its instance variable and without making its object display it.
public class Without_Method {
    double height;
    double width;
    double depth;

    public static void main(String[] args) {
        Without_Method wm = new Without_Method();
        double volume;
        wm.height = (10);
        wm.width = (20);
        wm.depth = (20);
        volume = wm.height * wm.width * wm.depth;
        System.out.println(volume);
    }
}
