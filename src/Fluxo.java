public class Fluxo {

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

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new MyExceptionUncheked("Algo deu errado aqui! vou lançar minha exceção!");

        //System.out.println("Fim do metodo2");
    }
}
