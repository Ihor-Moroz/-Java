package Gen2;

class Gen2{
    public static void main(String[] args) {
        TwoD two[] = {
                new TwoD(1, 1),
                new TwoD(2, 2),
                new TwoD(3, 3),
                new TwoD(4, 4)
        };
        ThreeD three[]={
                new ThreeD(5,5,5),
                new ThreeD(6,6,6),
                new ThreeD(7,7,7),
                new ThreeD(8,8,8),
        };
        FourD four[]={
                new FourD(9,9,9,9),
                new FourD(10,10,10,10),
                new FourD(11,11,11,11),
                new FourD(12,12,12,12),
        };
        Coords<TwoD> coords2=new Coords<TwoD>(two);
        Coords<ThreeD> coords3=new Coords<ThreeD>(three);
        Coords<FourD> coords4=new Coords<FourD>(four);
        Coords.showXY(coords2);
        Coords.showXYZ(coords3);
        Coords.showXYZT(coords4);
    }
}

class TwoD{
    int x,y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD{
    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD{
    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

class Coords<T extends TwoD>{
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }

    static void showXY(Coords<?> c){
        System.out.println("Координати ХУ");
        for (int i=0;i<c.coords.length;i++){
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
        }
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Координати ХУZ");
        for (int i=0;i<c.coords.length;i++){
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
        }
    }
    static void showXYZT(Coords<? extends FourD> c){
        System.out.println("Координати ХУZT");
        for (int i=0;i<c.coords.length;i++){
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
        }
    }
}