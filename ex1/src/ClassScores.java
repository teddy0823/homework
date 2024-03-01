import java.util.*;

public class ClassScores {
    static Scanner keyboard = new Scanner(System.in);

    static ArrayList<Integer> score = new ArrayList<Integer>();
    public static void main(String[] args) {
        do{
            int useScore =printmainMemu();
            if(useScore<0){
                break;
            }
            score.add(useScore);

        } while(true);
        System.out.println("All the scores in the class:"+score);
    }

    public static int printmainMemu(){
        System.out.print("Score?");

        return keyboard.nextInt();


    }
}
