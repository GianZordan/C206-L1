// Classe filha
public class Rockstar extends Avaliadores{
    //Principal jogo criado pela empresa
    private String principalJogo;

    // Métodos da Rockstar

    // Reescrita - Particular para Rockstar (Polimorfismo)
    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Principal jogo criado pela Rockstar: "+this.principalJogo);
        System.out.println();
    }

    // Getters and setters

    public String getPrincipalJogo() {
        return principalJogo;
    }

    public void setPrincipalJogo(String principalJogo) {
        this.principalJogo = principalJogo;
    }
}
