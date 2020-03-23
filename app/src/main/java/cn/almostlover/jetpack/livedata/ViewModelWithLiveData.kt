package cn.almostlover.jetpack.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelWithLiveData :ViewModel(){
     var count: MutableLiveData<Int>? =null

    fun gotCount():MutableLiveData<Int>{
        if(count==null){
            count = MutableLiveData()
            count!!.value = 25
        }
        return count as MutableLiveData<Int>
    }

    fun addCount(){
        var value  = count!!.value
        count!!.value = count!!.value!! +1
    }

}