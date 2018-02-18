package com.invasionofsmallcubes

class Statements(private val printer: Printer) {

    private val statements = mutableListOf<Statement>()

    fun record(statement: Statement) {
        statements.add(statement)
    }

    fun print() {
        statements.forEach { s -> printer.print(s) }
    }
}