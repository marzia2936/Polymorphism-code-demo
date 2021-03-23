package Package1;
public class Main {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        Student s1 = new Student(3.90);
        System.out.println("For Local Student-->");
        LocalStudent L1 = new LocalStudent(3.89);
       a1.check(L1);
        L1.paymentPerSemester();
        System.out.println("For Foreign Student-->");
        ForeignStudent F1 = new ForeignStudent(3.76);
        F1.paymentPerSemester();
        a1.check(F1);
    }
    
}
