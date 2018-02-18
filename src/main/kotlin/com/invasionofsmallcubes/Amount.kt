package com.invasionofsmallcubes

import java.math.BigDecimal

class Amount() {

    private var amountValue: BigDecimal = BigDecimal.ZERO

    constructor(amount: BigDecimal) : this() {
        amountValue = amount
    }

    constructor(amount: Int) : this() {
        amountValue = BigDecimal(amount)
    }

    fun plus(amount: Amount) : Amount {
        return Amount(amountValue.plus(amount.amountValue))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Amount

        if (amountValue != other.amountValue) return false

        return true
    }

    override fun hashCode(): Int {
        return amountValue.hashCode()
    }

    override fun toString(): String {
        return "Amount(amountValue=$amountValue)"
    }


}