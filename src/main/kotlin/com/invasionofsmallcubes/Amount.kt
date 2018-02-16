package com.invasionofsmallcubes

import java.math.BigDecimal

class Amount(val amount: Int) {
    val amountConv = BigDecimal(amount)
}