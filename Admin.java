package Package1;
public class Admin {
//Method Overload
void check(LocalStudent l1){
    if(l1.cgpa>=3.80){
        System.out.println("He/She will get Waiver 10%");
    }
}
void check(ForeignStudent f1){
    if(f1.cgpa>=3.70){
        System.out.println("He/She will get Waiver 15%");
    }
}
}
