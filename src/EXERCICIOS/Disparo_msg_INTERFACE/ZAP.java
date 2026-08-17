package EXERCICIOS.Disparo_msg_INTERFACE;

public record ZAP() implements DispararMensagem {




    @Override
    public String Dispararmensagem(String mensagem) {
        return "Enviando mensagem no whatsapp: " +mensagem;
    }
}
