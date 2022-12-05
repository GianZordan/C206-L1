import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    public void escrever(Jogo jogo){
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;

        try{
            // Abrindo a saída de dados
            os=new FileOutputStream("Jogos.txt",true); // Nome do arquivo onde será salvo
            osw=new OutputStreamWriter(os);
            bw= new BufferedWriter(osw);

            // Flag que indica onde começa as informações dos jogos
            bw.write("++ Jogos ++\n");
            bw.write(jogo.getNomeJogo()+"\n");
            bw.write(jogo.getGeneroJogo()+"\n");

        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 2. Método ler

    public ArrayList<Jogo> ler(){

        // ArrayList auxiliar para salvar jogos encontrados no arquivo
        ArrayList <Jogo> encontreiNoArquivo=new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try{
            // Instanciando os objetos
            is=new FileInputStream("Jogos.txt");
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer=br.readLine();

            while(linhaLer!=null){
                // Comparando se o que está em linhaLer é igual a minha flag
                if(linhaLer.contains("++ Jogos ++")){
                    // Variável auxiliar de funcionario
                    Jogo f1=new Jogo();
                    f1.setNomeJogo(br.readLine());
                    f1.setGeneroJogo(br.readLine());

                    // Adicionando o jogo no array
                    encontreiNoArquivo.add(f1);
                }
                linhaLer=br.readLine();
            }

        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }

        return encontreiNoArquivo;
    }

    public boolean exists() {
        return false;
    }

    public void delete() {
    }
}
