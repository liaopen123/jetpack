package cn.almostlover.jetpack.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import cn.almostlover.jetpack.room.dao.UserDao
import cn.almostlover.jetpack.room.entity.User

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class UserDatabase:RoomDatabase() {
abstract fun getWordDao():UserDao
}