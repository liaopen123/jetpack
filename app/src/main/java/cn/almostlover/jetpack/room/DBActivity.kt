package cn.almostlover.jetpack.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import cn.almostlover.jetpack.R
import cn.almostlover.jetpack.room.db.UserDatabase
import cn.almostlover.jetpack.room.entity.User
import kotlinx.android.synthetic.main.activity_d_b.*

class DBActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_b)
        //db名称随便起
        val db = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java, "user_db"
        ).allowMainThreadQueries().build()


        insert.setOnClickListener {
            val wordDao = db.getWordDao()
            for(index in 1..10){
                wordDao.insertAll(User(index,"liaopenghui$index","廖鹏辉$index"))
            }
            val all = wordDao.getAll()
            tv_content.text  = all.toString()
        }


    }
}
