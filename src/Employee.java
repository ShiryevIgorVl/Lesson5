public class Employee {

    public String surnameNamePatronymic;
    public String position;
    public String email;
    public int telephone;
    public int salary;
    public int age;



    public  Employee(String surnameNamePatronymic, String position, String email, int telephone, int salary, int age) {
       this.surnameNamePatronymic = surnameNamePatronymic;
       this.position = position;
       this.email = email;
       this.telephone = telephone;
       this.salary = salary;
       this.age = age;
    }

    public void  printEmp() {
        System.out.printf("ФИО: %s; Должность: %s; Адрес электронной почты: %s; Телефон: %s; Зарплата, т.руб: %s; Возраст, лет: %s \n", surnameNamePatronymic, position, email, telephone, salary, age);
    }

    public static void main (String[] arge) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "нженер", "123@yandex.ru", 1234567, 30, 40);
        employee1.printEmp();
    }



}
