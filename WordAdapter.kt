
package com.example.dictionaryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryapp.databinding.ItemWordBinding

class WordAdapter(private var items: List<Pair<String, String>>) :
    RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    inner class WordViewHolder(val binding: ItemWordBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val binding = ItemWordBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val item = items[position]
        holder.binding.arabicWord.text = item.first
        holder.binding.englishWord.text = item.second
    }

    override fun getItemCount() = items.size

    fun updateData(newItems: List<Pair<String, String>>) {
        items = newItems
        notifyDataSetChanged()
    }
}
