package io.wisoft.hexagonaltutorial.adapter.`in`

import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase
import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase.FindAccountResponseQuery
import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountsUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountQueryController(
    val findAccountUseCase: FindAccountUseCase,
    val findAccountsUseCase: FindAccountsUseCase
) {

    @GetMapping("/accounts/{account-id}")
    fun findAccount(@PathVariable("account-id") accountId: String): ResponseEntity<FindAccountResponseQuery> =
        ResponseEntity.ok(findAccountUseCase.findAccount(accountId))

    @GetMapping("/accounts")
    fun findAccounts(): ResponseEntity<List<FindAccountResponseQuery>> =
        ResponseEntity.ok(findAccountsUseCase.findAccounts())

}