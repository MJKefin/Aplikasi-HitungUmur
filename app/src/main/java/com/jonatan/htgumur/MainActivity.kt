package com.jonatan.htgumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnhitung.setOnClickListener {
            var tahunLahir = txtTahun.text.toString().toInt()
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)
            var umur = 0
            if (tahunLahir.toInt() !=null){
                umur = tahun - tahunLahir.toInt()
                tv_hasil.text = "Umur = $umur Tahun"
            }else{
                tv_hasil.text = "Tahun Tidak Valid !"
            }

        }
    }
}
