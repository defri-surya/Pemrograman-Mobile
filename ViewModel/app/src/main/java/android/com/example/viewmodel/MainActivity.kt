package android.com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    lateinit var viewModel: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(DataViewModel::class.java)
        viewModel.getHitung().observe(this, getHitung)

        btn_hitung.setOnClickListener {
            hitung(edit_panjang.text.toString().trim(), edit_panjang.text.toString().trim(), edit_panjang.text.toString().trim())
        }
    }

    fun hitung(panjang: String, lebar: String, tinggi: String) {
        if (panjang.isEmpty() || lebar.isEmpty() || tinggi.isEmpty()) {
            Toast.makeText(applicationContext,"Data KOSONG", Toast.LENGTH_SHORT).show()
        } else {
            viewModel.setHitung(edit_panjang.text.toString().trim(), edit_lebar.text.toString().trim(), edit_tinggi.text.toString().trim())
        }
    }

    val getHitung = Observer<Result> {
        it.let {
            tv_result.text = it?.result
        }
    }
}