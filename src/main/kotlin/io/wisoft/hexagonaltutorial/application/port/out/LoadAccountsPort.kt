package io.wisoft.hexagonaltutorial.application.port.out

import io.wisoft.hexagonaltutorial.domain.Account
import kotlin.jvm.Throws

interface LoadAccountsPort {

    @Throws(NoSuchElementException::class)
    fun loadAccounts(): List<Account>

}