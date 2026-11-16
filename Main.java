import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // time interval 0.15 s. angle = 45
        double t=0.15, x=0, y=0, v0, a=45;
        boolean ground, target;
        //converts a number into radians
        a=Math.toRadians(a);
        try {
            System.out.print("v0=");
            v0 = sc.nextDouble();
            System.out.println("result:");

            System.out.println("t\t\tx\t\ty");


            //will do while reachs break
            do {
                //trajectory formula
                x=t*v0*Math.cos(a);
                //the gravitational constant was derived from the Moon's gravitational pull, which is 1.62 
                y=v0*t*Math.sin(a)-((1.62*Math.pow(t,2))/2);
                System.out.printf("%.1f\t\t%.3f\t\t%.3f", t, x, y);
                System.out.println();
                t+=0.15;
                //if missed the target
                ground = (y <= 0) || ((x >= 7 && x <= 10) && (y <= 4));
                //if hit the target
                target = (y >= 0 && y <= 3) && (x >= 17 && x <= 20);
                if (target) {
                    System.out.println("the target was destroyed");
                    break;
                }
                else if (ground) {
                    System.out.println("shot off the target");
                    break;
                }
                else {
                    continue;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("input-output error");
        }
        sc.close();
    }
}