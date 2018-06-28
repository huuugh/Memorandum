package com.hugh.memorandum.activity

import android.view.Menu
import android.view.View
import jp.wasabeef.glide.transformations.BlurTransformation
import kotlinx.android.synthetic.main.activity_main.*
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.Glide
import com.hugh.memorandum.R


class MainActivity : BaseActivity() {
    override fun setContentLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        Glide.with(this).load(R.drawable.bg_all)
                .bitmapTransform(BlurTransformation(this, 25), CenterCrop(this))
                .into(bg)
        back.setOnClickListener{
            finish()
        }
        edit.setOnClickListener {

        }
    }

    override fun initData() {

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }
}
