#include "ro_rasel_jni_HelloWorldJNI.h"
#include <iostream>

JNIEXPORT void JNICALL Java_ro_rasel_jni_HelloWorldJNI_sayHello
  (JNIEnv* env, jobject thisObject) {
    std::cout << "Hello from C++ !!" << std::endl;
}