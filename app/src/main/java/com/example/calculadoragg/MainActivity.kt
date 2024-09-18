package com.example.calculadoragg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var tvResultado01:TextView
    lateinit var etNumero01:EditText
    lateinit var etNumero02:EditText

    lateinit var btSumar:Button
    lateinit var btRestar:Button
    lateinit var btMultiplicar:Button
    lateinit var btDividir:Button

    var numero01:Double = 0.0
    var numero02:Double = 0.0

    var suma:Double = 0.0
    var resta:Double = 0.0
    var multiplicacion:Double = 0.0
    var division:Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initComponents()
        initListener()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initComponents(){
        tvResultado01 = findViewById (R.id.tvResultado)
        etNumero01 = findViewById(R.id.etNumero01)
        etNumero02 = findViewById(R.id.etNumero02)

        btSumar = findViewById(R.id.btSuma)
        btRestar = findViewById(R.id.btResta)
        btMultiplicar = findViewById(R.id.btMultiplicar)
        btDividir = findViewById(R.id.btDividir)
    }
    private fun initListener(){
        btSumar.setOnClickListener(){
            suma()
        }
        btRestar.setOnClickListener(){
            resta()
        }
        btMultiplicar.setOnClickListener(){
            multiplicar()
        }
        btDividir.setOnClickListener(){
            division()
        }
    }
    private fun suma(){
        //Importante el .text
        numero01 = etNumero01.text.toString().toDouble()
        numero02 = etNumero02.text.toString().toDouble()

        suma = numero01 + numero02

        tvResultado01.text = suma.toString()
    }
    private fun resta(){
        //Importante el .text
        numero01 = etNumero01.text.toString().toDouble()
        numero02 = etNumero02.text.toString().toDouble()

        resta = numero01 - numero02

        tvResultado01.text = resta.toString()
    }
    private fun multiplicar(){
        //Importante el .text
        numero01 = etNumero01.text.toString().toDouble()
        numero02 = etNumero02.text.toString().toDouble()

        multiplicacion = (numero01 * numero02)

        tvResultado01.text = multiplicacion.toString()
    }
    private fun division(){
        //Importante el .text
        numero01 = etNumero01.text.toString().toDouble()
        numero02 = etNumero02.text.toString().toDouble()

        division = numero01 / numero02

        tvResultado01.text = division.toString()
    }

}