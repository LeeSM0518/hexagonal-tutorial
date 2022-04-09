package io.wisoft.hexagonaltutorial.application.port.out

import io.wisoft.hexagonaltutorial.domain.Account
import kotlin.jvm.Throws

interface LoadAccountPort {

    @Throws(NoSuchElementException::class)
    fun loadAccount(accountId: String): Account

}