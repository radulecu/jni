package ro.rasel.jni;
 
public class HelloWorldJNI {
 
    static {
        JavaUtils.loadLibrary("helloworld-native.so");
    }
    
    public static void main(String[] args) {
        new HelloWorldJNI().sayHello();
    }

    private native void sayHello();
}