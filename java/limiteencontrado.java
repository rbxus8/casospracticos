import java.util.Scanner;

public class limiteencontrado {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("ingresa numero limite al cual deseas llegar empezando por el numero 1:");    
    int limite = scanner.nextInt();    

    for (int i = 0; i < limite; i++) {
       int cont = i + 1;

       System.out.println(cont);
    }


    }
}
