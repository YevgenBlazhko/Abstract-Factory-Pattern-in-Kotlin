package com.app.abstractfactorykotlin.orders

import com.app.abstractfactorykotlin.ClientOrder
import com.app.abstractfactorykotlin.classic_style.ClassicFurnitureFactory

class ClassicFurnitureOrder {

  fun doOrder(clientOrder: ClientOrder): String {
    val classicFurnitureFactory = ClassicFurnitureFactory()
    val sofa = classicFurnitureFactory.orderSofa()
    val table = classicFurnitureFactory.orderTable()
    val chair = classicFurnitureFactory.orderChair()

    return "${sofa.responseSofa(clientOrder.sofa)}\n" +
        "${table.responseTable(clientOrder.table)}\n" +
        "${chair.responseChair(clientOrder.chair)}"
  }
}