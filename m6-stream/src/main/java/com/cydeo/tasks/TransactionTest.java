package com.cydeo.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTest {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1. Find all transactions in the year 2011 and sort them by value(small to high)

        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        // 2. What are all the unique cities where the traders work?

        System.out.println("*******************************************************");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        // 3. Find all traders from Cambridge and sort them by name.

        System.out.println("*******************************************************");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                .forEach(System.out::println);

        // 4. Return a string of all traders’ names sorted alphabetically.

        System.out.println("*******************************************************");
        List<String> traders = transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(traders);

        // 5. Are any traders based in Milan?

        System.out.println("*******************************************************");
        List<Trader> traderFromMilan = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
                .map(Transaction::getTrader)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(traderFromMilan);

        // 6. Print the values of all transactions from the traders living in Cambridge.

        System.out.println("*******************************************************");

        List<Integer> valuesOfCambridgeTraders = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println(valuesOfCambridgeTraders);

        // 7. What is the highest value of all the transactions?

        System.out.println("*******************************************************");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getValue)
                .limit(1)
                .forEach(System.out::println);

        // 8. Find the transaction with the smallest value.

        System.out.println("*******************************************************");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);


    }
}
