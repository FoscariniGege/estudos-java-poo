import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        String senhaCorreta = "1234";
        String tentativaSenha;
        Scanner ler = new Scanner(System.in);
        System.out.println("Coloque a senha: ");
        tentativaSenha = ler.nextLine();
        while (!senhaCorreta.equals(tentativaSenha)) {
            System.out.println("Senha Incorreta ");
            tentativaSenha = ler.nextLine();
        }
        System.out.println("Senha Correta");
         ler.close();
    }
}
