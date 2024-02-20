//package org.example.TESTING._2024_02_10;
//
//
//import jdk.jfr.Description;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//public class OrderTestExample {
//
//    public static Stream<Arguments> orderColor() {
//        return Stream.of(
//                Arguments.of((Object) new String[]{"BLACK"}),
//                Arguments.of((Object) new String[]{"GREY"}),
//                Arguments.of((Object) new String[]{"BLACK", "GREY"}),
//                Arguments.of((Object) new String[]{null}));
//    }
//
//    @ParameterizedTest
//    @MethodSource("orderColor")
//    @DisplayName("Создание заказа. Успешное создание заказа")
//    @Description("Реализованы проверки:" +
//            "\n1) можно указать один из цветов — BLACK или GREY;" +
//            "\n2) можно указать оба цвета;" +
//            "\n3) можно совсем не указывать цвет;" +
//            "\n4) тело ответа содержит track;")
//    public void createOrderSuccessTest(String[] color) {
////        Specifications.installSpecification(Specifications.requestSpecification(BASE_URI),
////                Specifications.responseSpecification201());
////        Order order = new Order(UtilClass.randomString(10),
////                UtilClass.randomString(10),
////                UtilClass.randomString(10),
////                UtilClass.getRandomInt(),
////                UtilClass.randomPhone(11),
////                UtilClass.getRandomInt(),
////                UtilClass.getRandomDate(),
////                UtilClass.randomString(10),
////                color);
////        OrderListResponse response = given()
////                .body(order).log().all()
////                .when()
////                .post(ORDER_CREATION)
////                .then()
////                .extract().as(OrderListResponse.class);
////        Assertions.assertNotNull(response.getTrack());
////        UtilClass.deleteOrderById(UtilClass.getOrderId(order.getFirstName(), order.getLastName(), order.getAddress(),
////                order.getMetroStation(), order.getPhone(), order.getRentTime(), order.getDeliveryDate(),
////                order.getComment(), order.getColor()));
//    }
//}