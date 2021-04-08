//Peter Boldyrev / CSSSKL 143

import java.util.*;
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
*
* Solution by 
*/
public class InFixCalc {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
    //special case: 
    //other special cases?

    public static void main(String[] args) {
        //String input = "4 + 4";
        String input = "4 + 4 / 2";
        //String input ="1 * -3";
//        String input ="1 * -3 + 6 / 3";
//        String input ="5";
        //String input ="-5";
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

    //preconditions: all binary operations are separated via a space
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {

        int lhs = 0; //short for left-hand side
        int rhs = 0; //short for right-hand side
        char operation;
        int answer=0;
        String [] splitted = input.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        //adding operators
        for(int i=0;i< splitted.length;i++){
            if(splitted[i].equals("*") || splitted[i].equals("+") || splitted[i].equals("-") || splitted[i].equals("/")){
                operators.add(splitted[i].charAt(0));
            }
            //checking if it's an int > adding to the int list
            else if(i == (int)i){
                numbers.add(Integer.parseInt(splitted[i]));
            }
        }

        int i=0;
        //while there is more than 1 number (when 1 number > we got the answer) > proceed with code
        while(numbers.size()>1){
            //taking one operator and understanding what to do with it
            for(int j=0;j<operators.size();j++){
                int res = 0;
                if(getOperator(operators.get(j))==1){
                    res = numbers.get(i)+numbers.get(i+1);
                    updList(numbers,i,res);
                }
                else if(getOperator(operators.get(j))==2){
                    res += numbers.get(i)-numbers.get(i+1);
                    updList(numbers,i,res);
                }
                else if(getOperator(operators.get(j))==3){
                    res = numbers.get(i)*numbers.get(i+1);
                    updList(numbers,i,res);
                }
                else if(getOperator(operators.get(j))==4){
                    res = numbers.get(i)/numbers.get(i+1);
                    updList(numbers,i,res);
                }
            }
        }

        answer = numbers.get(0);

        return answer;
    }

    public static ArrayList updList(ArrayList someList,int i, int res){
        someList.remove(i);
        someList.remove(i);
        someList.add(0,res);

        return someList;
    }

    public static int getOperator(char a){
        if(a=='+'){
            return 1;
        }
        else if(a=='-'){
            return 2;
        }
        else if(a=='*'){
            return 3;
        }
        else if(a=='/'){
            return 4;
        }
        else{
            return -1;
        }

         //end of getOperator
    }
}
