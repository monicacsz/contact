package contact;



public class Telefon {
	public static void main(String[] args) {
		
		String[][] contacts = {{"Joao", "Sao Paulo", "(11) 9999-5241"}, {"Maria", "Ribeirao Preto", "(16) 9999-8596"}, {"Ana", "Manaus", "(92) 9999-8574"}};
		for(int i = 0; i < contacts.length; i++) {
			for(int j = 0; j < contacts[i].length; j++) {
				System.out.println(contacts[i][j]);
		}
		}
		/*
		int count = 0;
		
		String [][] contacts = new String[3][3];
		contacts[0][0] = "Joao";
		contacts[0][1] = "Sao Paulo";
		contacts[0][2] = "(11) 9999-5241";
		
		contacts[1][0] = "Maria";
		contacts[1][1] = "Ribeirao Preto"; 
		contacts[1][2] = "(16) 9999-8596";
		
		contacts[2][0] = "Ana";
		contacts[2][1] = "Manaus";
		contacts[2][2] = "(92) 9999-8574";
		
		for (int i = 0; i < contacts.length; count++) {
			System.out.println("Name: " + contacts[count][0] + "\n" + "Location: " + contacts[count][1] + "\n" + "Telefon: " + contacts[count][2]);
		
		
		}
	 */
		
	}

	}
