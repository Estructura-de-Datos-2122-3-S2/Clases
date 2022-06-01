
package telephonequeues;

public class TelephoneQueues {

    public static void main(String[] args) {
        Listas listaCliente = new Listas(null);
        PilasListImpl pilaRegalo = new PilasListImpl();
        for(int i = 0; i<10; i++){
            Cliente cliente = new Cliente(i);
            listaCliente.insertarFinal(cliente);
            
            Regalo regalo = new Regalo(i);
            pilaRegalo.push(regalo);
            
        }
        for(int i = 0; i<10; i++){
            Cliente cliente = new Cliente(i);
            listaCliente.insertarFinal(cliente);   
        }
        
        asignarRegalos(listaCliente,pilaRegalo);
        
        
    }

    private static void asignarRegalos(Listas listaCliente, PilasListImpl pilaRegalo) {
        NodoLista temp = listaCliente.getCabeza();
        ColaListImp colaClientes = new ColaListImp();
        while(temp != null){
            if(!pilaRegalo.isEmpty()){
                if (!estaEnCola(temp.getElemento(), colaClientes)){
                    temp.getElemento().setRegalo(pilaRegalo.getPeek().getElement());
                    pilaRegalo.pop();
                    colaClientes.encolar(temp.getElemento());
                }
            }
            temp = temp.getSiguiente();
        }
        NodoCola temp2 = colaClientes.getCabeza();
        while(temp2 != null) {
            System.out.println("El cliente "+ temp2.getElemento().getId()+ " Recibio el regalo "+temp2.getElemento().getRegalo().getId());
            temp2 = temp2.getSiguiente();
        }
    }

    private static boolean estaEnCola(Cliente elemento,ColaListImp cola) {
        NodoCola temp = cola.getCabeza();
        while(temp != null) {
            if (temp.getElemento().getId() == elemento.getId()){
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }
    
}
