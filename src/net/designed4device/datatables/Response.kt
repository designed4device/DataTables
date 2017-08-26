package net.designed4device.datatables

import java.io.Serializable

data class Response<out T: Serializable>(
        override val draw: Int,
        override val recordsTotal: Int,
        override val recordsFiltered: Int,
        override val data: List<T>
): DataTablesResponse<T>

