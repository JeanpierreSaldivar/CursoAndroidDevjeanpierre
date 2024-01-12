package com.curso.cursoandroiddevjeanpierre.dummy

import com.curso.cursoandroiddevjeanpierre.collections.HabitItem
import java.util.UUID

/**
 * Created by Devjeanpierre on 03/01/2024.
 * @devjeanpierre
 * Lima, Peru.
 **/
object MockHabits {

    val habitItemList: MutableList<HabitItem> = mutableListOf(
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Leer el libro",
            isCompleted = false
        ),
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Caminar con el perro",
            isCompleted = false
        ),
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Ir al gimnasio",
            isCompleted = false
        ),
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Programar",
            isCompleted = false
        ),
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Hacer el té",
            isCompleted = false
        ),
        HabitItem(
            id = UUID.randomUUID().toString(),
            title = "Hacer yoga",
            isCompleted = false
        )
    )
}