package com.csci448.avelychko.mis_match.presentation.navigation

import StyleScreen
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.csci448.avelychko.mis_match.presentation.viewmodel.MisMatchViewModel
import com.csci448.avelychko.mis_match.ui.theme.OutfitBuilderView

object StyleGeneratorSpec: IScreenSpec {
    override val route: String
        get() = "style generator"

    @Composable
    override fun Content(viewModel: MisMatchViewModel, navController: NavController) {
        var context = LocalContext.current
        StyleScreen(viewModel = viewModel, onStyleClicked = {
            Toast
            .makeText(context,
                "Change Style",
                Toast.LENGTH_SHORT)
            .show()
        }, onLogoClicked = { navController.navigate("home") }
        )
    }
}
