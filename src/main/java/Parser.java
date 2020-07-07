import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws IOException {

       Document doc = Jsoup.connect("https://www.anekdot.ru").get();

        Elements text = doc.getElementsByClass("text");
      int i =0;
        for (Element x:text) {
            if(i<5){
                System.out.println(x.text());
                System.out.println();
                i++;
            }
        }

    }

    }

