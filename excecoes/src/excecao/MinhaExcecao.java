package excecao;

public class MinhaExcecao {


	public static String tratar(Exception e) {
		if (e instanceof NumberFormatException) {
			return "Número invalido";
		}else if (e instanceof NullPointerException) {
			return "Objeto nulo";
		}else if ( e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";

		}else {
			e.printStackTrace();
			return "Erro desconhecido!";
		}

	}

}


