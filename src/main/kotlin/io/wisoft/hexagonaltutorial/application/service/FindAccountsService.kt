package io.wisoft.hexagonaltutorial.application.service

import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase.FindAccountResponseQuery
import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountsUseCase
import io.wisoft.hexagonaltutorial.application.port.out.LoadAccountsPort
import org.springframework.stereotype.Service

@Service
class FindAccountsService(
    val loadAccountsPort: LoadAccountsPort,
) : FindAccountsUseCase {

    override fun findAccounts(): List<FindAccountResponseQuery> =
        kotlin.run {
            loadAccountsPort
                .loadAccounts()
                .map {
                    FindAccountResponseQuery(
                        accountId = it.accountId,
                        name = it.name,
                        permission = it.permission,
                        email = it.email
                    )
                }
        }

}