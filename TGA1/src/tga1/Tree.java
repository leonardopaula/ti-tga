package tga1;

/**
 *
 * @author leonardo
 */
public class Tree {

    private Node raiz;
    
    private static Node nyt = new Node(0, Integer.MAX_VALUE);
 
    public Tree() {
        raiz = nyt;
    }
 
    public boolean estaVazio() {
        return raiz == nyt;
    }
    
    public void limpa() {
        raiz = nyt;
    }
 
    public void insere(int X, int WT) {
        raiz = insere(X, WT, raiz);
    }
    
    private Node insere(int X, int WT, Node T) {
        if (T == nyt)
            
            return new Node(X, WT, nyt, nyt);

        else if (X < T.getValor()) {
            
            T.setEsq( insere(X, WT, T.getEsq()) );
            
            if (T.getEsq().getPeso() < T.getPeso()) {
                Node L = T.getEsq();
                T.setEsq(L.getDir());
                L.setDir(T);
                    return L;
            }    
        } else if (X > T.getValor()) {
            
            T.setDir(insere(X, WT, T.getDir()));
            if (T.getDir().getPeso() < T.getPeso()) {
                Node R = T.getDir();
                T.setDir(R.getEsq());
                R.setEsq(T);
                    return R;
            }
        }
        return T;
    }
    
    public int contaNos() {
        return contaNos( raiz );
    }

    private int contaNos(Node r) {
        if (r == nyt) return 0;
        else {
            int l = 1;
            l += contaNos(r.getEsq());
            l += contaNos(r.getDir());
            return l;
        }
    }

    public boolean procura(int val) {
         return procura(raiz, val);
    }
    
    private boolean procura(Node r, int val) {

        boolean achou = false;
        
        while ((r != nyt) && !achou) {
            
            int rval = r.getValor();
            if (val < rval)
                r = r.getEsq();
            else if (val > rval)
                r = r.getDir();
            else {
                achou = true;
                break;
            }
            achou = procura(r, val);
        }

        return achou;
    }
    
    public void inorder() {
        inorder(raiz);
    }
    
    private void inorder(Node r) {
        if (r != nyt) {
            
            inorder(r.getEsq());
            System.out.print(r.getValor() +" ");
            inorder(r.getDir());
        }
     }
}