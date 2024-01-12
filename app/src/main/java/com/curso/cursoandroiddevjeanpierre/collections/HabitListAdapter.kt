package com.curso.cursoandroiddevjeanpierre.collections

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.curso.cursoandroiddevjeanpierre.databinding.HabitItemBinding

/**
 * Created by Devjeanpierre on 03/01/2024.
 * @devjeanpierre
 * Lima, Peru.
 **/
class HabitListAdapter : RecyclerView.Adapter<HabitListAdapter.ViewHolder>() {

    private val asyncListDiffer: AsyncListDiffer<HabitItem> = AsyncListDiffer(this, DiffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = HabitItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(asyncListDiffer.currentList[position])
    }

    override fun getItemCount(): Int = asyncListDiffer.currentList.size

    fun updateHabits(habits: List<HabitItem>) {
        asyncListDiffer.submitList(habits)
    }

    class ViewHolder(private val binding: HabitItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(habit: HabitItem) {
            binding.titleTextView.text = habit.title
            binding.completeCheckBox.isChecked = habit.isCompleted
        }
    }

    object DiffCallback : DiffUtil.ItemCallback<HabitItem>() {
        override fun areItemsTheSame(oldItem: HabitItem, newItem: HabitItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: HabitItem, newItem: HabitItem): Boolean {
            return oldItem == newItem
        }
    }
}