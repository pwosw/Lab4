import java.util.Scanner;
public class JPA401{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int score[];
        int total = 0;
        int count = 0;
        score = new int[10];
        System.out.println("請輸入10個整數");
        for(int i=0;i<=9;i++){
            System.out.println("第"+(i+1)+"個整數");
            int s = scn.nextInt();
            score[i] = s;
            if (s>=60){
                count += 1;
                total += s;
            }  
            }
        Double ave = (double) total/count;
        System.out.println("陣列中大於60的有"+count+"個");  
        System.out.println("總合為"+total);
        System.out.println("平均值為"+ave);
        scn.close();
    }
}
