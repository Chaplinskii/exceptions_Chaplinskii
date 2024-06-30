package Controller;

import Service.Service;
import User.User;

import java.util.List;

public class Controller {
    Service service = new Service();

    public String requestForParameters() {
        return service.requestForParameters();
    }

    public List splitString(String str) {
        return service.splitString(str);
    }

    public int checkingTheNumberOfParameters(List<String> list) {
        return service.checkingTheNumberOfParameters(list);
    }

    public void parseName(User user, List<String> str) {
        service.parseName(user, str);
    }

    public void parseDate(User user, List<String> parametersList) {
        service.parseDate(user, parametersList);
    }

    public void parseNumberTelephone(User user, List<String> parameterList) {
        service.parseNumberTelephone(user, parameterList);
    }

    public void setParseGender(User user, List<String> parametersList) {
        service.setParseGender(user, parametersList);
    }
}

