package net.designed4device.datatables

import java.io.Serializable

data class ResponseWithError<out T: Serializable>(
        override val draw: Int,
        override val recordsTotal: Int,
        override val recordsFiltered: Int,
        override val data: List<T>,
        val error: String
): DataTablesResponse<T>