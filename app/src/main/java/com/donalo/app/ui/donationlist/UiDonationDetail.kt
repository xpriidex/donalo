package com.donalo.app.ui.donationlist

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Parcelize
@Keep
data class UiDonationDetail(val imageURL: String,
                            val id: String,
                            val title: String,
                            val description: String,
                            val category: String,
                            val contact: String
) : Parcelable
