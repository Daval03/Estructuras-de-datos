//package Estructuras_de_datos;
//import java.util.Scanner;
//public class Main{
//    public static  void main(String [] args){
//        int dato1,dato2,respuesta,modalidad;
//        boolean flag=false;
//        System.out.print("Hola, ingrese la accione que desea realizar \n 1)Sumar \t 2)Restar \n 3)Multiplicar \t 4) Dividir \n");
//        while (true){
//            if(flag){
//                System.out.print("Vuelva a ingrear una modalida: ");
//            }flag=true;
//            Scanner scanner = new Scanner(System.in);
//            modalidad =scanner.nextInt();
//            System.out.print("Ingrese el primer digito: ");
//            Scanner scanner1 = new Scanner(System.in);
//            dato1=scanner1.nextInt();
//            System.out.print("Ingrese el segundo digito: ");
//            Scanner scanner2 = new Scanner(System.in);
//            dato2=scanner2.nextInt();
//            if(modalidad==1){
//                respuesta=dato1+dato2;
//            }else if(modalidad==2){
//                respuesta=dato1-dato2;
//            }else if(modalidad==3){
//                respuesta=dato1*dato2;
//            }else{
//                respuesta=dato1/dato2;
//            }System.out.print(respuesta+"\n");
//        }
//    }
//}
