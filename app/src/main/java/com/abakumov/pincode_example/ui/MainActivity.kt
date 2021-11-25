package com.abakumov.pincode_example.ui


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.graphics.Typeface
import android.os.Bundle
import android.util.Log


// for UI elements
import android.view.View
import android.widget.*
import com.abakumov.pincode_example.R

import com.abakumov.pincode_example.model.PinCodeUpdate
import com.abakumov.pincode_example.pref.Pref
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // for UI
    private lateinit var linearLayout: LinearLayout
    private lateinit var logotype: TextView
    private lateinit var customFont: Typeface
    private lateinit var imageViewNum1: ImageView
    private lateinit var imageViewNum2: ImageView
    private lateinit var imageViewNum3: ImageView
    private lateinit var imageViewNum4: ImageView
    private lateinit var crate: Button
    private lateinit var sigIn: Button
    var create = false

    private var pin =""



    // for list(PIN-code) and list(Image)
    private lateinit var listPINcode: ArrayList<String>
    private lateinit var listImageView: ArrayList<ImageView>


    // for set full PIN-code(****)
    private lateinit var pinCodeUpdate: PinCodeUpdate


    private lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout = findViewById(R.id.linearLayoutPin)
        imageViewNum1 = findViewById(R.id.num1)
        imageViewNum2 = findViewById(R.id.num2)
        imageViewNum3 = findViewById(R.id.num3)
        imageViewNum4 = findViewById(R.id.num4)
//        crate = findViewById(R.id.created)
        checkFirstRun()

        // add font for main title
        logotype = findViewById(R.id.logotype)
        installFont(logotype)


        // initial list for numbers(PIN-code)
        listPINcode = ArrayList()
        // initial list for ImageView
        listImageView = ArrayList()
        // add ImageView in list
        listImageView.add(imageViewNum1)
        listImageView.add(imageViewNum2)
        listImageView.add(imageViewNum3)
        listImageView.add(imageViewNum4)


        // send listImageView and resources(for animation)
        pinCodeUpdate = PinCodeUpdate(listImageView, resources, linearLayout, this@MainActivity)


//        sigIn.setOnClickListener {
//
//        }
//        Log.d("pred","${Pref.localePassword}")

    }

//    private fun pinCheker(pin: String) {
//        if (pin.equals(Pref.localPassword)){
//            startActivity(Intent(this,HomeActivity::class.java))
//        }else{
//            Toast.makeText(this,"error",Toast.LENGTH_SHORT).show()
//            //TODO add anim
//        }
//    }

    private fun checkFirstRun() {
        if(Pref.isFirst){
//            crate.visibility = View.VISIBLE
            Pref.isFirst = false
            create = true
            textPIN_code.text = "Создать ПИН-код"
        }else{
//            crate.visibility = View.GONE
            textPIN_code.text = "ПИН-код"
            create = false
        }
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_1 -> addNumber("1")
            R.id.btn_2 -> addNumber("2")
            R.id.btn_3 -> addNumber("3")
            R.id.btn_4 -> addNumber("4")
            R.id.btn_5 -> addNumber("5")
            R.id.btn_6 -> addNumber("6")
            R.id.btn_7 -> addNumber("7")
            R.id.btn_8 -> addNumber("8")
            R.id.btn_9 -> addNumber("9")
            R.id.btn_0 -> addNumber("0")
            R.id.btn_delete -> addNumber("-1")
        }
    }

    private fun addNumber(number: String) {
        toast = Toast.makeText(applicationContext, number, Toast.LENGTH_SHORT)
        toast.show()
        pin += number
        pinCodeUpdate.onSetNumber(number,create)
    }

    private fun installFont(textView: TextView) {
        customFont = Typeface.createFromAsset(assets, "fonts/Lato-Bold.ttf")
        textView.typeface = customFont
    }
}
