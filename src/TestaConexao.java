public class TestaConexao {

    public static void main(String[] args) {
        Conexao con = new Conexao();

        try{
            con.leDados();
        }catch(IllegalStateException ex){
            System.out.println("Deu ruim na conexão");;
        }finally {
            con.fecha();
        }
    }
}
