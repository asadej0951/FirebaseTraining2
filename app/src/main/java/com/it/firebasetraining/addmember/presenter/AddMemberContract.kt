package com.it.firebasetraining.addmember.presenter

class AddMemberContract {
    interface View {
        fun addMemberSuccess()
    }

    interface Presenter {
        fun addMemberUser(userId: String?, name: String?, weight: String?, height: String?)
    }
}