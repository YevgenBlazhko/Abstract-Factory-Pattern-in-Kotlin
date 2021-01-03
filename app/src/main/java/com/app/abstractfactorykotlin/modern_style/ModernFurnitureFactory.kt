package com.app.abstractfactorykotlin.modern_style

import com.app.abstractfactorykotlin.Sofa
import com.app.abstractfactorykotlin.Chair
import com.app.abstractfactorykotlin.FurnitureFactory
import com.app.abstractfactorykotlin.Table

class ModernFurnitureFactory: FurnitureFactory {
  override fun orderSofa(): Sofa {
    return ModernSofa()
  }

  override fun orderTable(): Table {
    return ModernTable()
  }

  override fun orderChair(): Chair {
    return ModernChair()
  }
}