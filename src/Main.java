import java.io.*;
import java.util.*;


public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(3);
        Arr.add(30);
        Arr.add(34);
        Arr.add(5);
        Arr.add(9);
            int n = Arr.size();
            int flag = 0;
            int length = 0;

            ArrayList<Integer> A = new ArrayList<Integer>(Arr);
            System.out.println("A: "+ A);
            int count = 0;
            while(count < n){
                ArrayList<Integer> li = new ArrayList<Integer>();
                int num1 = 0;
                int num2 = 0;
                for(int i=0; i<n; i++){
                    if(i+1 < n){
                        if(num1 == 0){
                            num1 = A.get(i);
                        }
                        num2 = A.get(i+1);
                        String s1 = Integer.toString(num1);
                        String s2 = Integer.toString(num2);
                        String res1 = s1+s2;
                        String res2 = s2+s1;
                        int newNum1 = Integer.parseInt(res1);
                        int newNum2 = Integer.parseInt(res2);
                        if(newNum1 > newNum2){
                            flag = 0;
                            li.add(num1);
                            num1 = num2;
                        }else{
                            flag = 1;
                            li.add(num2);
                            num1 = num1;
                        }
                    }
                }
                if(flag == 0){
                    li.add(num2);
                }else{
                    li.add(num1);
                }
                A = (ArrayList<Integer>)li.clone();
                System.out.println("newA: "+ A);
                count++;
            }
            StringBuilder s = new StringBuilder();
            for(int i=0; i<A.size(); i++){
                s.append(A.get(i));
            }
            System.out.println(s.toString());
        }
}
