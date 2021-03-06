package Serializazia;

import java.io.*;

public class Main {

    public static void main(String... args) throws Exception {
        TemplateChild temp1=new TemplateChild();
        temp1.live_level=100;
        temp1.pole=1555;
        Sord ns=new Sord();
        ns.level=5;
        temp1.s=ns;
        temp1.childLevel=66;

        FileOutputStream fos=new FileOutputStream("Objects.txt");
        ObjectOutputStream ous=new ObjectOutputStream(fos);
        ous.writeObject(temp1);
        ous.close();

        temp1.pole=150;

        FileInputStream fis=new FileInputStream("Objects.txt");
        ObjectInput oi=new ObjectInputStream(fis);
        TemplateChild tempWithFile=(TemplateChild)oi.readObject();
        oi.close();
        System.out.println(tempWithFile.live_level);
        System.out.println(tempWithFile.pole);
        System.out.println(tempWithFile.s);
        System.out.println(tempWithFile.childLevel);

    }
}
