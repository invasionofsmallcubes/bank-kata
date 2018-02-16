package com.invasionofsmallcubes

import io.mockk.mockk
import io.mockk.verifyOrder
import org.junit.Ignore
import org.junit.Test
import java.time.LocalDate.of

class AcceptanceTest {

    @Test
    @Ignore
    fun acceptanceTest() {
        val account = Account("Emanuele")
        val printer = mockk<Printer>(relaxed = true)
        account.deposit(Amount(1000), of(2012, 1, 10))
        account.deposit(Amount(2000), of(2012, 1, 13))
        account.withdrawal(Amount(500), of(2012, 1, 14))
        account.printStatement(printer)
        verifyOrder {
            printer.print(Statement(Amount(-500), of(2012, 1, 14), Amount(2500)))
            printer.print(Statement(Amount(2000), of(2012, 1, 13), Amount(3000)))
            printer.print(Statement(Amount(1000), of(2012, 1, 10), Amount(1000)))
        }
    }

}
