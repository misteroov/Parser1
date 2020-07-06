import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.anekdot.ru/").get();

        for (int i = 0; i < 5; i++) {


            String body = doc.getElementsByAttributeValue("class", "text").get(i).html();
            System.out.println(body);
            System.out.println();
        }
    }

    }

