package com.app.abstractfactorykotlin.modern_style

import com.app.abstractfactorykotlin.Sofa

class ModernSofa: Sofa {
  override fun responseSofa(number: Int): String {
    val word = if (number == 1) "sofa" else "sofas"
    return "Ordered $number modern $word"
  }

}