package cn.almostlover.jetpack.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import cn.almostlover.jetpack.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        textView.text = "${viewModel.count}"
        button.setOnClickListener {
            viewModel.count++
            textView.text = "${viewModel.count}"
        }
        button2.setOnClickListener {
            viewModel.count += 2
            textView.text = "${viewModel.count}"
        }
    }
}
