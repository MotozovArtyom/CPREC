package io.rienel.cw6.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity
data class Stuff(
	@PrimaryKey val stuffId: String,
	@ColumnInfo(name = "surname") val surname: String,
	@ColumnInfo(name = "name") val name: String,
	@ColumnInfo(name = "patronymic") val patronymic: String,
	@ColumnInfo(name = "sex") val sex: Boolean,
	@ColumnInfo(name = "birthDate") val birthDate: LocalDate,
	@ColumnInfo(name = "salaryMultiplier") val salaryMultiplier: Double,
	@ColumnInfo(name = "stuffPositionId") val positionId: String,
)
