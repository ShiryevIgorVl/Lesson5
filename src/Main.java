public class Main {



    public static void main (String[] arge) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван", "нженер", "123@yandex.ru", 1234567, 30, 40);
        persArray[1] = new Employee("Петров Петр", "нженер 2 кат.", "1234@yandex.ru", 2234567, 32, 24);
        persArray[2] = new Employee("Васильев Василий", "нженер 2 кат.", "12345@yandex.ru", 3234567, 33, 44);
        persArray[3] = new Employee("Смирнов Евгений", "вед. нженер", "12345@yandex.ru", 4234567, 35, 35);
        persArray[4] = new Employee("Матвеев Денис", "нженер 2 кат.", "12346@yandex.ru", 6234567, 28, 34);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age >= 40) {
                persArray[i].printEmp();
            }
        }
    }
}
