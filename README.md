# CodingAssignment - Reward Points Calculator

A Java program to calculate reward points earned by customers based on their transactions over a three-month period. The reward points are awarded to customers for each recorded purchase according to the specified rules.

## Table of Contents
- [Description](#description)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Example](#example)
- [Unit Tests](#unit-tests)
- [License](#license)

## Description

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase. A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

The Java program takes a record of every transaction during a three-month period as input and calculates the reward points earned for each customer per month and total.

## Prerequisites

To run the Reward Points Calculator program, you need the following:

- Java Development Kit (JDK) version 8 or above.

## Usage

1. Clone this repository to your local machine:

```bash
git clone https://github.com/camit89/CodingAssignment.git
cd CodingAssignment
```

2. Compile and package the Java program using Maven:

```bash
mvn package
```

3. Run the program:

```bash
java -jar target/CodingAssignment-1.0-SNAPSHOT.jar
```

4. Follow the on-screen instructions to enter the transactions for each customer and see the reward points earned.

## Example

Suppose we have the following transactions for two customers over a three-month period:

Customer: John
- $120
- $80
- $50
- $150
- $90

Customer: Mary
- $60
- $100
- $200
- $70
- $120

The program will calculate the reward points for each customer:

Output:
```
Customer: John
Total Reward Points: 380
-----------------------
Customer: Mary
Total Reward Points: 540
-----------------------
```

## Unit Tests

The Java program is accompanied by JUnit test cases to validate the correctness of the reward points calculation. To run the unit tests, execute the following command:

```bash
mvn test
```

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to use, modify, and distribute the code as per the terms of the MIT License.
