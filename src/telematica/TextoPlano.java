package telematica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextoPlano {

    File archivo;

    public TextoPlano(String path) {
        archivo = new File(path);
    }

    public void conteoDeCaracteres() {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int nletras = 0, nparrafos = 0;

            ArrayList<String> words = new ArrayList();
            ArrayList<String> rep = new ArrayList();
            ArrayList<Integer> nrep = new ArrayList();

            String line = br.readLine();

            while (line != null) {
                String[] word;
                word = line.split(" ");
                for (int i = 0; i < word.length; i++) {
                    if (!word[i].equals("")) {
                        if (words.contains(word[i])) {
                            if (rep.contains(word[i])) {
                                int index = rep.indexOf(word[i]);
                                nrep.set(index, nrep.get(index) + 1);
                            } else {
                                rep.add(word[i]);
                                nrep.add(2);
                            }
                        }
                        words.add(word[i]);
                    }
                }
                nparrafos++;
                line = br.readLine();
            }
            for (int i = 0; i < words.size(); i++) {
                nletras = nletras + words.get(i).length();
            }
            System.out.println("El numero de caracteres es: " + nletras);
            System.out.println("El numero de palabras es: " + words.size());
            System.out.println("El numero de palabras repetidas es: " + rep.size());
            for (int j = 0; j < rep.size(); j++) {
                System.out.println("La palabra " + rep.get(j) + " se repitio " + nrep.get(j) + " veces.");
            }
            System.out.println("El numero de parrafos es: " + nparrafos);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
