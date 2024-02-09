package org.example.TESTING._2024_02_08.mock.taski2;

public interface TransactionRepository {
    /**
     * Обрабатывает транзакцию с указанной суммой.
     * @param amount сумма транзакции.
     * @return true, если транзакция успешно обработана, иначе false.
     */
    boolean processTransaction(double amount);
}
