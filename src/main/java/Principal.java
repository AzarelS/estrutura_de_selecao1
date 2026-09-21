import java.util.Scanner;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, metade;
              
        numero = sc.nextInt();
        
        if (numero > 10) {
            metade = numero / 2;
            System.out.println("A metade e: " + metade);
        }
                
        
    }
}
