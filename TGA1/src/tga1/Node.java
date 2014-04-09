package tga1;

/**
 *
 * @author leonardo
 */
public class Node {

    private Node     esq;
    private Node     dir;
    private int     peso;
    private int    valor;
    
    public Node(int valor, int peso) {
        this(valor, peso, null, null);
    } 

    public Node(int valor, int peso, Node esq, Node dir) {
        this.valor = valor;
        this.esq   = esq;
        this.dir   = dir;
        this.peso  = peso;
    }

    public Node getEsq() {
        return esq;
    }

    public Node getDir() {
        return dir;
    }

    public int getPeso() {
        return peso;
    }

    public int getValor() {
        return valor;
    }

    public void setEsq(Node esq) {
        this.esq = esq;
    }

    public void setDir(Node dir) {
        this.dir = dir;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}