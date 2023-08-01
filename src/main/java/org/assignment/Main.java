package org.assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Sample transactions for three months
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("John", 120));
        transactions.add(new Transaction("Mary", 60));
        transactions.add(new Transaction("John", 80));
        transactions.add(new Transaction("Mary", 100));
        transactions.add(new Transaction("John", 50));
        transactions.add(new Transaction("Mary", 200));
        transactions.add(new Transaction("John", 150));
        transactions.add(new Transaction("Mary", 70));
        transactions.add(new Transaction("John", 90));
        transactions.add(new Transaction("Mary", 120));

        Map<String, Integer> rewardPointsPerCustomer = RewardCalculator.calculateRewardPoints(transactions);

        // Display the reward points earned for each customer per month and total
        for (String customer : rewardPointsPerCustomer.keySet()) {
            System.out.println("Customer: " + customer);
            System.out.println("Total Reward Points: " + rewardPointsPerCustomer.get(customer));
            System.out.println("-----------------------");
        }
    }
}