package operatorExercises;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
         //练习：数值拆分
        // 需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100 % 10;
        System.out.println("个位：" + ge + " 十位：" + shi + " 百位：" + bai);
    }
}
