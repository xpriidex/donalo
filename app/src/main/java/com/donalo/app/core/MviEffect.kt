package com.donalo.app.core

interface MviEffect<in TUiEffect : MviUiEffect> {
    fun handleEffect(uiEffect: TUiEffect)
}