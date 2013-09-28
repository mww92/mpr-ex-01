import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Korzystając z mechanizmu kolekcji uzupełnij poniższy kod tak,
 * aby zanalizował plik „plik.txt” i wypisał na standardowym wyjściu
 * dwie listy:
 * 
 *    a) linii, które wystąpiły w pliku co najmniej dwa razy
 *    b) linii, które wystąpiły w pliku dokładnie raz
 */

public class Ex01 {

	public static void main(String[] args) {
		String fname = "plik.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fname));
			String word = br.readLine();
			while (word != null) {
				System.out.println(word);
				word = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nie mogę otworzyć pliku " + fname);
		} catch (IOException e) {
			System.out.println("Błąd podczas czytania z pliku" + fname);
		}
	}

}
