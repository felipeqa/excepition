public class Conexao {

    public Conexao(){
        System.out.println("Abrindo Conexão:");
    }

    public void leDados(){
        System.out.println("Lendo dados");
        throw new IllegalStateException();
    }

    public void fecha(){
        System.out.println("Fecha conexão");
    }
}
