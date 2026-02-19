package variableTest;

public class Test3 {
    public static void main(String[] args) {
    //     请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
        // 1、班级里有100个学员。
        // 2、某商品价格55.55元。
        // 3、地球已经诞生超过46亿年。
        // 4、“5是偶数”这句话的描述是假的。
        int CLassMember = 100;
        double price = 55.55;
        long age = 46 * 1000000000L;
        boolean isTrue = false;
        System.out.println("班级里有" + CLassMember + "个学员");
        System.out.println("某商品价格" + price + "元");
        System.out.println("地球已经诞生超过" + age + "年");
        System.out.println("“5是偶数”这句话的描述是" + isTrue);
    }
}
