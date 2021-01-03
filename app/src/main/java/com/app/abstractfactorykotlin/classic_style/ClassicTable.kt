package com.app.abstractfactorykotlin.classic_style

import com.app.abstractfactorykotlin.Table

class ClassicTable: Table {

  override fun responseTable(number: Int): String {
    val word = if (number == 1) "table" else "tables"
    return "Ordered $number classic $word"
  }
}