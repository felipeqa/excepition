public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            // catch somente na classe Exception
        }catch (Exception ex){

            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyExceptionChecked {
        System.out.println("Ini do metodo1");
//        try {
            metodo2();
//        }catch (ArithmeticException ex){
//            System.out.println("ArithmethicException");
//        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyExceptionChecked {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //try {
                //int a = i / 0;
                Conta conta = new Conta();
                conta.deposita();
            //} catch (ArithmeticException ex){
               // System.out.println("ArithmethicException");
            //}
        }
        System.out.println("Fim do metodo2");
    }
}
