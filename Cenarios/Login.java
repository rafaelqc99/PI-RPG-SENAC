package Cenarios;

import java.util.Scanner;

public class Login {
	
	public static void Autenticacao() {
		String user = "SENAC";
		String password = "1234";
		String login, senha;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite o login: ");
			login = sc.nextLine();
			System.out.println("Digite a senha: ");
			senha = sc.nextLine();
			
	} while (!(login.equalsIgnoreCase(user) && senha.equalsIgnoreCase(password)));

}
	
}