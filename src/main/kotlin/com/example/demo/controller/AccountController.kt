package com.example.demo.controller

import com.example.demo.data.Account
import com.example.demo.service.AccountGet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("accounts")
class AccountController(
    private val accountGet: AccountGet
) {
    @GetMapping("/{id}")
    fun get(
        @PathVariable id: Long
    ): Account {
        return accountGet(id)
    }
}
