package ec.edu.puce.githubclient.ui.screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ec.edu.puce.githubclient.ui.Componentsimport.Repoitem
@Composable
fun Repolist(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .statusBarsPadding()
            .padding(horizontal = 16.dp)
    ) {
        Repoitem(
            name = "Repositorio de android",
            description = "Este es un repositorio de android creado hoy",
            avatarUrl = "https://avatars.githubusercontent.com/u/4656448?s=48&v=4",
            language = "Kotlin"
        )

        Repoitem(
            name = "Repositorio de mi tarea",
            description = "Tarea número 1 de la clase de programación móvil",
            avatarUrl = "https://avatars.githubusercontent.com/u/1?v=4",
            language = "Java"
        )

        Repoitem(
            name = "Repositorio de ejercicios",
            description = "Práctica de componentes básicos en Jetpack Compose",
            avatarUrl = "https://avatars.githubusercontent.com/u/2?v=4",
            language = "Kotlin"
        )

        Repoitem(
            name = "Repositorio de notas",
            description = "Apuntes guardados durante el semestre",
            avatarUrl = "https://avatars.githubusercontent.com/u/3?v=4",
            language = "Dart"
        )
    }
}