package com.invasionofsmallcubes

import io.mockk.mockk
import io.mockk.verify
import io.mockk.verifyOrder
import org.junit.Test
import java.time.LocalDate
import java.time.Month

class DepositTest {
    private val printer = mockk<Printer>(relaxed = true)
    private val account = Account("Emanuele", Statements(printer))
    private val firstDateOfTransaction = LocalDate.of(2017, Month.MARCH, 30)
    private val secondDateOfTransaction = LocalDate.of(2017, Month.MARCH, 31)

    @Test
    fun addAmount() {
        account.deposit(Amount(100), firstDateOfTransaction)
        account.printStatement()
        verify {
            printer.print(Statement(Amount(100), firstDateOfTransaction, Amount(100)))
        }
    }

    @Test
    fun balanceUpdate() {
        account.deposit(Amount(100), firstDateOfTransaction)
        account.deposit(Amount(100), secondDateOfTransaction)
        account.printStatement()

        verifyOrder {
            printer.print(Statement(Amount(100), firstDateOfTransaction, Amount(100)))
            printer.print(Statement(Amount(100), secondDateOfTransaction, Amount(200)))
        }
    }


}