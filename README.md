#### Do this kata using [Object Calisthenics](https://www.cs.helsinki.fi/u/luontola/tdd-2009/ext/ObjectCalisthenics.pdf):

1. One level of indentation per method
2. Don’t use the ELSE keyword
3. Wrap all primitives and Strings
4. First class collections
5. One dot per line
6. Don’t abbreviate
7. Keep all entities small
8. No classes with more than two instance variables
9. No getters/setters/properties

#### Functional requirements of the Bank Kata

- Deposit and Withdrawal
- Transfer
- Account statement (date, amount, balance)
- Statement printing
- Statement filters (just deposits, withdrawal, date)

#### Acceptance Criteria Example
> Given a client makes a deposit of 1000 on 10-01-2012

> And a deposit of 2000 on 13-01-2012

> And a withdrawal of 500 on 14-01-2012

> When she prints her bank statement

> Then she would see

> date || credit || debit || balance

> 14/01/2012 || || 500.00 || 2500.00

> 13/01/2012 || 2000.00 || || 3000.00

> 10/01/2012 || 1000.00 || || 1000.00

#### Credits

Original [Kata](https://github.com/sandromancuso/Bank-kata) by Sandro Mancuso