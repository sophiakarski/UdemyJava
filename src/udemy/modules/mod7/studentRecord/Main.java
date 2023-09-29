package udemy.modules.mod7.studentRecord;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            UCLStudent s = new UCLStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006",
                "Ann", "05/11/1985", "Java Masterclass");
        UCLStudent recordStudent = new UCLStudent("S923007",
                "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

//        can modify class list for Pojo!
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        no way to set the class list, other than setting in record header, or through use of constructors
//        recordStudent.setClassList(recordStudent.classList() + "Java OCP Exam 829");


        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
