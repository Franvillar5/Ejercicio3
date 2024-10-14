package com.example.listacomida2025_i.ui.views

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGesturesPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.data.DataSource
import com.example.listacomida2025_i.model.Platillo
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Imagen circular del platillo
            Image(
                painter = painterResource(id = platillo.drawableResourceId),
                contentDescription = stringResource(id = platillo.stringResourceId),
                modifier = Modifier.size(160.dp) // Tamaño de la imagen
                    .clip(CircleShape),  // Hace la imagen circular
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp)) // Espacio entre la imagen y el texto

            // Column que contiene el nombre, precio y oferta (si existe)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically) // Centra el contenido verticalmente respecto a la imagen
            ) {
                // Nombre del platillo
                Text(
                    text = stringResource(id = platillo.stringResourceId),
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                // Precio del platillo
                Text(
                    text = "MX ${platillo.precio}",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                // Si está en oferta
                if (platillo.oferta) {
                    Text(
                        text = "Ahorra hasta el 30%",
                        color = Color.Red,
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                    )
                }
            }
        }
    }
}


/*@Preview(showBackground = true)
@Composable
fun MenuCardDisplay(){
    ListaComida2025ITheme {

        MenuCard(platillo = Platillo(R.string.tacos,
            R.drawable.tacos) )
    }
}*/

@Composable
@Preview(showBackground = true)
fun ShowMenuCard() {
    MenuCardList(platilloList = DataSource().LoadPlatillos())
}
