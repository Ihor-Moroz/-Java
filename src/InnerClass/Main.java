package InnerClass;

public class Main {
    int i=5;
    static int d=88;

    static class StaticClass{
        void method(){
            System.out.println(d);
        }
    }

    Inner inner3=new Inner();

    public static void main(String[] args) {
        Main main=new Main();
        main.method();
        Inner inner=main.new Inner();
        inner.method2();
        StaticClass st=new StaticClass();
        st.method();
    }
    void method(){
        class NewInner{
            void newMethod(){
                System.out.println("zzz");
            }
        }
        NewInner NI=new NewInner();
        NI.newMethod();
    }

    class Inner{
        private int k=10;
        void method2(){
            System.out.println(i);
        }
    }
}

class Second{
    void method(){
        Main.Inner inner=new Main().new Inner();
    }
}