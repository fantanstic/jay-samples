class Echo {
    int count = 0;
    void hello() {
        System.out.println("helloooo...");
    }
}
class EchoTestDrive {
    public static void main(String [] args)
    {
        Echo e1 = new Echo();
//        Echo e2 = new Echo( );
        Echo e2 = e1;
        int x = 0;
        while ( x < 5 ) {
            e1.hello();
            e1.count = e1.count + 1;
            if ( x ==4) {
                e2.count = e2.count + 1;
            }
            if ( x <4) {
                e2.count = e2.count + e1.count;
            }
            System.out.println(e2.count);
            x = x + 1;
        }
//        x         0 1 2   3    4
//        e1.count  1 2 3   4    5
//        e2.count  0 1 2   3+4  8

        System.out.println(e2.count);
    }
}
