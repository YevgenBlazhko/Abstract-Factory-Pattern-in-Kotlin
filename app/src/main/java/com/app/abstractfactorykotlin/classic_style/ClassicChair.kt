package com.app.abstractfactorykotlin.classic_style

import com.app.abstractfactorykotlin.Chair

class ClassicChair: Chair {
  override fun responseChair(number: Int): String {
    val word = if (number == 1) "chair" else "chairs"
    return "Ordered $number classic $word"
  }

}