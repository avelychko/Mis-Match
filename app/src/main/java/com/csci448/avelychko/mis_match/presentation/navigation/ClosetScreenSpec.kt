package com.csci448.avelychko.mis_match.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.csci448.avelychko.mis_match.ClosetView
import com.csci448.avelychko.mis_match.presentation.viewmodel.MisMatchViewModel
import com.csci448.avelychko.mis_match.ui.theme.OutfitBuilderView

object ClosetScreenSpec: IScreenSpec {
    override val route: String
        get() = "closet"

    @Composable
    override fun Content(viewModel: MisMatchViewModel, navController: NavController) {
        ClosetView() { navController.navigate("home") }
    }
}