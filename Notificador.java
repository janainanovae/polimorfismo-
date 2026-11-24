// Contrato que todo canal de notificação precisa seguir
public interface Notificador {

    void enviarMensagem(String mensagem);
}
