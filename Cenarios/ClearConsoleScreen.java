package Cenarios;

public class ClearConsoleScreen {
	
	public static void limparTela() {
		try {
			new ProcessBuilder("cmd", "/c", "cls")
				.inheritIO()
				.start().waitFor();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}