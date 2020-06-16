package mocks;

import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyClassTest {

    @Test
    public void doSomething() {

        MyDependency dependency = mock(MyDependency.class);
        when(dependency.getString()).thenReturn("something");
        MyClass myClass = new MyClass(dependency);

        assertEquals("something", myClass.doSomething());
        verify(dependency, times(1)).getString();

        MyDependency dependency2 = mock(MyDependency.class);
        when(dependency2.getString()).thenReturn(null);
        MyClass myClass2 = new MyClass(dependency2);


        assertEquals("was null", myClass2.doSomething());
        verify(dependency2, times(1)).getString();

        //when(provider.findAll(ArgumentMatchers.<String>any())).thenReturn(Arrays.asList());


//        when(provider.findAll(ArgumentMatchers.<String>any())).thenAnswer(invocation -> {
//            for (Object argument: invocation.getArguments()){
//                if ("DOMESTIC".equals(argument)) return Arrays.asList(client);
//                if ("LARGE ACCOUNTS".equals(argument)) return Arrays.asList(client);
//                if ("INTERNATIONAL".equals(argument)) return Arrays.asList(client);
//            }
//            return Arrays.asList();
//        });

//        @Test(expected = IllegalStateException.class)

    }
}