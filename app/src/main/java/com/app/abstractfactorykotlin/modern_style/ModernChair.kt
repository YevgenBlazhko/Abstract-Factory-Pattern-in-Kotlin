package com.app.abstractfactorykotlin.modern_style

import com.app.abstractfactorykotlin.Chair

class ModernChair: Chair {
  override fun responseChair(number: Int): String {
    val word = if (number == 1) "chair" else "chairs"
    return "Ordered $number modern $word"
  }

}