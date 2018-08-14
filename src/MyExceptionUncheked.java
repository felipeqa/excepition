//Exceção do tipo Unchecked pois estende da classe RuntimeException
public class MyExceptionUncheked extends RuntimeException {

    public MyExceptionUncheked(String msg){
        super(msg);
    }
}
