import javax.sound.midi.Soundbank;

public class Conta {

    public void deposita() throws MyExceptionChecked{

        throw new MyExceptionChecked("Deu ruim hein");

        //System.out.println("Aqui não vai ser executado");

    }

    public void setNome() throws MyExceptionUncheked{

        throw new MyExceptionUncheked("Agora lascou tudo!!!");

        //System.out.println("Aqui não vai ser executado");

    }
}
