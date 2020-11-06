package com.donalo.app.ui.donationlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.donalo.app.databinding.ItemDonationBinding
import com.donalo.app.setImageUrlRounded
import javax.inject.Inject


class DonationAdapter @Inject constructor(private val onDonationTapped: (UiDonationDetail) -> Unit) :
    ListAdapter<UiDonationDetail, DonationAdapter.ViewHolder>(object :
        DiffUtil.ItemCallback<UiDonationDetail>() {
        override fun areItemsTheSame(oldItem: UiDonationDetail, newItem: UiDonationDetail) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: UiDonationDetail, newItem: UiDonationDetail) =
            oldItem == newItem
    }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemDonationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val insurance = getItem(position)

        holder.apply {
            bind(insurance)
            itemView.tag = insurance
            itemView.setOnClickListener {
                insurance?.let {
                    onDonationTapped(it)
                }
            }
        }
    }

    class ViewHolder(private val binding: ItemDonationBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: UiDonationDetail?) {
            item?.let {
                binding.apply {
                    ivDonation.setImageUrlRounded(item.imageURL)
                    tvTitle.text = it.title
                }
            }
        }
    }
}