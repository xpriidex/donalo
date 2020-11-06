package com.donalo.app.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

@Suppress("USELESS_CAST")
@FlowPreview
@ExperimentalCoroutinesApi
interface MviPresentation<TUserIntent : MviUserIntent, TUiState : MviUiState> {
    fun processUserIntents(userIntents: Flow<TUserIntent>)
    fun uiStates(): StateFlow<TUiState>
}