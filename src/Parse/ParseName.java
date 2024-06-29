package Parse;

import User.User;

import java.util.List;

public class ParseName {
    public void parseName(User user, List<String> str) {
        try {
            user.setLastName(str.get(0));
            user.setFirstName(str.get(1));
            user.setPatronymic(str.get(2));
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Не удалось присвоить имя, выход за пределы массива :" + e);
        }
    }
}