#include "ro_rasel_jni_StorageJNI.h"
#include <iostream>

const char* s;

JNIEXPORT jstring JNICALL Java_ro_rasel_jni_StorageJNI_getS
  (JNIEnv* env, jobject thisObject) {
    return env->NewStringUTF(s);
}
JNIEXPORT void JNICALL Java_ro_rasel_jni_StorageJNI_setS
  (JNIEnv* env, jobject thisObject, jstring thisString) {
    s = env->GetStringUTFChars(thisString, NULL);
}