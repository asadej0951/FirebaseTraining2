package com.it.firebasetraining.home

import com.it.firebasetraining.home.model.UserListModel

interface UserCallback {
    fun onSelectItem(userListModel: UserListModel?)
    fun onSelectItemLongClick(userListModel: UserListModel?)
}