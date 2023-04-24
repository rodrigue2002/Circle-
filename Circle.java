public class Circle {
    public static void main(String[]args){
        Circle A = new Circle ();
        Circle B = new Circle ();
        Circle C = new Circle ();
        A.setRadius(1);
        A.setCenter(0,0);
        B.setRadius(4);
        B.setCenter(2,0);
        C.setRadius(2);
        C.setCenter(0,2);
        System.out.println("the surface of A ist: " + A.surface());
        System.out.println("the surface of B ist: " + B.surface());
        System.out.println("the surface of C ist: " + C.surface());
        System.out.println("the point (0,0) is in A: " + A.istlower(0,0));
        System.out.println("the point (2,0) is in B: " + B.istlower(2,0));
        System.out.println("the point (0,2) is in C: " + C.istlower(0,2));


    }
    private double radius;
    private double x , y; // centre du cercle


    public void setCenter (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double surface (){
        return Math.PI * radius * radius;
    }

    boolean isin(double x , double y){     // est ce que le point est dans le cercle
        return Math.pow((x-this.x),2) + Math.pow((y-this.y),2) <= Math.pow(radius,2);
    }
}
