
package programas;

import java.util.Scanner;

public class Ahorroeconomico {
//metodo de la clase
  public static void main(String [] args){
      System.out.println("Conociendo el lenguaje Java");
    //declarar variables
    String empleado;
    double ingreso,gasto,ahorrom,ahorroa;
    //crear un objetivo de lectura de datos
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.println("Ingresar nombre del empleado:");
    empleado=lectura.next();
    System.out.println ("Ingreso economico:");
    ingreso=lectura.nextDouble();
    System.out.println ("gasto economico:");
    gasto=lectura.nextDouble();
    //proceso de datos
    ahorrom=ingreso-gasto;
    ahorroa=ahorrom*12;
    //salida de datos
    System.out.println ("Resultado de la operacion:");
    System.out.println ("Ahorro mensual:"+ahorrom);
    System.out.println ("Ahorro anual:"+ahorroa);
   
  }
}
