package com.invasionofsmallcubes

import java.time.LocalDate

class Account(customerName: String, private val statements: Statements) {

    private var balance = Amount(0)

    fun deposit(amount: Amount, dateOfTransaction: LocalDate) {
        val newBalance = balance.plus(amount)
        balance = newBalance
        statements.record(Statement(amount, dateOfTransaction, newBalance))
    }

    fun withdrawal(amount: Amount, dateOfTransaction: LocalDate) {
    }

    fun printStatement() {
        statements.print()
    }
}