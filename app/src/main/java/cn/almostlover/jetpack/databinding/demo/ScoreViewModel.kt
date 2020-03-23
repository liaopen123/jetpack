package cn.almostlover.jetpack.databinding.demo

import android.util.MutableDouble
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var red_score: MutableLiveData<Int>? = null
    var blue_score: MutableLiveData<Int>? = null

    fun gotRedScore(): MutableLiveData<Int> {
        if (red_score == null) {
            red_score = MutableLiveData()
            red_score!!.value = 0
        }
        return red_score as MutableLiveData<Int>
    }


    fun setRedScore(point: Int) {
        val currentScore = red_score!!.value
        red_score!!.value = currentScore!! + point
    }
    fun gotBlueScore(): MutableLiveData<Int> {
        if (blue_score == null) {
            blue_score = MutableLiveData()
            blue_score!!.value = 0
        }
        return blue_score as MutableLiveData<Int>
    }


    fun setBlueScore(point: Int) {
        val currentScore = blue_score!!.value
        blue_score!!.value = currentScore!! + point
    }


}