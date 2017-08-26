package net.designed4device.datatables

/**
 * Created by michaelwellen on 8/6/17.
 */

data class Request(
        val draw: Int,
        val start: Int,
        val length: Int,
        val search: List<Search>,
        val order: List<Order>,
        val columns: List<Column>
)

