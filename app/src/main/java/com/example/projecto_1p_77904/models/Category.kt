package com.example.projecto_1p_77904.models

data class Category(val id : Int, val name : String, val image : String){
    companion object{
        val marvelheroes = mutableListOf(
            Category(id = 1, "Iron Man", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_WHOPPER_500X540px.png"),
            Category(id = 2, "Capitan America", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/3/3e/Escudo_del_Capitan_America.png/revision/latest?cb=20210416174536&path-prefix=es"),
            Category(id = 3, "Thor", "https://img.freepik.com/vector-premium/logotipo-cabeza-thor-dios-nordico-trueno_128316-183.jpg"),
            Category(id = 4, "Hulk", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqD-9QHrqFjCrC5QjQ5-TFENlgdWAjQibLQg&s"),
            Category(id = 5, "Spider Man", "https://wallpapers-clan.com/wp-content/uploads/2024/02/aesthetic-spiderman-logo-desktop-wallpaper-preview.jpg"),
            Category(id = 6, "Deadpool", "https://steamuserimages-a.akamaihd.net/ugc/930430061300890316/A72F99B8A98FCB0C25170E30E9D9F65F5BD276A8/?imw=512&&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=false"),
        )
        val dcheroes = mutableListOf(
            Category(id = 1, "Flash", "https://i.pinimg.com/736x/44/4a/55/444a552fd59d9c1f25413c32e5245d51.jpg"),
            Category(id = 2, "SuperMan", "https://m.media-amazon.com/images/I/61x6y4d6PFL.jpg"),
            Category(id = 3, "Batman", "https://1000marcas.net/wp-content/uploads/2019/11/Batman-Logo-2000.png"),
            Category(id = 4, "AquaMan", "https://logos-world.net/wp-content/uploads/2023/05/Aquaman-Logo.png"),
            Category(id = 5, "Wonder Woman", "https://turbologo.com/articles/wp-content/uploads/2019/12/Wonder-woman-first-logo.png"),
            Category(id = 6, "Cyborg", "https://i.pinimg.com/originals/ea/90/d5/ea90d5dd396d0cd3168c7097b92ab641.jpg"),
        )
    }
}