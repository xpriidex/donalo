package com.donalo.app.ui.donationlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.donalo.app.R
import com.donalo.app.databinding.DonationListFragmentBinding
import com.donalo.app.presentation.donationlist.DonationListViewModel
import com.donalo.app.toast

class DonationListFragment : Fragment() {

    private var viewBinding: DonationListFragmentBinding? = null

    private val viewModel by viewModels<DonationListViewModel>()

    private var donationAdapter: DonationAdapter =
        DonationAdapter(onDonationTapped = ::onDonationTapped)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = DonationListFragmentBinding.inflate(inflater, container, false)
        return viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding?.apply {
            fabAddDonation.setOnClickListener {
                findNavController().navigate(R.id.action_donationListFragment_to_donationCreateFragment)
            }
        }
        setupAdapter()
        showDonations()
    }

    private fun setupAdapter() {
        viewBinding?.let {
            it.rvDonations.adapter = donationAdapter
        }
    }

    private fun showDonations() {
        val donations = listOf(
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            ),
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            ),
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            ),
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            ),
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            ),
            UiDonationDetail(
                "https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg",
                "1",
                "zapatillas",
                "Zapatillas en buen estado",
                "Vestimenta",
                "+56 9 3129 1291"
            )
        )


        donationAdapter.submitList(donations)
    }

    /*const initialArticles = [
  {
    image: 'https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg',
    title: 'zapatillas',
    description: 'Zapatillas en buen estado!',
    category: 'Vestimenta',
    name: 'Dylan Rodríguez',
    contact: '+56 9 3129 1291'
  },
  {
    image: 'https://d2ry86xmro5c1v.cloudfront.net/media/catalog/product/cache/1/image/600x600/9df78eab33525d08d6e5fb8d27136e95/1/0/106444_fit_burdeo_iso_1.jpg',
    title: 'Mochila',
  },
  {
    image: 'https://billabongcl.vtexassets.com/arquivos/ids/158965-440-440?width=440&height=440&aspect=true',
    title: 'Poleras',
  },
  {
    image: 'https://i.linio.com/p/555ea6df0dcc0fb5b31aab89c7a09d18-product.jpg',
    title: 'Notebook',
  },
  {
    image: 'https://images.segundamano.mx/api/v1/smmx/images/45/4571573527.jpg?rule=medium',
    title: 'Celular',
  },
  {
    image: 'https://static.ideal.es/www/multimedia/201801/11/media/cortadas/abrigozara8995euros-kknC-U5059697548948D-624x550@Ideal.jpg',
    title: 'Abrigo',
  },
  {
    image: 'https://vanscl.vteximg.com.br/arquivos/ids/540172-1000-1000/VN0A3MVU_Y28_1.jpg?v=637259889815600000',
    title: 'Zapatillas',
  },
  {
    image: 'https://sodimac.scene7.com/is/image//SodimacCL/1087878',
    title: 'Microondas',
  },
  {
    image: 'https://celta.cl/wp-content/uploads/2019/10/300012-300x300.jpg.webp',
    title: 'Cama',
  },
  {
    image: 'https://static.mercadoshops.com/celular-usado-star-b94m-android-45-pulgadas-12-megapixeles_iZ999429993XvZgrandeXpZ3XfZ97175612-481380107-3XsZ97175612xIM.jpg',
    title: 'celular',
  },
  {
    image: 'https://images.segundamano.mx/api/v1/smmx/images/45/4571573527.jpg?rule=medium',
    title: 'Celular',
  },
  {
    image: 'https://bata.digitag.cl/48557-large_default/zapatilla-hombre-titan.jpg',
    title: 'zapatillas',
    description: 'Son unas zapatillas usadas pero bonitas :D',
    category: 'Vestimenta',
    name: 'Dylan Rodríguez',
    contact: '+56 9 3129 1291'
  },
  {
    image: 'https://static.ideal.es/www/multimedia/201801/11/media/cortadas/abrigozara8995euros-kknC-U5059697548948D-624x550@Ideal.jpg',
    title: 'Abrigo',
  },
  {
    image: 'https://vanscl.vteximg.com.br/arquivos/ids/540172-1000-1000/VN0A3MVU_Y28_1.jpg?v=637259889815600000',
    title: 'Zapatillas',
  },

  {
    image: 'https://static.ideal.es/www/multimedia/201801/11/media/cortadas/abrigozara8995euros-kknC-U5059697548948D-624x550@Ideal.jpg',
    title: 'Abrigo',
  },
  {
    image: 'https://vanscl.vteximg.com.br/arquivos/ids/540172-1000-1000/VN0A3MVU_Y28_1.jpg?v=637259889815600000',
    title: 'Zapatillas',
  },
  {
    image: 'https://sodimac.scene7.com/is/image//SodimacCL/1087878',
    title: 'Microondas',
  },
  {
    image: 'https://celta.cl/wp-content/uploads/2019/10/300012-300x300.jpg.webp',
    title: 'Cama',
  },
  {
    image: 'https://static.mercadoshops.com/celular-usado-star-b94m-android-45-pulgadas-12-megapixeles_iZ999429993XvZgrandeXpZ3XfZ97175612-481380107-3XsZ97175612xIM.jpg',
    title: 'celular',
  },
]*/

    private fun onDonationTapped(uiDonationDetail: UiDonationDetail) {
        context?.toast(uiDonationDetail.toString())
    }
}