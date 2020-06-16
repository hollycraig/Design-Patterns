//
//import org.junit.Test;
//
//import static org.mockito.Mockito.*;
//
//import org.mockito.ArgumentCaptor;
//import org.mockito.Captor;
//import org.mockito.Mockito;
//
//public class MyClassTest {
//
//
//    @Captor
//    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);
//    ArgumentCaptor<Integer> intCaptor = ArgumentCaptor.forClass(Integer.class);
//
//    @Test
//    public void doSomething() {
//
//        MyDependency dependency = mock(MyDependency.class);
//        MyClass testClass = new MyClass(dependency);
//
//        testClass.doSomething();
//
//        when(dependency.getSomeResult("hello", 2)).thenReturn("worked");
//        verify(dependency, atLeast(0)).getSomeResult(stringCaptor.capture(), intCaptor.capture());
//        int timesCalled = Mockito.mockingDetails(dependency).getInvocations().size();
//
//        System.out.println("MyClass.doSomething Test Results:");
//        System.out.println("Number of times MyDependency.getSomeResult was called: " + timesCalled);
//        System.out.print("String parameter given to first MyDependency.getSomeResult call (if any): ");
//
//        if (timesCalled > 0){
//            System.out.println(stringCaptor.getAllValues().get(0));
//        }
//        else{
//            System.out.println("");
//        }
//
//        System.out.print("String parameter given to second MyDependency.getSomeResult call (if any): ");
//
//        if (timesCalled > 1){
//            System.out.println(stringCaptor.getAllValues().get(1));
//        }
//        else{
//            System.out.println("");
//        }
//
//        System.out.print("int parameter given to first MyDependency.getSomeResult call (if any): ");
//
//        if (timesCalled > 0){
//            System.out.println(intCaptor.getAllValues().get(0));
//        }
//        else{
//            System.out.println("");
//        }
//
//        System.out.print("int parameter given to second MyDependency.getSomeResult call (if any): ");
//
//        if (timesCalled > 1){
//            System.out.println(intCaptor.getAllValues().get(1));
//        }
//        else{
//            System.out.println("");
//        }
//    }
//}