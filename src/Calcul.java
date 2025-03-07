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

        double a = 0;
        double b = 0;
        String sym = "";

        String[] prime = txt.split(" ");
        double fin= 0;

            try{a = Double.parseDouble(prime[0]);
                b = Double.parseDouble(prime[2]);
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

            }
            catch (ArithmeticException e){
                out.println(txt +" = "+"Error! Division by zero");
                out.close();
            }
            catch (NumberFormatException e) {
                out.println(txt +" = "+"Error! Not number");
                out.close();
            }

            catch (Exception e ){
                out.println(txt +" = "+"Operation Error!");
                out.close();
            }
        out.printf("%s = %.1f", txt, fin);
        System.out.printf("%.1f",fin);
        out.close();
    }
}
