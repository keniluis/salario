
package salario;


import java.util.*;

public class Salario {

   
    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);
  
        //creamos los arrays
        int[] id = new int[5];
        String[] nombre = new String[5];
        String[] apellido = new String[5];
        double[] sueldos = new double[5];

        //variables donde guardar el nombre y sueldo del empleado que más gana
        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        //se lee el primer empleado
        System.out.println("Lectura de nombres y sueldos de empleados: ");
        System.out.print("Id " + (i + 1) + ": ");
        id[i] = sc.nextInt();
        System.out.print("Nombre " + (i + 1) + ": ");
        nombre[i] = sc.nextLine();
        System.out.print("Apellido " + (i + 1) + ": ");
        apellido[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

        //se toma el primero leído como mayor
        mayorSueldo = sueldos[i];
        nombreMayor = apellido[i];

        //se leen el resto de empleados
        for (i = 1; i < apellido.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Nombre " + (i + 1) + ": ");
            nombre[i] = sc.nextLine();
            System.out.print("Apellido " + (i + 1) + ": ");
            apellido[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            //se compara el sueldo leído con el mayor actual
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = apellido[i];
            }
        }

        //mostrar resultados
        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }  
        
    }
    

