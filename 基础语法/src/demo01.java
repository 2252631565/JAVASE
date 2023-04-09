public class demo01 {
    public static void main(String[] args) {
        //八大基本数据类型
        /**
         * 整形：byte/short/int/long
         * 浮点：float/double
         * 字符:char
         * 布尔：boolean
         * */

        //整数
        int num1=10;
        byte num2=20;
        short num3=30;
        long num4=30L; //long类型要在数字后加l

        //小数
        float num5=50.1F;

        double num=3.1415926;


        //字符
        char name='国';
        //使用Unicode编码
        char num6='\u0036';
        char num7=66;
        System.out.println(num6+"\t"+"敲敲敲"+num7);


        //字符串，String不是关键字，是一个类
        //String namea="邬松桥"

        //布尔值：是非
        boolean flag=true;
        boolean flag2=false;
    }
}
