package org.gsm.software.androidnavigationgcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.gsm.software.androidnavigationgcomponent.databinding.ThirdHomeFragmentBinding

class ThirdHomeFragment : Fragment() {
    lateinit var bind : ThirdHomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate(inflater,R.layout.third_home_fragment,container,false)

        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.nextBtn.setOnClickListener { findNavController().navigate(R.id.firstHomeFragment) }
        bind.prevBtn.setOnClickListener { findNavController().navigate(R.id.secondHomeFragment) }
    }

}