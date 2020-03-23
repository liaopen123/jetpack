package cn.almostlover.jetpack.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cn.almostlover.jetpack.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        val data = ViewModelProvider(this).get(ViewModelWithLiveData::class.java)
        data.gotCount().observe(this, Observer<Int> {
            textView2.text="$it"
        })
        imageButton.setOnClickListener {
            data.addCount()
        }

    }
}
