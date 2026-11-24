public class UsuarioService {

    // Depende da abstração (interface), e não de uma implementação concreta
    private final Notificador notificador;

    // Injeção de dependência via construtor: quem cria o serviço escolhe o canal
    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("Usuário " + nome + " registrado.");
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}
