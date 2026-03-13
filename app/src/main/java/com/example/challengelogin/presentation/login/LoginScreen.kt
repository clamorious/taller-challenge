package com.example.challengelogin.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.challengelogin.R
import com.example.challengelogin.presentation.home.HomeScreenContent
import org.koin.androidx.compose.koinViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel = koinViewModel()) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    if (uiState.data != null) {
        HomeScreenContent(uiState.data)
    } else {
        LoginContent(
            username = uiState.username ?: "",
            password = uiState.password ?: "",
            login = {
                viewModel.login()
            }, onPasswordChange = { password ->
                viewModel.updatePassword(password)
            }, onUserName = { userName ->
                viewModel.updateUserName(userName)
            }
        )
    }
}

@Composable
fun LoginContent(
    username: String = "",
    password: String = "",
    login: () -> Unit,
    onPasswordChange: (String) -> Unit,
    onUserName: (String) -> Unit
) {
    Scaffold(
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Box(modifier = Modifier.fillMaxWidth().padding(16.dp), content = {
                    Column {
                        Text(stringResource(R.string.login))
                        Spacer(modifier = Modifier.size(16.dp))
                        TextField(
                            modifier = Modifier.fillMaxWidth(),value = username, onValueChange = onUserName)
                        Spacer(modifier = Modifier.size(16.dp))
                        TextField(modifier = Modifier.fillMaxWidth(),value = password, onValueChange = onPasswordChange)
                        Spacer(modifier = Modifier.size(16.dp))
                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            content = {
                                Text(
                                    stringResource(R.string.login)
                                )
                            },
                            onClick = login
                        )
                    }
                })
            }
        },
    )
}

@Composable
@Preview
fun LoginScreePreview() {
    LoginScreen()
}