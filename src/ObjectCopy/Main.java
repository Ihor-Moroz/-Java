package ObjectCopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        myObject myO=new myObject();
        myO.i=1;
        myObject myO2=myO;//Новий об'єкт не створено, просто тепер дві силки на один об'єкт, треба юзати clone()
        myO2.i=2;
        System.out.println(myO.i);
        System.out.println(myO2.i);
    }
}

class myObject implements Cloneable{
    int i;

    @Override
    protected myObject clone() throws CloneNotSupportedException {
        return (myObject) super.clone();
    }
}