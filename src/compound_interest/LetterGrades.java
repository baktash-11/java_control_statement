package compound_interest;
import java.lang.reflect.GenericDeclaration;
import java.text.BreakIterator;
import java.util.Scanner;
public class LetterGrades {
    //video 46 lesson 5

    private int total=0; //sum of grades
    private int gradeCounter=0; //number of grades entered
    private int average;
    private int aCount=0; //count of a grades
    private int bCount=0; //count of b grades
    private int cCount=0; //count of c grades
    private int dCount=0; //count of d grades
    private int fCount=0; //count of f grades

    Scanner input = new Scanner(System.in);
    
    public void header(){
        System.out.printf("%n%n%s%n%s%n%s%n%s%n%n", "Enter the grade in the range of 0 to 100"
                            ,"Type the of file indicator to terminate input:", 
                            "On UNIX/Linux/Max OS X type <Ctrl> dd the press Enter", 
                            "On Windows type <Ctrl> z the press Enter"
                            );
    }





    public void gradeInput(){
        while (input.hasNext()) {
            int grade = input.nextInt();
            total +=grade;
            ++gradeCounter;

            switch(grade /10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;                    
            }
            
            
        }

    }

    public void gradeCalc(){
        System.out.printf("%nGrade Report:%n");
        if(gradeCounter!=0){
                average = total / gradeCounter;
                System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %d%n", average);

                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d",
                "Number of Students who received each grade",
                "A:", aCount, 
                "B:", bCount,
                "C:", cCount, 
                "D:", dCount,
                "F:", fCount
                );
            
            }else{
                System.out.println("No grade was entered!");
            }
    }
}
