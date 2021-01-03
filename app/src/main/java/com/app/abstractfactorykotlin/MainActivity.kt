package com.app.abstractfactorykotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.app.abstractfactorykotlin.orders.ClassicFurnitureOrder
import com.app.abstractfactorykotlin.orders.ModernFurnitureOrder

class MainActivity : AppCompatActivity() {

  private val summary: TextView by lazy { findViewById(R.id.summary_tv) }
  private val sofaEt: EditText by lazy {findViewById(R.id.sofa_et)}
  private val tableEt: EditText by lazy {findViewById(R.id.table_et)}
  private val chairEt: EditText by lazy {findViewById(R.id.chair_et)}
  private val orderBtn: Button by lazy { findViewById(R.id.order_btn) }
  private val furnitureTypeRg: RadioGroup by lazy { findViewById(R.id.furniture_type_rg) }

  private val classicFurnitureOrder: ClassicFurnitureOrder by lazy { ClassicFurnitureOrder() }
  private val modernFurnitureOrder: ModernFurnitureOrder by lazy { ModernFurnitureOrder() }

  private var furnitureType = FurnitureType.CLASSIC

  var numSofas = 0
  var numChairs = 0
  var numTables = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    sofaEt.addTextChangedListener {
      val text = it.toString()
      numSofas = if (text.isEmpty()) 0 else text.toInt()
    }

    chairEt.addTextChangedListener {
      val text = it.toString()
      numChairs = if (text.isEmpty()) 0 else text.toInt()
    }

    tableEt.addTextChangedListener {
      val text = it.toString()
      numTables = if (text.isEmpty()) 0 else text.toInt()
    }

    furnitureTypeRg.setOnCheckedChangeListener { _, checkedId ->
      furnitureType =
        if (checkedId == R.id.classic_furniture_rb) FurnitureType.CLASSIC
        else FurnitureType.MODERN
    }

    orderBtn.setOnClickListener {
      val clientOrder = ClientOrder(numSofas, numChairs, numTables)
      val detailsOrder =
        if (furnitureType == FurnitureType.CLASSIC) classicFurnitureOrder.doOrder(clientOrder)
        else modernFurnitureOrder.doOrder(clientOrder)
      summary.text = detailsOrder
    }


  }

}