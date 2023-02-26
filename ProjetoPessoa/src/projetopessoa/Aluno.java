
package projetopessoa;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;
    public void cancerlarMatrc(){
        System.out.println("Matricula será cancelada");
    
}

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    void setNome(String maria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
