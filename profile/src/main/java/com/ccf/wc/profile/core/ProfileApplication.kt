package com.ccf.wc.profile.core

import com.ccf.wc.baselib.BaseApplication

class ProfileApplication: BaseApplication() {

    override fun initBaseAppModules() {
        registerBaseAppModule(ProfileAppModule::class.java)
    }
}