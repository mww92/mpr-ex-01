
package mpr.exs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

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
		 Set<String> poj = new TreeSet<String>();
         Set<String> pod = new TreeSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fname));
			String word = br.readLine();
			while (word != null) {
				 if (!poj.add(word)) {
                     pod.add(word);
             }
             word = br.readLine();
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nie mogę otworzyć pliku " + fname);
		} catch (IOException e) {
			System.out.println("Błąd podczas czytania z pliku" + fname);
		}
		System.out.println("Pojedyncze:");
		for(String s : poj) {
             System.out.println(s);  }
		 		System.out.println();
     
		 System.out.println("Podwojne:");
		 for(String d : pod) {
			 System.out.println(d);  }
		 		System.out.println();
	}

}



