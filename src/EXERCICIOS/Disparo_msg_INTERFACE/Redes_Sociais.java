package EXERCICIOS.Disparo_msg_INTERFACE;

public record Redes_Sociais() implements DispararMensagem {


    @Override
    public String Dispararmensagem(String mensagem) {
        return "Enviando mensagem nas redes sociais: " +mensagem;
    }
}
