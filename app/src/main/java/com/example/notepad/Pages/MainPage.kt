package com.example.notepad.Pages
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme


@Composable
fun Mainpage(modifier: Modifier = Modifier) {
    Text(
        text = "MainPage",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    NotepadTheme {
        Mainpage()
    }
}