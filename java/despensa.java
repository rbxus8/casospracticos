//SOLUCION 1
/*  
import java.util.Scanner;

public class despensa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //categorias

    double repositor, cajero, supervisor, sueldo;

    System.out.println("ingresa la opcion del sueldo que le correponde al empleado:");
    System.out.println("1.repositor");
    System.out.println("2.cajero");
    System.out.println("3.supervisor");
    int opcion = scanner.nextInt();

    switch (opcion) {
        case 1:

        sueldo = 15890;
        double bono = sueldo * 0.10;
        repositor = sueldo + bono;
        System.out.println("el sueldo del repositor es:"+ repositor);
            
            break;
    
        case 2:

        cajero = 25630.89;
        System.out.println("el sueldo del cajero es:"+cajero);
        
            break;

        case 3:

        sueldo = 35560.20;
        double jubilacion = sueldo * 0.11;
        supervisor = sueldo - jubilacion;
        System.out.println("el sueldo del supervisor es:"+ supervisor);

            break;
        default:
        System.out.println("opcion no valida intentalo de nuevo");
            break;
    } 
}
}
*/


//SOLUCION 2
/* 
import java.util.Scanner;

public class despensa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double repositor, cajero, supervisor;
        int opcion;

        System.out.println("ingresa la opcion del sueldo que le correponde al empleado:");
        System.out.println("1.repositor");
        System.out.println("2.cajero");
        System.out.println("3.supervisor");
        opcion = scanner.nextInt();

        if (opcion == 1) {

            repositor = 15890 + (15890 * 0.10);
            System.out.println("el sueldo del repositor es:"+repositor); 

        }if (opcion == 2) {

            cajero = 25630.89;
            System.out.println("el sueldo del cajero es:"+cajero); 

        }if (opcion == 3) {

            supervisor = 35560.20 - (35560.20 * 0.11);
            System.out.println("el sueldo del supervisor es:"+supervisor); 

        }else{
            System.out.println("ninguna opcion corresponde");
        }

    }
}

*/
