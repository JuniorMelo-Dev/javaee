package array;

public class ArrayAula3 {

	public static void main(String[] args) {
		String[][] agenda = { { "Junior", "99999-9999", "junior@gmail.com" },
				{ "Bernardo", "98888-8888", "bernardo@gmail.com" }, { "Luana", "97777-7777", "luana@gmail.com" } };

		// retornando email do índice [0]
		System.out.println(agenda[0][2]);
		
		// retornando todas as linhas do array usando 'for'
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}

}
