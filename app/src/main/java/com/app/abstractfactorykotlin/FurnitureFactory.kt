package com.app.abstractfactorykotlin

interface FurnitureFactory {
  fun orderSofa(): Sofa
  fun orderTable(): Table
  fun orderChair(): Chair
}