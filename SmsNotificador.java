// Implementação de Notificador que simula o envio por SMS
public class SmsNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[SMS] Enviando SMS: " + mensagem);
    }
}
