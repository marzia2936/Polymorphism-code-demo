package Package1;
public class ForeignStudent extends Student{
    
    public ForeignStudent(double cg) {
        super(cg);
    }
    //Metohd Oerride
    @Override
void paymentPerSemester(){
     System.out.println("Total Payment:45000BDT");       
 }
}
