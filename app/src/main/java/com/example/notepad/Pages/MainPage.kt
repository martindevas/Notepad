package com.example.notepad.Pages
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notepad.ui.theme.NotepadTheme


@Composable
fun Mainpage(modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    val notas = remember { mutableStateListOf<String>() }
    Scaffold(
        modifier = modifier,
        topBar = {MainTopAppBar()}
    ) {
        MainNavHost(
            modifier = Modifier.padding(it),
            navHostController = navHostController,
            notas = notas)

    }
}
@Composable
fun MainNavHost(modifier: Modifier = Modifier,
                navHostController: NavHostController,
                notas : List<String>
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = "lista"
    ) {
        composable("lista"){
            ListaPage(
                notas = notas,
                onNotaSelected = {navHostController.navigate("detalle")}
            )
        }
        composable("detalle"){
            DetallePage()
        }
        composable("crear"){
            CrearPage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(){
    TopAppBar(
        title = {
            Text(text = "Notepad")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    NotepadTheme {
        Mainpage()
    }
}