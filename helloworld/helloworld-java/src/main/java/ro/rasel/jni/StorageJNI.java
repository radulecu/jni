package ro.rasel.jni;
 
public class StorageJNI {
    static {
        JavaUtils.loadLibrary("helloworld-native.so");
    }
    
    public static void main(String[] args) {
        StorageJNI storageJNI = new StorageJNI();
        storageJNI.setS("Hello World");

        System.out.println(storageJNI.getS());
    }

    public native String getS();

    public native void setS(String s);
}