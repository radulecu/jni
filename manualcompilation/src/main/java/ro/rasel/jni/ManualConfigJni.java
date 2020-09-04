package ro.rasel.jni;
 
public class ManualConfigJni {
 
    static {
        System.loadLibrary("native");
    }
    
    public static void main(String[] args) {
        new ManualConfigJni().sayHello();
    }

    private native void sayHello();

//    private native void sayHelloToMe(String me);
}