package com.hugh.memorandum.activity

import android.app.Activity
import android.os.Bundle

abstract class BaseActivity : Activity() {

    abstract fun setContentLayout(): Int
    abstract fun initView()
    abstract fun initData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setContentLayout())
        initView()
        initData()
    }
}
