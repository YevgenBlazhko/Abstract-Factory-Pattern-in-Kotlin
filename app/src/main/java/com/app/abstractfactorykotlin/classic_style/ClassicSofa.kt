package com.app.abstractfactorykotlin.classic_style

import com.app.abstractfactorykotlin.Sofa

class ClassicSofa: Sofa {

  override fun responseSofa(number: Int): String {
    val word = if (number == 1) "sofa" else "sofas"
    return "Ordered $number classic $word"
  }
}