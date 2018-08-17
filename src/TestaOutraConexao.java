public class TestaOutraConexao {

    public static void main(String[] args) {
        try(OutraConexao con = new OutraConexao()) {
            con.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Algum erro aconteceu!!!!");
        }
    }
}
