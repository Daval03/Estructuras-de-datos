package Estructuras_de_datos;
public class calculadora{

    public calculadora(){}
    public int resta(int dato, int dato2){
        return dato-dato2;
    }
    public int suma(int dato, int dato2){
        return dato+dato2;
    }
    public int Division(int dato, int dato2){return dato/dato2; }
    public int Multiplicacion(int dato, int dato2){ return dato*dato2; }

//    public static void main(String [] args){
//        int Digito1,Digito2,res,modulo;
//        boolean flag=false;
//        System.out.print("Hola, ingrese la accione que desea realizar \n 1)Sumar \t 2)Restar \n 3)Multiplicar \t 4) Dividir \n");
//        while (true) {
//            if (flag) {
//                System.out.print("Vuelva a ingrear una modalida: ");
//            }flag = true;
//            Scanner scanner = new Scanner(System.in);
//            modulo = scanner.nextInt();
//            System.out.print("Ingrese el primer digito: ");
//            Scanner scanner1 = new Scanner(System.in);
//            Digito1 = scanner1.nextInt();
//            System.out.print("Ingrese el segundo digito: ");
//            Scanner scanner2 = new Scanner(System.in);
//            Digito2 = scanner2.nextInt();
//            if (modulo == 1) {
//                res = Digito1 + Digito2;
//            } else if (modulo == 2) {
//                res = Digito1 - Digito2;
//            } else if (modulo == 3) {
//                res = Digito1 * Digito2;
//            } else {
//                res = Digito1 / Digito2;
//            }
//            System.out.print(res + "\n");
//        }
//    }
}
