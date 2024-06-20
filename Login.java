import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("Digite o nome de usuário:");
            String usuario = scanner.nextLine();

            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
                    System.out.println("Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Você excedeu o número de tentativas permitidas. Acesso bloqueado.");
                }
            }
        }

        scanner.close();
    }
}