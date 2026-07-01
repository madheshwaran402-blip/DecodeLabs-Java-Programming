# ATM Interface using Java

## Project Overview

The ATM Interface is a Java console-based application developed as part of the **Java Programming Internship at Decode Labs**.

The project simulates the basic functionality of an Automated Teller Machine (ATM) using Object-Oriented Programming principles. It allows users to check account balance, deposit money, withdraw money, and exit the application through a menu-driven interface.

---

## Features

- Check Account Balance
- Deposit Money
- Withdraw Money
- Input Validation
- Insufficient Balance Check
- Menu-Driven Interface
- Object-Oriented Design
- Encapsulation using Private Variables

---

## Technologies Used

- Java
- IntelliJ IDEA
- JDK 17+

---

## Java Concepts Used

- Classes & Objects
- Encapsulation
- Constructors
- Methods
- Scanner Class
- Loops
- Switch Case
- Conditional Statements
- User Input Handling

---

## Project Structure

```
DecodeLabs_Java_Project3
│
├── src
│   └── com
│       └── decodelabs
│           └── project3
│               ├── Main.java
│               ├── ATM.java
│               └── BankAccount.java
│
├── README.md
└── Project_Report.pdf
```

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure JDK 17 or above.
3. Run Main.java.
4. Choose an option from the ATM menu.
5. Perform banking operations.
6. Exit the application.

---

## Sample Output

```
==============================
         ATM MENU
==============================

1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Enter Choice: 1

Current Balance : ₹10000.0

Enter Choice: 2
Deposit Amount : ₹5000

Successfully Deposited.

Current Balance : ₹15000.0

Enter Choice: 3
Withdraw Amount : ₹2000

Withdrawal Successful.

Current Balance : ₹13000.0
```

---

## Functionalities

### Balance Inquiry

Displays the available account balance.

### Deposit

Allows users to deposit a valid amount into the account.

### Withdraw

Allows users to withdraw money if sufficient balance is available.

### Input Validation

- Deposit amount must be greater than zero.
- Withdrawal amount must be greater than zero.
- Withdrawal amount cannot exceed the available balance.

---

## Algorithm

1. Start the application.
2. Create a BankAccount object with an initial balance.
3. Create an ATM object.
4. Display ATM menu.
5. Accept user choice.
6. Perform selected operation.
7. Display updated balance.
8. Repeat until Exit is selected.
9. End the application.

---

## Learning Outcomes

- Object-Oriented Programming
- Encapsulation
- Class Design
- Method Creation
- Console Application Development
- Banking Logic Implementation
- User Input Validation
- Problem Solving

---

## Future Enhancements

- PIN Authentication
- Multiple User Accounts
- Transaction History
- Mini Statement
- Money Transfer
- Change PIN
- File-Based Data Storage
- Database Integration
- Java Swing GUI
- JavaFX Interface

---

## Internship

Java Programming Internship

Organization: Decode Labs

Project: ATM Interface

---

## Author

**Madheshwaran M**

B.E. Electronics Engineering (VLSI Design and Technology)

PSNA College of Engineering and Technology

---

⭐ If you found this project useful, consider giving it a Star on GitHub!
