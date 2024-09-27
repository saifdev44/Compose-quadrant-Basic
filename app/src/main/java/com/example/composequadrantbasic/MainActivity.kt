package com.example.composequadrantbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
import com.example.composequadrantbasic.ui.theme.ComposeQuadrantBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantBasicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrantScreen(
                        textComposeHeadline = stringResource(R.string.text_composable_headline),
                        textCompose = stringResource(R.string.text_composable_article),
                        imageComposeHeadline = stringResource(R.string.image_composable_headline),
                        imageCompose = stringResource(R.string.image_composable_article),
                        rowComposeHeadline = stringResource(R.string.row_composable_headline),
                        rowCompose = stringResource(R.string.row_composable_article),
                        columnComposeHeadline = stringResource(R.string.column_composable_headline),
                        columnCompose = stringResource(R.string.column_composable_article),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantScreen(
    textComposeHeadline: String,
    textCompose: String,
    imageComposeHeadline: String,
    imageCompose: String,
    rowComposeHeadline: String,
    rowCompose: String,
    columnComposeHeadline: String,
    columnCompose: String,
    modifier: Modifier = Modifier)
{
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = modifier.fillMaxHeight().weight(1f)) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = textComposeHeadline,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = textCompose,
                    textAlign = TextAlign.Justify
                )
            }
            Column( modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
                .background(color = Color(0xFFD0BCFF))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = imageComposeHeadline,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = imageCompose,
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row(modifier = modifier.fillMaxHeight().weight(1f)) {
            Column( modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
                .background(color = Color(0xFFB69DF8))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = rowComposeHeadline,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = rowCompose,
                    textAlign = TextAlign.Justify
                )
            }
            Column( modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .weight(1f)
                .background(color = Color(0xFFF6EDFF))
                .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = columnComposeHeadline,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = columnCompose,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantBasicTheme {
        ComposeQuadrantScreen(
            textComposeHeadline = stringResource(R.string.text_composable_headline),
            textCompose = stringResource(R.string.text_composable_article),
            imageComposeHeadline = stringResource(R.string.image_composable_headline),
            imageCompose = stringResource(R.string.image_composable_article),
            rowComposeHeadline = stringResource(R.string.row_composable_headline),
            rowCompose = stringResource(R.string.row_composable_article),
            columnComposeHeadline = stringResource(R.string.column_composable_headline),
            columnCompose = stringResource(R.string.column_composable_article),
        )
    }
}