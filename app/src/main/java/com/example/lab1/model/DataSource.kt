package com.example.lab1.model

import com.example.lab1.R

object DataSource{
    var pizzaList = arrayListOf<Pizza>(
        Pizza(
            name = "Вау кебаб!",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            imageRes = R.drawable.pizza1,
            price = 2500 ,
        ),
        Pizza(
            name = "Пепперони",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            imageRes = R.drawable.pizza2,
            price = 2200 ,
        ),
        Pizza(
            name = "Маргарита",
            description = "Много-много моцареллы, томаты, томатный соус и итальянские травы. Классика",
            imageRes = R.drawable.pizza3,
            price = 2000 ,
        ),
        Pizza(
            name = "Ветчина и огурчики",
            description = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            imageRes = R.drawable.pizza4,
            price = 2400 ,
        ),
        Pizza(
            name = "С Грибами и Пепперони",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            imageRes = R.drawable.pizza5,
            price = 3220 ,
        ),
        Pizza(
            name = "Итальянская",
            description = "Острые колбаски чоризо, маринованные огурчики, красный лук, томаты, горчичный соус, моцарелла, фирменный томатный соус",
            imageRes = R.drawable.pizza6,
            price = 3100 ,
        ),
        Pizza(
            name = "Микс",
            description = "Четыре любимых пиццы в одной: Карбонара, Песто, Четыре сыра, Ветчина и сыр",
            imageRes = R.drawable.pizza7,
            price = 3000 ,
        ),
        Pizza(
            name = "Супер Сырная",
            description = "Увеличенная порция моцареллы, сыры чеддер и пармезан, сыр блю чиз, фирменный соус альфредо",
            imageRes = R.drawable.pizza8,
            price = 2560 ,
        )
    )
}
