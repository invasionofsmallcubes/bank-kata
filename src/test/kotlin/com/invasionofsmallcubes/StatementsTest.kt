package com.invasionofsmallcubes

import io.mockk.mockk
import io.mockk.verifyOrder
import org.junit.Test
import java.time.LocalDate
import java.time.Month

class StatementsTest {

    @Test
    fun recordStatements() {
        val printer = mockk<Printer>(relaxed = true)
        val statements = Statements(printer)
        val firstExpectedStatement = Statement(Amount(100), LocalDate.of(2017, Month.MARCH, 10), Amount(100))
        val secondExpectedStatement = Statement(Amount(111), LocalDate.of(2018, Month.APRIL, 1), Amount(211))
        statements.record(firstExpectedStatement)
        statements.record(secondExpectedStatement)
        statements.print()
        verifyOrder {
            printer.print(firstExpectedStatement)
            printer.print(secondExpectedStatement)
        }
    }
}

