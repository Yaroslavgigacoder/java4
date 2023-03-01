import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;
        LinkedList<String> list = new LinkedList<String>();
        while(run){
            String[] split = in.nextLine().split("~");
            String word = split[0];
            String numberString = split[1];
            
            if (word.equals("print")) {
               for (int i = 0; i < list.size(); i++) {
                    if (numberString.equals(list.get(i))) { 
                        System.out.println(list.get(i+1));
                        list.remove(i);      
                    }
                }
            }
            else if (word.equals("exit")){
            run = false;
            }      
            else{
                list.add(numberString);
                list.add(word);
            }
        
    }
    in.close();
}
}
