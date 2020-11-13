package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts.BusinessLogic
import com.example.uts.R
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity() {
    private val businessLogic= BusinessLogic()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val angkaPertama=edtPertama.text
        val angkaKedua=edtKedua.text
        btnHitung.setOnClickListener {
            txtHasil.text= "Hasilnya = ${businessLogic.hitungAngka(angkaPertama.toString().toInt(),
                angkaKedua.toString().toInt())}"}
    }
}