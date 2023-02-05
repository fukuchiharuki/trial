package com.example.demo.data

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = -1,

    var name: String = ""
)
