package developer.android.quadrantesnocompose

import android.content.res.Resources
import android.content.res.loader.ResourcesLoader
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import developer.android.quadrantesnocompose.ui.theme.QuadrantesNoComposeTheme
import kotlin.io.encoding.Base64
import kotlin.text.HexFormat.Companion.Default

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantesNoComposeTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    QuadrantesNoComposeApp()
                }
            }
        }
    }
}

@Composable
private fun QuadranteInfoCard(
    title: String,
    text: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun QuadrantesNoComposeApp() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            QuadranteInfoCard(
                title = stringResource(R.string.title_1),
                text = stringResource(R.string.text_1),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadranteInfoCard(
                title = stringResource(R.string.title_2),
                text = stringResource(R.string.text_2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadranteInfoCard(
                title = stringResource(R.string.title_3),
                text = stringResource(R.string.text_3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadranteInfoCard(
                title = stringResource(R.string.title_4),
                text = stringResource(R.string.text_4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )

        }

    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesNoComposeTheme {
        QuadrantesNoComposeApp()
    }
}