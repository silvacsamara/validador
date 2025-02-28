import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuarioCorreto = "samaraC24";
        String senhaCorreta = "SamaraTeste24";

        System.out.println("Digite seu nome de usuário: ");
        String usuario = entrada.next();

        System.out.print("Digite sua senha: ");
        String senha = entrada.next();

        if (usuario.equals(usuarioCorreto) && (senha.equals(senhaCorreta))) {
            System.out.print("Que bom ter você por aqui! Aproveite a plataforma! ;)");
        } else {
            System.out.print("Opa! Nome de usuário/senha estão incorretos!");
        }
    }
}
