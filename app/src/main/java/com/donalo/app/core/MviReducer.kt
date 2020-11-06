package com.donalo.app.core

interface MviReducer<S : MviUiState, R: MviResult> {

    infix fun S.reduce(result: R): S

}