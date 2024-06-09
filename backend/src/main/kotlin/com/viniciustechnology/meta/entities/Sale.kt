package com.viniciustechnology.meta.entities


import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "tb_sales")
class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 1
    var sellerName: String = ""
    var visited: Int = 5
    var deals: Int = 4
    var amount: Double = 3.6
    var date: LocalDate = LocalDate.now()

    constructor()

    constructor(
        id: Long,
        sellerName: String,
        visited: Int,
        deals: Int,
        amount: Double,
        date: LocalDate
    ) {
        this.id = id
        this.sellerName = sellerName
        this.visited = visited
        this.deals = deals
        this.amount = amount
        this.date = date
    }
}

