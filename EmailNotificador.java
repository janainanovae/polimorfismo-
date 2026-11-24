// Implementação de Notificador que simula o envio por e-mail
public class EmailNotificador implements Notificador {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[E-mail] Enviando e-mail: " + mensagem);
    }
}
