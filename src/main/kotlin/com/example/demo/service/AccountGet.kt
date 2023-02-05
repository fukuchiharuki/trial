package com.example.demo.service

import com.example.demo.data.Account
import com.example.demo.data.AccountRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountGet(
    private val accountRepository: AccountRepository
) {
    @Transactional(readOnly = true)
    operator fun invoke(id: Long): Account {
        return accountRepository.findById(id)
            .orElseThrow { IllegalArgumentException("not found") }
    }
}
