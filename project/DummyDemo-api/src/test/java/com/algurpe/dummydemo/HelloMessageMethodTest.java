package com.algurpe.dummydemo;

import com.algurpe.dummydemo.HelloMessageMethod;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloMessageMethodTest {

    @Test
    public void helloMethod() {
        HelloMessageMethod m = new HelloMessageMethod();
        String result = m.helloMethod( "Maven" );

        assertEquals( "Hello Maven", result );
    }
}
