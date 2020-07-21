
import org.glassfish.jersey.server.Uri;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс-обработчик поступающих к боту сообщений.
 */
public class EchoBot extends TelegramLongPollingBot {
    Document doc;

    {
        try {

            doc = Jsoup.connect("https://www.anekdot.ru").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Element text = doc.getElementsByClass("text").first();
    String t = text.text();

    /**
     * Метод, который возвращает токен, выданный нам ботом @BotFather.
     * @return токен
     */
    @Override
    public String getBotToken() {
        return System.getenv("token");
    }

    /**
     * Метод-обработчик поступающих сообщений.
     * @param update объект, содержащий информацию о входящем сообщении
     */
    @Override
    public void onUpdateReceived(Update update) {
      String message = t;

      if (!update.getMessage().toString().equals("/start")){
          sendMsg(update.getMessage().getChatId().toString(), message);
      }
    }
    public synchronized void sendMsg(String chatId, String s){
        SendMessage sendMessage = new SendMessage();
        Message mess = new Message();

        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        setButtons(sendMessage);

        try {
            execute(sendMessage);

        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
    public synchronized void setButtons(SendMessage sendMessage){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<KeyboardRow>();
        KeyboardRow keyboardFrist = new KeyboardRow();
        keyboardFrist.add("Привет");

        KeyboardRow keyboardSecond = new KeyboardRow();
        keyboardSecond.add("Пока");

        keyboard.add(keyboardFrist);
        keyboard.add(keyboardSecond);
        replyKeyboardMarkup.setKeyboard(keyboard);

    }

    /**
     * Метод, который возвращает имя пользователя бота.
     * @return имя пользователя
     */
    @Override
    public String getBotUsername() {
        return System.getenv("name");
    }
}