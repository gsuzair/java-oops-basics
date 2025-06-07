Core Features (to be developed step-by-step)
Person Management

Represent people using the Person class (name, age, ID).
Extend into roles like Customer and Employee.

Bank Account System

Create different types of accounts: savings, checking, fixed deposit.
Each account belongs to a person.
Support deposits, withdrawals, and balance inquiry.

Transaction Logging

Maintain a history of all transactions (date, amount, type).
Use Transaction objects and link them to accounts.

Bank Entity

Store and manage all customer accounts.
Support account creation and lookup.
Add logic for loan eligibility or tax calculation using interfaces.


✅ Week 1 – Core Object Modeling & Interaction

Created Person and BankAccount classes.
Added private fields (e.g., name, age, balance).
Created constructors.
Implemented getters and setters.
Made sure each BankAccount has a Person as its owner.

Goal: Learn object creation and interaction.

Next steps this week:

Write a simple Main method:
Create a Person object.
Create a BankAccount for them.
Print out account details including owner name.

Outcome:
You understand object composition, encapsulation, and how to wire up basic classes.

🔄 Week 2 – Inheritance and Polymorphism
What to do:

Extend Person into subclasses like:
Customer (has customer ID)
Employee (has role, salary)
Create a BankEmployee class who can perform operations like approving accounts or loans.
Convert BankAccount into a base class:
Make subclasses like SavingsAccount, CheckingAccount, FixedDepositAccount.

Concepts:

Inheritance
Method overriding
Polymorphism (e.g., different account types have different calculateInterest() methods)

Outcome:
You start applying "is-a" relationships and learn dynamic method dispatch (runtime polymorphism).

📐 Week 3 – Abstraction and Interfaces
What to do:

Make BankAccount an abstract class with a method like calculateCharges().
Create interfaces like:
Taxable → method: calculateTax()
LoanEligible → method: checkEligibility()

Use interfaces with:

Certain account types that implement Taxable
Customer or Person who can implement LoanEligible

Concepts:

Abstract classes
Interfaces
Loose coupling

Outcome:
You understand abstraction — hiding the internal logic while exposing necessary behaviors.

🔗 Week 4 – Object Relationships & System Expansion
What to do:

Create a Bank class:
Holds a list of BankAccount objects.
Can create accounts, look up customers.
Make Person own multiple BankAccounts.

Create a Transaction class:

Logs deposits, withdrawals, transfers.

Concepts:

Composition, Aggregation
Collections (like ArrayList)
One-to-many and many-to-one relationships

Outcome:
You can model real-world systems with proper class relationships and collection handling.

⚙️ Week 5 – Enums, Inner Classes, Exceptions
What to do:

Add enum types for:

AccountType (SAVINGS, CHECKING)
TransactionType (DEPOSIT, WITHDRAWAL, TRANSFER)

Create custom exceptions:

InsufficientFundsException, InvalidAccountException
Add an inner class inside BankAccount or Person for something like:
DebitCard, Address, etc.

Concepts:

Enumerations
Exception handling (try-catch-finally)
Inner/nested classes

Outcome:
You handle edge cases, make your code more readable and maintainable.

🧪 Week 6 – Simulate a Working Mini Banking App
What to do:

Build a command-line based simulation with a menu like:

Create person
Open bank account
Deposit/withdraw/transfer
Show account summary
Show transaction history
Refactor code into packages (e.g., model, service, util)
Add basic validation (e.g., no negative balance)

Concepts:

Bringing it all together.
CLI interaction
Clean project structure

Outcome:
You now have a working OOP-based Java banking system that shows:

Object interaction
Abstraction
Polymorphism
Exception handling
Real-world modeling