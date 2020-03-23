package cn.almostlover.jetpack.databinding.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import cn.almostlover.jetpack.R
import cn.almostlover.jetpack.databinding.ActivityScoreDemoBinding

class BasketballActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityScoreDemoBinding>(this, R.layout.activity_score_demo)
        val teamModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        binding.team = teamModel
        binding.lifecycleOwner = this
    }
}
