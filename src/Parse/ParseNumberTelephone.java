package Parse;

import User.User;

import java.util.List;

public class ParseNumberTelephone {
    public void parseTelephone(User user, List<String> parametersList) {
        if (parametersList.get(4).length() < 11 || parametersList.get(4).length() > 11) {
            throw new RuntimeException("Введено неправильное количество цифр в номер телефона");
        }
        try {
            long number = Long.parseLong(parametersList.get(4));
            user.setPhoneNumber(number);
        } catch (RuntimeException e) {
            throw new RuntimeException("Не удалось присвоить номер телефона : " + e);
        }
    }
}
