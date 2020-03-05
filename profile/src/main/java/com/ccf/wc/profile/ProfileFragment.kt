package com.ccf.wc.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ccf.wc.baselib.core.ProfileConstants
import com.ccf.wc.baselib.ui.Constants
import kotlinx.android.synthetic.main.fragment_profile.*

@Route(path = ProfileConstants.ENTRY_FRAGMENT)
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exit_account.setOnClickListener {
            val fragment: DialogFragment = ARouter.getInstance()
                .build(Constants.ROUTE_ALERT_DIALOG)
                .withString(Constants.EXTRA_ALERT_MESSAGE, "Exit My Account")
                .navigation() as DialogFragment
            fragment.show(childFragmentManager, "")
        }
    }
}