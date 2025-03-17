package com.corejava.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface single { 
    String value();  // Single member annotations should always have member "value" only.
}

public class SingleMemberAnnotation {
    
    @single("100")
    public static void myMethod() {

    }
}
