public class FluxoExceptionChecked {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MyExceptionChecked ex){

            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    // Add a exceção a assinatura do método
    private static void metodo1() throws MyExceptionChecked {
        System.out.println("Ini do metodo1");
//        try {
            metodo2();
//        }catch (ArithmeticException ex){
//            System.out.println("ArithmethicException");
//        }
        System.out.println("Fim do metodo1");
    }

    // Add a exceção a assinatura do método
    private static void metodo2() throws MyExceptionChecked {
        System.out.println("Ini do metodo2");{
            //Exemplo de exceção que é checada pelo compilador
            throw new MyExceptionChecked("Exception CHECKED");
        }

    }
}
