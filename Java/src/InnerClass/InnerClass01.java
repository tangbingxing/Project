package InnerClass;

/**
 * @author tangbingxing
 * @version 1.0
 */
public class InnerClass01 {//�ⲿ������
    public static void main(String[] args) {

    }
}

class Outer {//�ⲿ��
    private int n1 = 100;
    public void m1() {
        System.out.println("m1()");
    }
    {
        System.out.println("�����");
    }
    class Inner {//�ڲ���   ������ӷ������η����������final �����˺�Ͳ��ܱ��̳У�

    }
}

class Outer02 {
    private int n2 =200;
    public void m2() {
         /*final*/ class Inner02 {
             private int n2 = 300;
            public void f1() {
                System.out.println("n2 =" + n2);//���Է����ⲿ������г�Ա;�ⲿ����ڲ���ĳ�Ա
//                ����ʱ��Ĭ����ѭ�ͽ�ԭ�������Ҫ�����ⲿ���������Ա�����ⲿ����.this.��Ա ȥ����
                System.out.println("n2 = " + Outer02.this.n2);
                m2();
            }
        }
        class Inner03 extends Inner02 {

        }
    }
}
