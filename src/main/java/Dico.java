import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

            //int i=0;

            String word;
            while((word = in.readLine()) != null) {

                //System.out.println(word);

                this.dictionnaire.add(word);

                /*System.out.println("test " + this.dictionnaire.get(i));
                i++;*/
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean checkWord(String word) {

        int i;
        String check;

        for (i=0; i < 48287; i++){
            check = (String) this.dictionnaire.get(i);

            if(check.equals(word)) {

                System.out.println("true");

                return true;
            }
        }

        System.out.println("false");

        return false;
    }
}

