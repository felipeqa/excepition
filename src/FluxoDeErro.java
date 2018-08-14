public class FluxoDeErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MyExceptionUncheked ex){

            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//        try {
            metodo2();
//        }catch (ArithmeticException ex){
//            System.out.println("ArithmethicException");
//        }
        System.out.println("Fim do metodo1");
    }

    //recursive call
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
    }
}
