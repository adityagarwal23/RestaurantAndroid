package com.example.restaurantmenu.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.restaurantmenu.data.FakeMenuData
import com.example.restaurantmenu.data.model.MenuItems


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Menu",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(FakeMenuData.menuItems) { item ->
                MenuItemCard(item = item)
            }
        }
    }
}

@Composable
fun MenuItemCard(item: MenuItems) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // later: navigate to detail screen
            }
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = item.name,
                fontSize = 18.sp
            )
            Text(
                text = item.description,
                fontSize = 14.sp
            )
            Text(
                text = "$${item.price}",
                fontSize = 16.sp
            )
        }
    }
}
