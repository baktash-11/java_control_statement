import compound_interest.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" LESSON:5 \nfor, do...while loops, switch break continue statement and logical operators");
    
        CompoundInterest compoundCalc = new CompoundInterest();
        
        compoundCalc.header();
        compoundCalc.calc();
    
        //do while loop
        DoWhile doWile_ = new DoWhile();
        doWile_._doWhile();

        //switch statement in java 
        LetterGrades  newGrade = new LetterGrades();
        newGrade.header();
        newGrade.gradeInput();
        newGrade.gradeCalc();
    
    }
}
