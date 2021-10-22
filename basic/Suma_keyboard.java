import java.util.Scanner;

public class Suma_keyboard{
  public static void main(String args[]){
 
   Scanner in = new Scanner(System.in);
   String name = "";
   int numone = 0, numtwo = 0, result = 0;
   
   System.out.println("¿Cual es tu nombre?");
   name = in.nextLine();

   System.out.println("Dame el primer valor para tu suma: ");
   numone = in.nextInt();

   System.out.println("Dame el primer valor para tu suma: ");
   numtwo = in.nextInt();

   result = numone + numtwo;
   System.out.println("Hola " + name + " , el resultado de tu suma es: " + result);
   
 }
}

