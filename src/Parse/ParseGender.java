package Parse;

import User.User;

import java.util.List;

public class ParseGender {
    public void setParseGender(User user, List<String> parametersList) {
        if (parametersList.get(5).length() > 1) {
            throw new RuntimeException("Параметр Пол должен содержать только один символ");
        }
        char gender = parametersList.get(5).toLowerCase().charAt(0);
        if (gender=='f' || gender=='m'){
            user.setGender(gender);
        }else {
            throw new RuntimeException("Неверный символ Пола");
        }
    }
}
