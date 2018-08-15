public class TestaContaExcecaoUncheckedUsandoThrows {

    public static void main(String[] args) {

        Conta conta = new Conta();
        try {
            conta.setNome();
        } catch (MyExceptionUncheked ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Deu certo");
    }
}
