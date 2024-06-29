package Service;

import Parse.ParseDate;
import Parse.ParseName;
import Parse.ParseNumberTelephone;
import User.User;

import java.util.List;
import java.util.Scanner;

public class Service {
    private ParseName parseName = new ParseName();
    private ParseDate parseDate = new ParseDate();
    private ParseNumberTelephone parseNumberTelephone = new ParseNumberTelephone();

    public void parseNumberTelephone(User user, List<String> parameterList) {
        parseNumberTelephone.parseTelephone(user, parameterList);
    }

    public void parseDate(User user, List<String> parametersList) {
        parseDate.parseDate(user, parametersList);
    }

    public void parseName(User user, List<String> str) {
        parseName.parseName(user, str);
    }

    public String requestForParameters() {// Запрос параметров из консоли
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public List<String> splitString(String str) {// Сплит строки
        List<String> list;
        list = List.of(str.split(" "));
        return list;
    }

    public int checkingTheNumberOfParameters(List<String> list) {// Проверка количества введенных параметров
        if (list.size() < 6) {
            return -99;
        }
        if (list.size() > 6) {
            return -77;
        }
        return 0;
    }
}
