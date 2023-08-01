package org.assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardCalculator {

    public static Map<String, Integer> calculateRewardPoints(List<Transaction> transactions) {
        Map<String, Integer> rewardPointsPerCustomer = new HashMap<>();

        for (Transaction transaction : transactions) {
            int rewardPoints = 0;
            int amountOver100 = Math.max(transaction.transactionAmount - 100, 0);
            int amountOver50 = Math.max(transaction.transactionAmount - 50, 0);

            rewardPoints = 2 * amountOver100 + amountOver50;

            // Update the reward points for the customer
            rewardPointsPerCustomer.put(transaction.customerName,
                    rewardPointsPerCustomer.getOrDefault(transaction.customerName, 0) + rewardPoints);
        }

        return rewardPointsPerCustomer;
    }
}
