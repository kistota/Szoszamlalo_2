import javafx.event.ActionEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;


public class Main {



    public HashMap<String, Integer> Szokereso(String location) {


//Szótár, amiben majd a szavakat tároljuk, string kulcs és egész értékkel
        HashMap<String, Integer> szavak = new HashMap<String, Integer>();
        try {

            FileReader fr = new FileReader(location);
            BufferedReader br = new BufferedReader(fr);
            String s;
//Amíg tudunk újabb sorokat beolvasni addig olvasunk
            while ((s = br.readLine()) != null) {

                s = s.replaceAll("[^A-Za-z0-9 ]", "");

                s = s.toLowerCase();

                String[] words = s.split(" ");

                for (String w : words)

                    if (szavak.containsKey(w))
                        szavak.put(w, szavak.get(w) + 1);
//Ha még nem volt benne akkor belerakjuk 1-el
                    else
                        szavak.put(w, 1);
            }
//Lezárjuk a streamet, es kiirjuk
            br.close();

            return szavak;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }




}

