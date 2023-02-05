package com.example.demo

import com.example.demo.data.Account
import com.example.demo.data.AccountRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
    @Bean
    fun init(accountRepository: AccountRepository): CommandLineRunner {
        return CommandLineRunner {
            accountRepository.save(Account(name = "john"))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
