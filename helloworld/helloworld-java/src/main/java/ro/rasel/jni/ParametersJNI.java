package ro.rasel.jni;
 
public class ParametersJNI {
 
    static {
        JavaUtils.loadLibrary("helloworld-native.so");
    }
    
    public static void main(String[] args) {
        new ParametersJNI().sumIntegers(2,3);

        System.out.println(new ParametersJNI().sayHelloToMe("John",false));
        System.out.println(new ParametersJNI().sayHelloToMe("Jane",true));
    }

    private native long sumIntegers(int first, int second);

    private native String sayHelloToMe(String name, boolean isFemale);
}