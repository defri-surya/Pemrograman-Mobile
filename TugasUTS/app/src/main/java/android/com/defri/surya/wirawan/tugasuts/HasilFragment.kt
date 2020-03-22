package android.com.defri.surya.wirawan.tugasuts


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_hasil.*
import kotlinx.android.synthetic.main.fragment_input.*

/**
 * A simple [Fragment] subclass.
 */
class HasilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil, container, false)
    }
    override fun onViewCreated(view:View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hasilTangkap = arguments?.getString("args")

        textHasil.text = hasilTangkap
    }

}
