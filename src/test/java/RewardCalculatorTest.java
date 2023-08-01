import org.assignment.RewardCalculator;
import org.assignment.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardCalculatorTest {


    @Test
    public void testCalculateRewardPoints() {
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

        Map<String, Integer> actualRewardPoints = RewardCalculator.calculateRewardPoints(transactions);

        // Expected reward points for each customer
        Map<String, Integer> expectedRewardPoints = new HashMap<>();
        expectedRewardPoints.put("John", 380);
        expectedRewardPoints.put("Mary", 540);

        // Assertions to check if the actual reward points match the expected reward points
        Assertions.assertEquals(expectedRewardPoints.keySet(), actualRewardPoints.keySet());
        for (String customer : expectedRewardPoints.keySet()) {
            Assertions.assertEquals(expectedRewardPoints.get(customer), actualRewardPoints.get(customer));
        }
    }

}
