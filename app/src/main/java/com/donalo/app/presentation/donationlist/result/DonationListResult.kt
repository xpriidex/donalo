package com.donalo.app.presentation.donationlist.result

import com.donalo.app.core.MviResult


sealed class DonationListResult: MviResult {

    sealed class GetAllDonationListResult : DonationListResult() {
        object Loading : GetAllDonationListResult()
        data class GetDonationList(val donationList: List<String>) : GetAllDonationListResult()
        data class Error(val error: Throwable) : GetAllDonationListResult()
    }
}