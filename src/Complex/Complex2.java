package Complex;

import java.util.Scanner;
public class Complex2 {

    public static void main(String[] args) {
        Complex1 objeto1 = new Complex1();
        Scanner entrada1 = new Scanner(System.in); 
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in); 
        Scanner entrada4 = new Scanner(System.in);
        
        /*Definicion del primer numero complejo */
        System.out.println("Ingreso de datos para el primer complejo (a , bj)");
        System.out.println("Ingrese la parte real (a): ");
        float numero1 = entrada1.nextFloat();

        System.out.println("Ingrese la parte imaginaria (b): ");
        float numero2 = entrada2.nextFloat();

        /*Definicion del segundo numero complejo */
        System.out.println("Ingreso de datos para el segundo complejo (a , bj)");
        System.out.println("Ingrese la parte real (a): ");
        float numero3 = entrada3.nextFloat();

        System.out.println("Ingrese la parte imaginaria (b): ");
        float numero4 = entrada4.nextFloat();

        /*Impresion de los numeros complejos */
        objeto1.setEntero(numero1);
        objeto1.setComplejo(numero2);

        objeto1.setEntero1(numero3);
        objeto1.setComplejo1(numero4);

        System.out.println("El primer numero complejo es: (" +objeto1.getEntero()+" , "+objeto1.getComplejo()+"j)");
        System.out.println("El segundo numero complejo es: (" +objeto1.getEntero1()+" , "+objeto1.getComplejo1()+"j)");

        /*Suma*/
        float suma= objeto1.getEntero() + objeto1.getEntero1();
        float suma2= objeto1.getComplejo() + objeto1.getComplejo1();

        /*Resta*/
        float resta= objeto1.getEntero() - objeto1.getEntero1();
        float resta2= objeto1.getComplejo() - objeto1.getComplejo1();

        /*Multiplicacion*/
        float multiplicacion= objeto1.getEntero() * objeto1.getEntero1();
        float multiplicacion2= objeto1.getComplejo() * objeto1.getComplejo1();

        /*Division*/
        float division= objeto1.getEntero() / objeto1.getEntero1();
        float division2= objeto1.getComplejo() / objeto1.getComplejo1();

        /*Comparacion
        float comp = objeto1.getEntero();objeto1.getComplejo();
        float comp1 = objeto1.getEntero1();objeto1.getComplejo1();
        */

        /*Polar */
        double pol= Math.sqrt(Math.pow(objeto1.getEntero(),2)+Math.pow(objeto1.getComplejo(),2));
        double pol1= Math.sqrt(Math.pow(objeto1.getEntero1(),2)+Math.pow(objeto1.getComplejo1(),2));

        double ang= Math.toDegrees(Math.atan(objeto1.getComplejo() / objeto1.getEntero()));
        double ang1= Math.toDegrees(Math.atan(objeto1.getComplejo1() / objeto1.getEntero1()));

        System.out.println("Polar Primer Numero: "+pol +"("+ang+")");
        System.out.println("Polar Segundo Numero: "+pol1 +"("+ang1+")");

        if(suma==(suma2)){
            System.out.println("Comparacion: son iguales");
        }else{
            System.out.println("Comparacion: son diferentes");
        }

        System.out.println("Suma: ("+suma +" , " +suma2 +"j)");
        System.out.println("Resta: ("+resta +" , " +resta2 +"j)");
        System.out.println("Multiplicacion: ("+multiplicacion +" , " +multiplicacion2 +"j)");
        System.out.println("Division: ("+division +" , " +division2 +"j)");
    }
    
}
