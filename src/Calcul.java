import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) throws FileNotFoundException {
        File inPut =  new File("pr");
        File outPut = new File("output");
        PrintWriter out = new PrintWriter(outPut);
        String txt = "";

        try {
            Scanner in = new Scanner(inPut);
            txt = in.nextLine();
            in.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

        int a = 0;
        int b = 0;
        String sym = "";

        String[] prime = txt.split(" ");
        double fin= 0;

            try{a = Integer.parseInt(prime[0]);
                b = Integer.parseInt(prime[2]);
                sym = prime[1];
                switch (sym){
                    case "+": fin = a+b;
                    break;
                    case "-": fin = a-b;
                    break;
                    case "/": fin = a/b;
                    break;
                    case "*": fin = a*b;
                    break;
                    default: throw new Exception();

                }
                out.println(a+" "+sym+" "+ b + " = " + fin);
               System.out.printf("%.1f",fin);
               out.close();

            }

            catch (NumberFormatException e) {
                System.out.println("Error! Not number");
            }
            catch (ArithmeticException e){
                System.out.println("Error! Division by zero");
            }
            catch (Exception e ){
                System.out.println("Operation Error!");

            }
    }
}
