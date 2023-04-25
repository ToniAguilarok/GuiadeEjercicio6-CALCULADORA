package guiadeejercicio6;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double num1=0;
        double num2=0;
        double operacion=0;
        double bandera=0;
        String continua1="b";
        String continua = null;
        
        System.out.println("Bienvenido a la calculadora por consola\n");
        
                
        System.out.println("Ingrese el numero 1");     
        Scanner teclado = new Scanner (System.in);
        num1= teclado.nextInt();
        
        System.out.println("Ingrese el numero 2");     
        Scanner teclado1 = new Scanner (System.in);
        num2= teclado.nextInt();
        
        System.out.println("\n\nEliga una opcion a realizar\n1.SUMAR\n2.RESTAR\n3.MULTIPLICAR\n4.DIVIDIR\n5.SALIR");     
        Scanner teclado2 = new Scanner (System.in);
        operacion= teclado.nextInt();
        
        
         Operacion opera1 = new Operacion();

        do{ 
        if (operacion==1){
            System.out.println("\nEl resultado es: "+opera1.sumar(num1, num2)+"\n");
            bandera=1;            
            continua1="a";
            operacion=5;
            System.out.println("¿Desea continuar?  S/N");
        }
        if (operacion==2){
            System.out.println("\nEl resultado es: "+opera1.restar(num1, num2)+"\n");
            bandera=1;
            continua1="a";
            operacion=5;
            System.out.println("¿Desea continuar?  S/N");
        }
        
        if (operacion==3){
            System.out.println("\nEl resultado es: "+opera1.multiplicar(num1, num2)+"\n");
            bandera=1;            
            continua1="a";
            operacion=5;
            System.out.println("¿Desea continuar?  S/N");
        }
           
        if (operacion==4){
            System.out.println("\nEl resultado es: "+ opera1.dividir(num1, num2)+"\n");
            bandera=1;            
            continua1="a";
            operacion=5;
            System.out.println("¿Desea continuar?  S/N");
            

        }      if (continua1.equals("a")){                
                Scanner teclado3 = new Scanner (System.in);
                continua= teclado.nextLine();
                operacion=0;
                }
   
            if (continua.equals("n") || continua.equals ("N")){
            operacion=5;       
            }
        
        if (continua.equals("s")||continua.equals("S")){
            num1=opera1.resultado;
            
            System.out.println("\n\nEliga una opcion a realizar\n1.SUMAR\n2.RESTAR\n3.MULTIPLICAR\n4.DIVIDIR");     
            Scanner teclado4 = new Scanner (System.in);
            operacion= teclado.nextInt();
            
            
            System.out.println("Ingrese numero");     
            Scanner teclado5 = new Scanner (System.in);
            num2= teclado.nextInt();
        }
        
        
       
        
    }while (operacion!=5);

    }
}
