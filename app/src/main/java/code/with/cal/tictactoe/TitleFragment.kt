package code.with.cal.tictactoe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import code.with.cal.tictactoe.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)

        binding.button.setOnClickListener { view: View ->
            val action = TitleFragmentDirections.actionTitleFragmentToGameActivity()
            view.findNavController().navigate(action)
        }

        return binding.root
    }
}
