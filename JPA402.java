import java.util.Scanner;
public class JPA402 {
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    float score[];
    float total = 0;
    System.out.println("請輸入學生人數:");
    int count = scn.nextInt();
    score = new float[count];
    for(int i = 0;i < count;i++){
        System.out.println("第"+(i+1)+"個學生的成績:");
        float stu = scn.nextFloat();
        score[i] = stu;
        total += stu;
        }
    float ave = (float) total/count;
    System.out.println("人數:"+count);
    System.out.println("總分:"+total);
    System.out.println("平均:"+ave);
    scn.close();    
 }   
}
