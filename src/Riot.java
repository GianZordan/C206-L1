// Classe filha
public class Riot extends Avaliadores{
    //Principal jogo criado pela empresa
    private String principalJogo;

    // Métodos da Riot

    // Reescrita - Particular para Riot (Polimorfismo)
    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Principal jogo criado pela Riot: "+this.principalJogo);
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
