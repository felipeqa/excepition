public class OutraConexao implements AutoCloseable{

    public OutraConexao(){
        System.out.println("Abrindo Conexão");
    }

    public void leDados(){
        System.out.println("Lendo Dados agora:");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Fechando Conexão");
    }
}
