package colas;

public interface ICola {
    void encolar(Object elemento);
    void desencolar();
    Object consultar();
    boolean estaVacio();
    Object despachar();
}
