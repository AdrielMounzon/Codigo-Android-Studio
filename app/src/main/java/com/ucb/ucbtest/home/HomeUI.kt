package com.ucb.ucbtest.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.ucb.ucbtest.R
import com.ucb.ucbtest.service.Util

@Composable
fun HomeUI() {

    val completeName = "Roberto Carlos Callisaya Mamani"

    Scaffold {
        innerPadding -> Box( modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = ""
                )
                Text(
                    stringResource(R.string.home_welcome_text, completeName)
                )
                val context = LocalContext.current


                IconButton(
                    onClick = {
                        Util.sendNotificatión(context)
                    }
                ) {
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = null,
                    )
                }

            }
    }
    }

}