import java.util.Scanner;

public class First {
  public static void main(String[] args) {
    String nomeDoUser = "";
    int oldUser = 0;

    System.out.println("Digite o seu nome");

    Scanner scanner = new Scanner(System.in);
    nomeDoUser = scanner.nextLine();

    System.out.println("Digite sua idade");
    oldUser = scanner.nextInt();

    System.out.println("O nome do user eh" + nomeDoUser + "e idade" + oldUser);
  }
}
