package com.app.abstractfactorykotlin.orders

import com.app.abstractfactorykotlin.ClientOrder
import com.app.abstractfactorykotlin.modern_style.ModernFurnitureFactory

class ModernFurnitureOrder {

  fun doOrder(clientOrder: ClientOrder): String {
    val modernFurnitureOrder = ModernFurnitureFactory()
    val sofa = modernFurnitureOrder.orderSofa()
    val table = modernFurnitureOrder.orderTable()
    val chair = modernFurnitureOrder.orderChair()

    return "${sofa.responseSofa(clientOrder.sofa)}\n" +
        "${table.responseTable(clientOrder.table)}\n" +
        "${chair.responseChair(clientOrder.chair)}"
  }
}