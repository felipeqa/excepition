public class TestaContaExcecaoCheckedUsandoTryCatch {

    public static void main(String[] args) {
        Conta conta = new Conta();

        try{
            conta.deposita();
        } catch (MyExceptionChecked ex){
            String msg = ex.getMessage();
            System.out.println(msg);
        }

    }
}
