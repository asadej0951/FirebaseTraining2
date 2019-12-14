package com.it.firebasetraining.home.adapter


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.it.firebasetraining.home.UserCallback
import com.it.firebasetraining.home.model.UserListModel
import kotlinx.android.synthetic.main.item_member_user.view.*

class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var textViewName = itemView.tv_name
    var textViewUserId = itemView.tv_userId
    var itemUser = itemView.item_user
    var textViewBmi = itemView.tv_bmi

    fun bindData(
        userListModel: UserListModel?,
        callback: UserCallback?
    ) {

        textViewName.text = "Name : " + userListModel?.name
        textViewUserId.text = "ID : ${userListModel?.idUser}"
        textViewBmi.text = "BMI : ${userListModel?.bmi}"

        itemUser?.apply {

            setOnClickListener {
                callback?.onSelectItem(userListModel)
            }

            setOnLongClickListener {
                it.post {
                    callback?.onSelectItemLongClick(userListModel)
                }
            }
        }
    }

}