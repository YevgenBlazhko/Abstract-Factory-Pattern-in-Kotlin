package com.app.abstractfactorykotlin.modern_style

import android.util.Log
import com.app.abstractfactorykotlin.Table

class ModernTable: Table {
  override fun responseTable(number: Int): String {
    val word = if (number == 1) "table" else "table"
    return "Ordered $number modern $word"
  }

}