package Estructuras_de_datos;

public class nodo<t> {
    public t dato;
    public nodo<t> next;
    public nodo(){
        dato=null;
        next=null;
    }
    public nodo(t dato){
        this.dato=dato;
        next=null;
    }
}
