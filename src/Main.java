import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Wrong amount of parameters.");
            System.exit(0);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do obliczania równania kwadratowego");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = (b*b)-(4*a*c);
        double sqrtDelta = Math.sqrt(delta);

        if(delta > 0){
            double firstRoot = (-b + sqrtDelta)/(2*a);
            double secondRoot = (-b - sqrtDelta)/(2*a);
            System.out.println("Roots are: " + firstRoot + " " + secondRoot);
        }
        else if(delta == 0){
            System.out.println("Root is: " + (-b+sqrtDelta)/(2*a));
        }else{
            System.out.println("Roots are not real");
        }

    }
}
