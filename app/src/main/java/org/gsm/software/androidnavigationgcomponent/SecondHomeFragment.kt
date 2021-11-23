package org.gsm.software.androidnavigationgcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import org.gsm.software.androidnavigationgcomponent.databinding.SecondHomeFragmentBinding

class SecondHomeFragment : Fragment() {
    lateinit var bind : SecondHomeFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate(inflater,R.layout.second_home_fragment,container,false)
        return bind.root
    }
    }