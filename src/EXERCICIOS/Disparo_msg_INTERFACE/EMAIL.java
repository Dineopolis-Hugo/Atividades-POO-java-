package EXERCICIOS.Disparo_msg_INTERFACE;

public record EMAIL() implements DispararMensagem {


    @Override
    public String Dispararmensagem(String mensagem) {
        return "Enviando mensagem no email: " +mensagem;
    }
}
