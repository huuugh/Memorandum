package com.hugh.memorandum.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseRecycleViewAdapter<in T, in VH:RecyclerView.ViewHolder>(mContext:Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var mList:ArrayList<T> = ArrayList()
    private var layoutInflater:LayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val mItemView = layoutInflater.inflate(setItemLayout(), parent, false)
        return createViewHolder(mItemView)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        bindViewHolder(
                holder as VH,
                mList[position],
                position
        )
    }

    private fun addData(dataList: List<T>, isRefresh: Boolean) {
        if (isRefresh) {
            mList.clear()
        }
        mList.addAll(dataList)
        notifyDataSetChanged()
    }

    fun addRefreshData(dataList: List<T>) {
        addData(dataList, true)
    }

    fun addLoadData(dataList: List<T>) {
        addData(dataList, false)
    }

    abstract fun setItemLayout():Int

    abstract fun createViewHolder(view:View):RecyclerView.ViewHolder

    abstract fun bindViewHolder(holder: VH, mData:T, pos:Int)
}
