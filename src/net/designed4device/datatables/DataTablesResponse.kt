package net.designed4device.datatables

import java.io.Serializable

/**
 * Created by michaelwellen on 8/6/17.
 */

interface DataTablesResponse<out T: Serializable> {
    val draw: Int
    val recordsTotal: Int
    val recordsFiltered: Int
    val data: List<T>
}