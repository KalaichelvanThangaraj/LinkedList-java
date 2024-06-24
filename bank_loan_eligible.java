import java.util.LinkedList;
public class bank_loan_eligible {
    public static void main(String[] args){
        LinkedList <String> applicable = new LinkedList<>();

        applicable.add("Aadhaar");
        applicable.add("Pan Card");
        applicable.add("CIBIL Score");

        if(applicable.contains("Aadhaar") && applicable.contains("Pan Card") && applicable.contains("CIBIL Score")){
            System.out.println("You are Elegible to apply loan.");
        }    
        else{
            System.out.println("You are not Elegible to apply loan.");
        }
    }
}


/* OUTPUT:
 *    You are Elegible to apply loan.
 */