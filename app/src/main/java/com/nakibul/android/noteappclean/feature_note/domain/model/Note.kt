package com.nakibul.android.noteappclean.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nakibul.android.noteappclean.ui.theme.BabyBlue
import com.nakibul.android.noteappclean.ui.theme.LightGreen
import com.nakibul.android.noteappclean.ui.theme.RedOrange
import com.nakibul.android.noteappclean.ui.theme.RedPink
import com.nakibul.android.noteappclean.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
