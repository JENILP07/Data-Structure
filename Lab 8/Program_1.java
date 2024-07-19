//Infix To Postfix
import java.util.*;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> s1 = new Stack<Character>();
        s1.push('(');   
        System.out.println("Enter Infix String");
        String Infix = sc.nextLine();
        String Polish = "";
        Infix += ')';
        
        for(int i = 0 ; i < Infix.length() ; i++){
            if((Infix.charAt(i) >= 'a' && Infix.charAt(i) <= 'z') || (Infix.charAt(i) >= 'A' && Infix.charAt(i) <= 'Z')){
                Polish += Infix.charAt(i);
            }else if(Infix.charAt(i) == '+' || Infix.charAt(i) == '-' || Infix.charAt(i) == '*' || Infix.charAt(i) == '/'){ 
               while(checkPrecidance(Infix.charAt(i)) <= checkPrecidance(s1.peek())) {
                    Polish += s1.pop();
                }
                s1.push(Infix.charAt(i));
            }else if(Infix.charAt(i) == '^'){
                while(checkPrecidance(Infix.charAt(i)) < checkPrecidance(s1.peek())) {
                    Polish += s1.pop();
                }
                s1.push(Infix.charAt(i));
            }else if(Infix.charAt(i) == ')'){
                while (s1.peek() != '('){
                    Polish += s1.pop();
                }
                s1.pop();
            }
            else{
                s1.push(Infix.charAt(i));
            }
        }
        System.out.println(Polish);
        sc.close();
    }
    public static int checkPrecidance(char x){
        if(x == '+'||x == '-'){
            return 1;
        }else if(x == '*'||x == '/'){
            return 2;
        }else if(x == '^'){
            return 3;
        }else{
            return 0;
        }
    }

}