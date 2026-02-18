public class Main {
    int x; // Defaults to 0
    double z;
    boolean b = false;
    short s = 1234;
    byte bb = 100;

    public static void main(String[] args) {
        Main obj = new Main();

        // FIX: Access 'b' through the object 'obj'
        obj.b = true;

        // This will print '0' (default value of int)
        System.out.println(obj.x);
    }
}