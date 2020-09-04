# jni

## create .h file

javac -h . HelloWorldJNI.java

### Using Intellij Idea config

Setting -> Tools -> External Tools -> Add

    Name: javah
    Group: jni
    Description: Java Native Interface C Header and Stub File Generator
    Program: $JDKPath$/bin/javah
    Arguments: -jni -v -d $ModuleFileDir$/src/main/cpp $FileClass$
    Working directory: $SourcepathEntry$
    Check all flags

## create .cpp file and compile

    #include "ro_rasel_jni_HelloWorldJNI.h"
    #include <iostream>

    JNIEXPORT void JNICALL Java_com_baeldung_jni_HelloWorldJNI_sayHello
      (JNIEnv* env, jobject thisObject) {
        std::cout << "Hello from C++ !!" << std::endl;
    }

## Compile file

    g++ -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux manualcompilation/src/main/cpp/ro_rasel_jni_HelloWorldJNI.cpp -o manualcompilation/src/main/cpp/ro_rasel_jni_HelloWorldJNI.o

### Using Intellij Idea config

Setting -> Tools -> External Tools -> Add

    Name: g++ compile
    Group: jni
    Description: Java Native Interface C compiler
    Program: g++
    Arguments: -c -fPIC -I$JDKPath$/include -I$JDKPath$/include/linux $FilePath$ -o $FileDir$/$FileNameWithoutExtension$.o
    Working directory: $SourcepathEntry$
    Check all flags

## Create the system load library

g++ -shared -fPIC -o manualcompilation/src/main/cpp/libnative.so manualcompilation/src/main/cpp/ro_rasel_jni_HelloWorldJNI.o -lc

### Using Intellij Idea config

Setting -> Tools -> External Tools -> Add

    Name: g++ create shared library
    Group: jni
    Description: Java Native Interface C compiler create shared library
    Program: g++
    Arguments: -shared -fPIC -o $FileDir$/libnative.so $FilePath$ -lc
    Working directory: $SourcepathEntry$
    Check all flags
    
## Run te applicaton

    VM Options: -Djava.library.path=$ModuleFileDir$/src/main/cpp

    
