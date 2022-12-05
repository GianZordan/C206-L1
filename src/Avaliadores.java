// Classe mãe
public class Avaliadores {

    // Atributos dos avaliadores
    private String nome;
    private int anosExperiencia;

    // Método do avaliador
    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Anos de experiência: "+this.anosExperiencia);
    }

    public void avaliar(){
        System.out.println("Nota de avaliação");
   }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    
}
