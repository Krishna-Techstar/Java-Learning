import java.util.Scanner;

public class L07_PassFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String Status = (marks >= 33)? "Pass": "fail";
        System.out.println(Status);
    }
}
