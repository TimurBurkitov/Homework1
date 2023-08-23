package task;

public class Distance {

    public static void main(String [] args) {
        Point p1 = new Point(-1.5, 33.8);
        Point p2 = new Point( 12.2, 1.8);
        System.out.println("Расстояние между точками а (" + p1.x + "; " + p1.y + ")" + " и b (" + p2.x + "; " + p2.y + ") = " + p1.distance(p2));
    }
}
