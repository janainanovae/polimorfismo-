// Implementação de Notificador que simula o envio por WhatsApp
public class WhatsappNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[WhatsApp] Enviando mensagem no WhatsApp: " + mensagem);
    }
}
