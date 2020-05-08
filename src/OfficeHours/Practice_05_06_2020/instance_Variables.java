package OfficeHours.Practice_05_06_2020;

public class instance_Vriables {
    int a = 100;

    public static void main(String[] args) {
        instance_Vriables obj1 = new instance_Vriables();
        obj1.a = 300;

        System.out.println(300);

        instance_Vriables obj2 = new instance_Vriables();
        System.out.println(obj2.a);
    }
}
