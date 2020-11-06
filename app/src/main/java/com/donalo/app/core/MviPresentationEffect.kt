package com.donalo.app.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow

@Suppress("USELESS_CAST")
@FlowPreview
@ExperimentalCoroutinesApi
interface MviPresentationEffect<TUiEffect : MviUiEffect> {
    fun uiEffect(): Flow<TUiEffect>
}