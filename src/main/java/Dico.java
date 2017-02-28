import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by jbarron on 21/02/17.
 */
public class Dico {

    ArrayList dictionnaire = new ArrayList();

    public Dico() {
        this.getWords();
    }

    public void getWords(){

        try {
            BufferedReader in = new BufferedReader(new FileReader("src/main/resources/dico.txt"));
            // Pour en ligne de commande : BufferedReader in = new BufferedReader(new FileReader("../resources/dico.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

