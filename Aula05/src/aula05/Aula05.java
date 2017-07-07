
package aula05;


public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1=new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.AbrirConta("CC");
        p1.estadoAtual();
        
        
        
    }
    
}
