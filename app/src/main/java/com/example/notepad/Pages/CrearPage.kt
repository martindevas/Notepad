package com.example.notepad.Pages
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notepad.ui.theme.NotepadTheme

@Composable
fun CrearNotaPage(
    modifier: Modifier = Modifier,
    onNuevaNota: (titulo:String, cuerpo: String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

       var titulo by remember { mutableStateOf("") }
        var cuerpo by remember { mutableStateOf("") }


        TextField(
            value = titulo,
            onValueChange ={titulo = it}
        )
        TextField(
            value = cuerpo,
            onValueChange ={cuerpo = it}
        )

        Button(
            onClick = {
                onNuevaNota (titulo,cuerpo)
            }
        ) {
            Text(
                text = "Crear nueva nota",
                modifier = modifier
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun CrearNotaPagePreview() {
    NotepadTheme {
        CrearNotaPage(onNuevaNota = {titulo, cuerpo ->  })
    }
}