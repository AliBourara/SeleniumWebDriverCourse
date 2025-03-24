


public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo d = new MethodsDemo();
        String what = d.getData();
        System.out.println(what);
        MethodsDemo2 d2 = new MethodsDemo2();
        d2.getUserData();
        getData2();
    }
    //? Methods
    public String getData(){
        System.out.println("Hello World");
        return "some data";
    }
    public static String getData2(){
        System.out.println("Hello World");
        return "some data";
    }

}
