package com.example.projecto_1p_77904.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.projecto_1p_77904.R
import com.example.projecto_1p_77904.models.Category
import com.squareup.picasso.Picasso

class CategoryAdapter (val heroes: List<Category>)
    : RecyclerView.Adapter<CategoryViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.count()
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = heroes[position]
        holder.categoryTextView.text = category.name
        Picasso.get().load(category.image).into(holder.categoryImage)
    }

}

class CategoryViewHolder(val view: View) : ViewHolder(view){
        val categoryImage : ImageView = view.findViewById(R.id.category_image)
        val categoryTextView : TextView = view.findViewById(R.id.category_name)
}
