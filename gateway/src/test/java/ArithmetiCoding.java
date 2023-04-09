import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

//随机变量类

class RandomVariable {

    private double possibility = 0;

    private String randomVariableName = null;

    RandomVariable() {
    }

    RandomVariable(double possibility, String randomVariableName) {
        this.possibility = possibility;
        this.randomVariableName = randomVariableName;

    }

    public void setPossibility(double possibility) {
        this.possibility = possibility;
    }

    public void setRandomVaribleName(String randomVariableName) {
        this.randomVariableName = randomVariableName;
    }

    public void setRandomVarible(String randomVariableName, double possibility) {
        this.randomVariableName = randomVariableName;
        this.possibility = possibility;
    }

    public double getPossibility() {
        return this.possibility;
    }

    public String getRandomVaribleName() {
        return this.randomVariableName;
    }

}

public class ArithmetiCoding {

    private static int num = 0;

    private static double p_ui = 1.f;

    private static double p_uiAdd1 = 0.f;

    private static double puiAdd1 = 0.f;

    private static double f_ui = 0.f;

    private static double f_uiAdd1 = 0.f;

    private static double fuiAdd1 = 0.f;

    private static int n_ui = 0;

    private static RandomVariable[] randomVariable = null;

    private static int theNumOfCharacterSet = 0;

    private static List<RandomVariable> list = new ArrayList();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符集个数: ");
        try {
            num = in.nextInt();
            if(num <= 0) {
                System.out.println("输入值应该大约0！");
                System.exit(0);
            }
        } catch(Exception e) {
            System.out.println("输入含有非法字符！");
            System.exit(0);
        }
        inputFunction(num);
        input();
    }

    public static void inputFunction(int num) {

        randomVariable = new RandomVariable[num];
        Scanner in = new Scanner(System.in);

        for(int i=0; i < randomVariable.length; i++)
            randomVariable[i]=new RandomVariable();

        for(int i = 0; i < num; i++) {
            System.out.print("请输入字符" + (i+1) +"及其概率: ");
            randomVariable[i].setRandomVarible(in.next(),in.nextDouble());
            list.add(randomVariable[i]);
        }

    }

    public static void input() {

        int index = 0;
        String temp = "0.";
        Scanner in = new Scanner(System.in);
        System.out.print("信源序列，以逗号分割: ");
        String str = in.nextLine();
         String[] splitstr=str.split(",");
        System.out.println();
        System.out.println("序号\tui\tP(ui)\t\tF(ui)\t\tn(ui)\tS");
        System.out.println((index++) + " \t空\t1 \t\t 0 \t\t 0\t");

        for(int i = 0;i < splitstr.length; i++){

            fuiAdd1 = distributionFunction(splitstr[i]);
            f_uiAdd1Function();
            puiAdd1 = list.get(index(splitstr[i])-1).getPossibility();
            p_uiAdd1Function();
            n_ui = (int)(Math.ceil(-1*Math.log(p_uiAdd1)/Math.log(2)));
            double binary = f_uiAdd1;
            for(int j = 0; j < n_ui; j++) {

                binary *= 2;

                temp += (int)binary;

                binary = binary - (int)binary;

            }

            System.out.println((index++)+"\t"+splitstr[i]+"\t"+String.format("%-12s",p_uiAdd1)+"\t"+
                    String.format("%-10s",f_uiAdd1)+"\t"+n_ui+"\t"+temp);

            f_ui = f_uiAdd1;

            p_ui = p_uiAdd1;

            temp = "0.";

 }

    }

    public static int index(String randomVariableName) {

        String temp = "";

        for(int i = 1; i < randomVariableName.length(); i++) {

            temp += randomVariableName.charAt(i);

        }

        return Integer.parseInt(temp);

    }

//分布函数

    public static double distributionFunction(String randomVariableName) {

        double possibilityDistribution = 0.f;

        for(int i = 0; i < index(randomVariableName) - 1; i++) {

            possibilityDistribution += list.get(i).getPossibility();

        }

        return possibilityDistribution;

    }

//递推公式

    public static void p_uiAdd1Function() {

        p_uiAdd1 = p_ui * puiAdd1;

    }

    public static void f_uiAdd1Function() {

        f_uiAdd1 = f_ui + p_ui * fuiAdd1;

    }

}