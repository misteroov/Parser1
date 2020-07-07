import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;



import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();
        botsApi.registerBot(new EchoBot());
    }
}

//       Document doc = Jsoup.connect("https://www.anekdot.ru").get();
//
//        Elements text = doc.getElementsByClass("text");
//      int i =0;
//        for (Element x:text) {
//            if(i<5){
//                System.out.println(x.text());
//                System.out.println();
//                i++;
//            }
//        }




