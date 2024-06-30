package Service;

import File.WorkingFiles;
import Parse.ParseDate;
import Parse.ParseGender;
import Parse.ParseName;
import Parse.ParseNumberTelephone;
import User.User;

import java.util.List;
import java.util.Scanner;

public class Service {
    private ParseName parseName = new ParseName();
    private ParseDate parseDate = new ParseDate();
    private ParseNumberTelephone parseNumberTelephone = new ParseNumberTelephone();
    private ParseGender parseGender = new ParseGender();

    public void setParseGender(User user, List<String> parametersList) {// Работа с полом
        parseGender.setParseGender(user, parametersList);
    }

    public String getParseGender(User user) {
        return parseGender.getParseGender(user);
    }

    public void parseNumberTelephone(User user, List<String> parameterList) {// Работа с номером телефона
        parseNumberTelephone.parseTelephone(user, parameterList);
    }

    public String getParseTelephone(User user) {
        return parseNumberTelephone.getParseTelephone(user);
    }

    public void parseDate(User user, List<String> parametersList) {// Работа с Датой рождения
        parseDate.parseDate(user, parametersList);
    }

    public String getParseDate(User user) {
        return parseDate.getParseDate(user);
    }

    public void parseName(User user, List<String> str) {// Работа с Фамилией Именем Отчеством
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
