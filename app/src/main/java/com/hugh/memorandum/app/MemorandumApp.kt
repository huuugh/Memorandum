package com.hugh.memorandum.app

import android.app.Application
import android.database.sqlite.SQLiteDatabase
import com.hugh.memorandum.greendao.DaoMaster
import com.hugh.memorandum.greendao.DaoSession

class MemorandumApp : Application() {
    private var mHelper: DaoMaster.DevOpenHelper? = null
    var db: SQLiteDatabase? = null
        private set
    private var mDaoMaster: DaoMaster? = null
    var daoSession: DaoSession? = null
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        setDatabase()
    }

    private fun setDatabase() {
        mHelper = DaoMaster.DevOpenHelper(this, "memorandum-db", null)
        db = mHelper!!.writableDatabase
        mDaoMaster = DaoMaster(db)
        daoSession = mDaoMaster!!.newSession()
    }

    companion object {
        var instance: MemorandumApp? = null
    }
}
