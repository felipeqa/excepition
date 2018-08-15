public class TestaContaExcecaoCheckedUsandoThrows {

    public static void main(String[] args) throws MyExceptionChecked {
        Conta conta = new Conta();
            conta.deposita();
        System.out.println("Deu certo");
    }
}
