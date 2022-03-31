import java.util.Scanner;

public class conText {

    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Wrong amount of parameters.");
            System.exit(0);
        }

        System.out.println("Program konwersji tekstu");

        String text = (args[0]);
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);

        if(firstNumber > secondNumber){
            System.out.println("first number must be higher than second");
            System.exit(1);
        }

        System.out.println("Wyswietla:");
        String cutPieceFromString = text.substring(firstNumber,secondNumber);
        System.out.println(cutPieceFromString);



    }
}
