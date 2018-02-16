package com.invasionofsmallcubes

import java.time.LocalDate

data class Statement(val amount: Amount, val dateOfTransaction: LocalDate, val balance: Amount)