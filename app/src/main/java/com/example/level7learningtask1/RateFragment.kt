package com.example.level7learningtask1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_rate.*

/**
 * A simple [Fragment] subclass.
 */
class RateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navigate to RatedFragment and send the rating as arguments.
        btnRate.setOnClickListener {
            val action = RateFragmentDirections.actionRateFragment2ToRatedFragment(rbRate.rating)
            findNavController().navigate(action)
        }
    }

}
