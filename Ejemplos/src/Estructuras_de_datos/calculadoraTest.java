package Estructuras_de_datos;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
class calculadoraTest {
    calculadora calc=new calculadora();
    @Test
    public void resta() {
        calc.resta(100,50);
        calc.resta(20,60);
    }
    @Test
    public void suma(){
        calc.suma(100,60);
        calc.suma(40,50);
    }
    @Test
    public void division(){
        calc.Division(50,5);
        calc.Division(70,6);
    }
    @Test
    public void multiplicacion(){
        calc.Multiplicacion(40,5);
        calc.Multiplicacion(10,60);
    }
}