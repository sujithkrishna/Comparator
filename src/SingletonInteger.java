public class SingletonInteger {

    private static SingletonInteger objRef;
    private static int count =0;

    private SingletonInteger(){
        objRef = new SingletonInteger();
    }

    public static  SingletonInteger getInstance(){
        return objRef;
    }

    public synchronized int  incrementCount(){
        return ++count;
    }
    public static void main(String[] arg){

    }

}
