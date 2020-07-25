package com.ccf.wc.profile.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.ccf.wc.baselib.core.ProfileConstants
import com.ccf.wc.profile.entity.User

@Route(path = ProfileConstants.SERVICE_PROFILE)
class UserServiceImpl : IUserService, IProvider {

    override fun init(context: Context?) {
    }

    override fun getUser(): User {
        return User("Ccf", "", 1, 29)
    }
}