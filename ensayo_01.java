
import java.util.Scanner;


public class ensayo_01 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero int: ");
        int numero = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("ingrese una palabra: ");
        
        String palabra = sc.nextLine();
        System.out.println("ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        
        System.out.println("lo que ingreso fue: " + numero + ", " + palabra + ", " + palabra2);
        
        
    }
}
