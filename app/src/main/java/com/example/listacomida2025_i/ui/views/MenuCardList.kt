package com.example.listacomida2025_i.ui.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida2025_i.data.DataSource
import com.example.listacomida2025_i.model.Platillo
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme

@Composable
fun MenuApp() {
    MenuCardList(platilloList = DataSource().LoadPlatillos())
}

@Composable
fun MenuCardList(platilloList: List<Platillo>, modifier: Modifier = Modifier) {

    Scaffold (
        topBar = {
            MenuTopAppBar()
        }
    ){
            it->
        LazyColumn(contentPadding = it) {
            items(platilloList) { platillo ->
                MenuCard(
                    platillo = platillo,
                    modifier = modifier.padding(10.dp)
                )
            }
        }
    }

}

/*
@Preview( showBackground = true)
@Composable
fun ShowListCardMenu(){

    ListaComida2025ITheme {

        MenudCardList(platilloList =  ,
            modifier = )
    }
}
*/