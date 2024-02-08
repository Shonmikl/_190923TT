package org.example.TESTING._2024_02_08.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {
    private static final AddressBook ADDRESS_BOOK = new AddressBook();

    private Customer createCustomer() {
        State state = new State("NY");
        City city = new City("NY", state);
        Address address = new Address("256 Avenue", city);
        return new Customer("N", "SN", address);
    }

    @BeforeEach
    public void setUp() {
        ADDRESS_BOOK.customers.clear();
    }

    @Test
    void addCustomerTestScenario1() {
        Customer customer = createCustomer();
        ADDRESS_BOOK.addCustomer(customer);

        Assertions.assertEquals(1, ADDRESS_BOOK.getNumberOfCustomers());
    }

    @Test
    void addCustomerTestScenario2WithException() {
        Assertions.assertThrows(NullPointerException.class, () -> ADDRESS_BOOK.addCustomer(null));
    }

    @Test
    void addCustomerTestScenario3WithDummyObject() {
        Customer customer = Mockito.mock(Customer.class);
        ADDRESS_BOOK.addCustomer(customer);

        Assertions.assertEquals(1, ADDRESS_BOOK.getNumberOfCustomers());
    }
}