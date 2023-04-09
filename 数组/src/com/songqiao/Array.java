package com.songqiao;

public  class Array {
    public static void main(String[] args) {
        int[] arr={100,50,20,90,90,100,60,22,33};
        double[] arr1={11.2,11.4,100,1212.34,1,23};
        Array array=new Array();
//        array.arrayMaxTest(arr1);
        array.arrayTest4(arr);
    }
//    数组的定义
    public static void arrayTest1(){
        int[] array= new int[5];

        int array2[];

    }
//    数组初始化，并打印
    public  void arrayTest2(){
        int[] arr1={11,22,44};

        double[] arr2={11.2,33.4,121.2,21};

        for(int i=0;i<arr1.length;i++){
            System.out.println("第"+(i+1)+"个数据是:"+arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("第"+(i+1)+"个数据是:"+arr2[i]);
        }
    }
//    数组求偶数和
    public void arrayTest3(){
        int[] array={11,22,33,44,55};
        int sum=0;
        for (int j = 0; j < array.length; j++) {
            if(array[j]%2==0){
                System.out.println("第"+(j+1)+"号偶数是"+array[j]);
                sum+=array[j];
            }
        }
        System.out.println("偶数总和是："+sum);
    }
//    数组求最大值
    public void arrayMaxTest(double[] array){
        double max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
//    求最大值，最小值，平均分，总成绩，低于总成绩元素个数
    public void arrayTest4(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum = 0;
        double avg;
        int ge=0;
//        最大
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        最小
        for (int j = 1; j < arr.length; j++) {
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
//        平均
        for (int z = 0; z < arr.length; z++) {
             sum+=arr[z];
        }
        avg=(sum*1.0)/arr.length;
        System.out.println("总成绩："+sum);
        System.out.println("平均值："+avg);
//        低于平均值的元素个数
        for (int x = 0; x < arr.length; x++) {
            if(arr[x]<avg){
                ++ge;
            }
        }
        System.out.println("有"+ge+"元素低于平均值！");
        System.out.println("有这么多元素："+arr.length);
    }
}

