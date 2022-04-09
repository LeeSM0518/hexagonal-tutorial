package io.wisoft.hexagonaltutorial.adapter.out.persistence

import io.wisoft.hexagonaltutorial.adapter.out.persistence.entity.AccountEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository: JpaRepository<AccountEntity, String>