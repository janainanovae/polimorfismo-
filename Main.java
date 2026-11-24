public class Main {

    public static void main(String[] args) {
        // Mesma lógica de registro, canais diferentes: UsuarioService não sabe qual está usando
        new UsuarioService(new EmailNotificador()).registrar("João");
        System.out.println();

        new UsuarioService(new SmsNotificador()).registrar("Pedro");
        System.out.println();

        new UsuarioService(new WhatsappNotificador()).registrar("Maria");
    }
}
