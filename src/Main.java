public class Main {
    public static void main(String[] args) {
        var generalTimeWork = 640;
        var specialTimeWork = 8;
        var employees = generalTimeWork / specialTimeWork;
        System.out.print("Всего работников в компании – ");
        System.out.println(employees);System.out.print("человек.");
        System.out.print("Если в компании работает ");
        var addEmployess = employees + 94;
        System.out.println(addEmployess);
        System.out.print("человек, то всего ");
        var timeWorkAddEmployess = specialTimeWork * addEmployess;
        System.out.println(timeWorkAddEmployess);
        System.out.print("часов работы может быть поделено между сотрудниками.");
    }
}
