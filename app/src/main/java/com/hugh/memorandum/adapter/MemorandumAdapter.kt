package com.hugh.memorandum.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

import com.hugh.memorandum.R
import com.hugh.memorandum.bean.Memo
import kotlin.coroutines.experimental.buildIterator

class MemorandumAdapter(context: Context) : BaseRecycleViewAdapter<Memo, MemorandumAdapter.MemoViewHolder>(context) {

    override fun setItemLayout(): Int {
        return R.layout.memorandum_item
    }

    override fun createViewHolder(view: View): RecyclerView.ViewHolder {
        return MemoViewHolder(view)
    }

    override fun bindViewHolder(holder:MemorandumAdapter.MemoViewHolder, mData: Memo, pos: Int) {
        //holder.tv_content.text = mData.content
        //holder.tv_create_time = mData.createTime.
    }

    class MemoViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        var tv_content:TextView = itemView!!.findViewById(R.id.memorandum_content) as TextView
        var tv_create_time:TextView = itemView!!.findViewById(R.id.memorandum_create_time) as TextView
        var tv_update_time:TextView = itemView!!.findViewById(R.id.memorandum_update_time) as TextView
    }

}
