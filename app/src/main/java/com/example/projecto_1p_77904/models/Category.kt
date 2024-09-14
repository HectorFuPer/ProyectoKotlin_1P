package com.example.projecto_1p_77904.models

data class Heroes(val id : Int, val name : String, val image : String){
    companion object{
        val marvelheroes = mutableListOf(
            Heroes(id = 1, "Iron Man", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F320670435982947479%2F&psig=AOvVaw3TkxkWnFKWjH4H0ecxibTD&ust=1726381997677000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJDhpqDowYgDFQAAAAAdAAAAABAQ"),
            Heroes(id = 2, "Capitan America", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fas.com%2Fmeristation%2Fnoticias%2Fmarvel-presenta-el-nuevo-traje-del-capitan-america-para-el-comic-avengers-twilight-n%2F&psig=AOvVaw0y_9TA1CtEigdpuCyF9acX&ust=1726382319979000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNi0x77pwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 3, "Thor", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FThor_%2528Marvel_Cinematic_Universe%2529&psig=AOvVaw3eV0K3mUmsuLzAqeyEVGXA&ust=1726382449789000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNjB5fjpwYgDFQAAAAAdAAAAABAE"),
            Heroes(id = 4, "Hulk", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmagicdecor.in%2Fcollections%2Fhulk-wallpaper%2F&psig=AOvVaw16-QkbtZ_Yk0YHJ6QC_zSw&ust=1726382475504000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDhioTqwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 5, "Spider Man", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rtve.es%2Fnoticias%2F20151026%2Fjulian-clemente-spiderman-mejor-personaje-ficcion-historia%2F1223940.shtml&psig=AOvVaw049PqUthxWN0iirvgcU0qN&ust=1726382518884000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDd9pjqwYgDFQAAAAAdAAAAABAE"),
            Heroes(id = 6, "Deadpool", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hobbyconsolas.com%2Fnoticias%2Fryan-reynolds-confirma-otro-regreso-otro-personaje-deadpool-2-1238984&psig=AOvVaw38krz4JjPQ9FK7Ot-sYYMe&ust=1726382535196000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJiiraPqwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 7, "Nombre SuperHeroe", "Link")
        )
        val dcheroes = mutableListOf(
            Heroes(id = 1, "Flash", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F320670435982947479%2F&psig=AOvVaw3TkxkWnFKWjH4H0ecxibTD&ust=1726381997677000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJDhpqDowYgDFQAAAAAdAAAAABAQ"),
            Heroes(id = 2, "SuperMan", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fas.com%2Fmeristation%2Fnoticias%2Fmarvel-presenta-el-nuevo-traje-del-capitan-america-para-el-comic-avengers-twilight-n%2F&psig=AOvVaw0y_9TA1CtEigdpuCyF9acX&ust=1726382319979000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNi0x77pwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 3, "Batman", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FThor_%2528Marvel_Cinematic_Universe%2529&psig=AOvVaw3eV0K3mUmsuLzAqeyEVGXA&ust=1726382449789000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNjB5fjpwYgDFQAAAAAdAAAAABAE"),
            Heroes(id = 4, "AcuaMan", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmagicdecor.in%2Fcollections%2Fhulk-wallpaper%2F&psig=AOvVaw16-QkbtZ_Yk0YHJ6QC_zSw&ust=1726382475504000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDhioTqwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 5, "Wonder Woman", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rtve.es%2Fnoticias%2F20151026%2Fjulian-clemente-spiderman-mejor-personaje-ficcion-historia%2F1223940.shtml&psig=AOvVaw049PqUthxWN0iirvgcU0qN&ust=1726382518884000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDd9pjqwYgDFQAAAAAdAAAAABAE"),
            Heroes(id = 6, "Cyborg", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hobbyconsolas.com%2Fnoticias%2Fryan-reynolds-confirma-otro-regreso-otro-personaje-deadpool-2-1238984&psig=AOvVaw38krz4JjPQ9FK7Ot-sYYMe&ust=1726382535196000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCJiiraPqwYgDFQAAAAAdAAAAABAJ"),
            Heroes(id = 7, "Nombre SuperHeroe", "Link")
        )
    }
}
