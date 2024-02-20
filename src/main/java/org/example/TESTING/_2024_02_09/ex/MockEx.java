//package org.example.TESTING._2024_02_09.ex;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@ExtendWith(MockitoExtension.class)
//public class MockEx {
//
//    @Mock
//    List<String> list = new ArrayList<>();
//
//    @Test
//    void mockTest() {
//        String str = "QQQ";
//        list.add(str);
//        Mockito.verify(list).add(str);
//        Assertions.assertEquals(1, list.size());
//    }
//}
//
//@ExtendWith(MockitoExtension.class)
//class SpyEx {
//
//    @Spy
//    List<String> list = new ArrayList<>();
//
//    @Test
//    void spyTest() {
//        String str = "QQQ";
//        list.add(str);
//        Mockito.verify(list).add(str);
//        Assertions.assertEquals(1, list.size());
//    }
//}
