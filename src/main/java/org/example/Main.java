package org.example;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        System.out.println("Hello world!");
        Class.forName("org.postgresql.postgresql-42.6.0.jar");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://hostname:port/dbname","username", "password");
        connection.close();
    public static void main(String[] args) {

        System.out.println("Добрый день!");
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Доступные операции:");
            System.out.println(
                    "1 - Просмотреть список мест \n" +
                            "2 - Просмотреть расписание по месту  \n" +
                            "3 - Добавить место \n" +
                            "4 - Просмотреть список сотрудников \n" +
                            "5 - Добавить сотрудника \n" +
                            "6 - Просмотреть события \n" +
                            "7 - Просмотреть события \n" +
                            "8 - Изменить события \n" +
                            "Q - выйти");
            String str = iScanner.nextLine();
//            Controller userController = new Controller();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            } else if (str.equals("1")) Controller.viewPlaceList();
            else if (str.equals("2")) Controller.viewSheduleForPlace();
            else if (str.equals("3")) Controller.addPlace();
            else if (str.equals("4")) Controller.getCheck();
            else if (str.equals("5")) Controller.enrollment();
            else if (str.equals("6")) Controller.consumption();
    }
}