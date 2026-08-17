package EXERCICIOS.Disparo_msg_INTERFACE;

public record SMS() implements DispararMensagem {


    @Override
    public String Dispararmensagem(String mensagem) {
        return "Enviando mensagem SMS: " +mensagem;
    }
}
