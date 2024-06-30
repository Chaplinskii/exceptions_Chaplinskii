package View;

import Controller.Controller;
import User.User;
import Controller.WorkingFileController;

import java.util.List;

public class View {
    private Controller controller = new Controller();
    private WorkingFileController workingFileController = new WorkingFileController();
    User user = new User();

    public void start() {
        while (true) {
            setParameters(request());
        }
    }

    public User setParameters(List<String> listParameters) {

        try {
            controller.parseName(user, listParameters);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return setParameters(request());
        }
        try {
            controller.parseDate(user, listParameters);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return setParameters(request());
        }
        try {
            controller.parseNumberTelephone(user, listParameters);
        } catch (Exception e) {
            System.out.println(e);
            return setParameters(request());
        }
        try {
            controller.setParseGender(user, listParameters);
        } catch (Exception e) {
            System.out.println(e);
            return setParameters(request());
        }

        workingFileController.saveToFile(user);
        System.out.println(user);
        return user;
    }


    public List<String> request() {
        System.out.println("Введите через пробел : Фамилию Имя Отчество Дату рождения(dd.mm.yyyy) Номер телефона(89246538475) Пол(f или m):. Для выхода введите: exit");
        String requestStr = controller.requestForParameters();
        if (requestStr.equals("exit")) {
            System.exit(0);
        }
        List<String> requestList = controller.splitString(requestStr);
        System.out.println("Вы ввели " + requestStr);
        if (controller.checkingTheNumberOfParameters(requestList) == -99) {
            System.out.println("Вы ввели меньше параметров чем необходимо или пропустили пробел, повторите ввод еще раз!");
            request();
        }
        if (controller.checkingTheNumberOfParameters(requestList) == -77) {
            System.out.println("Вы ввели больше параметров чем необходимо или вставили лишний пробел, повторите ввод еще раз!");
            request();
        }
        return requestList;
    }
}
