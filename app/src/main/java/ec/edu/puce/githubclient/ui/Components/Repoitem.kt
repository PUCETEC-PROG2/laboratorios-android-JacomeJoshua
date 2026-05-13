package ec.edu.puce.githubclient.ui.Componentsimport

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Repoitem(
    name: String,
    description: String?,
    avatarUrl: String,
    language: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
        ) {
            AsyncImage(
                model = avatarUrl,
                contentDescription = "Imagen de repositorio",
                modifier = Modifier.size(size = 60.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(width = 16.dp))


            Column {
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )

                if (description != null) {
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Light
                    )
                }

                Spacer(modifier = Modifier.height(height = 8.dp))

                Text(
                    text = language,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RepoitemPreview() {
    Repoitem(
        name = "Mi repositorio chambeador",
        description = "Es un repositorio creado en kotlin.",
        avatarUrl = "imagen",
        language = "Kotlin"
    )
}