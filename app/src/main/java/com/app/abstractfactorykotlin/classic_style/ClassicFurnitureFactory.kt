package com.app.abstractfactorykotlin.classic_style

import com.app.abstractfactorykotlin.Sofa
import com.app.abstractfactorykotlin.Chair
import com.app.abstractfactorykotlin.FurnitureFactory
import com.app.abstractfactorykotlin.Table

class ClassicFurnitureFactory: FurnitureFactory {
  override fun orderSofa(): Sofa {
    return ClassicSofa()
  }

  override fun orderTable(): Table {
    return ClassicTable()
  }

  override fun orderChair(): Chair {
    return ClassicChair()
  }
}