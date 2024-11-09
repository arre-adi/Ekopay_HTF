package com.example.ekopay.bottomnav

import android.service.quickaccesswallet.SelectWalletCardRequest
import com.example.ekopay.R



sealed class BottomBarScreen(
    val route: String,
    val icon: Int,
) {
    object Home: BottomBarScreen(
        route = "home",
        icon = R.drawable.home,
    )


    object History: BottomBarScreen(
        route = "history",
        icon = R.drawable.history,
    )


    object Shopping: BottomBarScreen(
        route = "shop",
        icon = R.drawable.shop
    )

    object Trade: BottomBarScreen(
        route = "trade",
        icon = R.drawable.trade,
    )

}