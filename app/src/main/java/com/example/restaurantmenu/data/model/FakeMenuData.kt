package com.example.restaurantmenu.data

import com.example.restaurantmenu.data.model.MenuItems
import com.example.restaurantmenu.data.model.MenuCategory

object FakeMenuData {

    val menuItems = listOf(
        MenuItems(
            id = 1,
            name = "Fries",
            description = "Tasty fries, waffle fries",
            price = 3.29,
            category = MenuCategory.Appetizers
        ),
        MenuItems(
            id = 2,
            name = "Coca Cola Products",
            description = "Fizzy Drinks",
            price = 2.99,
            category = MenuCategory.Drinks
        )
    )
}

