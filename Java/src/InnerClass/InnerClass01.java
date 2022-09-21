package InnerClass;

/**
 * @author tangbingxing
 * @version 1.0
 */
public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}

class Outer {//外部类
    private int n1 = 100;
    public void m1() {
        System.out.println("m1()");
    }
    {
        System.out.println("代码块");
    }
    class Inner {//内部类   不能添加访问修饰符，可以添加final （加了后就不能被继承）

    }
}

class Outer02 {
    private int n2 =200;
    public void m2() {
         /*final*/ class Inner02 {
             private int n2 = 300;
            public void f1() {
                System.out.println("n2 =" + n2);//可以访问外部类的所有成员;外部类和内部类的成员
//                重名时，默认遵循就近原则，如果想要访问外部类的重名成员，用外部类名.this.成员 去访问
                System.out.println("n2 = " + Outer02.this.n2);
                m2();
            }
        }
        class Inner03 extends Inner02 {

        }
    }
}
