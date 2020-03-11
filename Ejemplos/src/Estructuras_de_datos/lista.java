package Estructuras_de_datos;

public class lista<t> {
    private nodo<t> first;
    private nodo<t> last;
    int size;
    public lista() {
        first=null;
        last=null;
        size=0;
    }
    public lista(t dato){
        nodo<t> temp=new nodo(dato);
        first=temp;
        last=first;
        size++;
    }
    public void addDato(t dato){
        nodo<t> temp =new nodo(dato);
        if(first==null){
            first=temp;
            last=temp;
        }else{
            last.next=temp;
            last=temp;
        }size++;
    }
    public t findDato(int posicion){
        nodo<t> temp=first;
        for(int i=0;i<size;i++){
            if(i==posicion){
                return temp.dato;
            }temp=temp.next;
        }return null;
    }
}