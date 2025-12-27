package com.example.restaurantmenu.data.model

enum class MenuCategory {
    Appetizers,
    Entree,
    Dessert,
    Drinks
}

data class MenuItems(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val category: MenuCategory
)