package com.example.notepad.Pages
import androidx.compose.material3.Button
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
    Button(
        onClick = {
            onNotaSelected()
        }
    ) {
        Text(
            text = "Ir a un detalle",
            modifier = modifier
        )
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