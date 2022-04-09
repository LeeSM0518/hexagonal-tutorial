package io.wisoft.hexagonaltutorial.application.service

import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase
import io.wisoft.hexagonaltutorial.application.port.`in`.FindAccountUseCase.FindAccountResponseQuery
import io.wisoft.hexagonaltutorial.application.port.out.LoadAccountPort
import org.springframework.stereotype.Service

@Service
class FindAccountService(
    val loadAccountPort: LoadAccountPort,
) : FindAccountUseCase {

    override fun findAccount(accountId: String): FindAccountResponseQuery =
        kotlin.run {
            loadAccountPort
                .loadAccount(accountId)
                .run {
                    FindAccountResponseQuery(
                        accountId = accountId,
                        name = name,
                        permission = permission,
                        email = email
                    )
                }
        }

}