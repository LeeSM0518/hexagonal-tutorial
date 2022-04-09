package io.wisoft.hexagonaltutorial.application.port.`in`

import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase.FindAccountResponseQuery

interface FindAccountsUseCase {

    fun findAccounts(): List<FindAccountResponseQuery>

}