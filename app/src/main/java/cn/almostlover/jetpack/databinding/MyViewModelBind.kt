package cn.almostlover.jetpack.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModelBind:ViewModel(){
    var count : MutableLiveData<Int>? =null

    fun gotCount(): MutableLiveData<Int> {
        if(count==null){
            count = MutableLiveData()
            count!!.value = 25
        }
        return count as MutableLiveData<Int>
    }

    fun add(){
        var value  = count!!.value
        count!!.value = count!!.value!! +1
    }
}