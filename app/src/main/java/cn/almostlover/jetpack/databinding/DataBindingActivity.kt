package cn.almostlover.jetpack.databinding

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import cn.almostlover.jetpack.R

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = DataBindingUtil.setContentView<ActivityDataBindingActivityBinding>(this,R.layout.activity_data_binding_activity)
        val viewModelBind = ViewModelProvider(this).get(MyViewModelBind::class.java)
        binding.data=viewModelBind
        binding.lifecycleOwner = this


    }
}
