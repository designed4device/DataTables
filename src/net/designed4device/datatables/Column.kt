package net.designed4device.datatables

data class Column(
        val data: String,
        val name: String,
        val searchable: Boolean,
        val orderable: Boolean,
        val search: Search
)