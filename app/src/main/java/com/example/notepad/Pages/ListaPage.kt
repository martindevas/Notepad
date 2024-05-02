package com.example.notepad.Pages
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme


@Composable
fun ListaPage(
    modifier: Modifier = Modifier,
    onNotaSelected : () -> Unit,
    notas: List<String>
) {
  LazyColumn(modifier = modifier) {
        items(items = notas){
            Text(text = it)
        }
  }
}

@Preview(showBackground = true)
@Composable
fun ListaPagePreview() {
    val notas = remember { mutableStateListOf<String>() }
    NotepadTheme {
        ListaPage(
            onNotaSelected = {},
        notas = notas
        )
    }
}