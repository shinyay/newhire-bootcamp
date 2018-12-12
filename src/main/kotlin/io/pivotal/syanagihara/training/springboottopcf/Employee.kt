package io.pivotal.syanagihara.training.springboottopcf

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee(
        @Id
        @GeneratedValue
        var id: Long,
        @Column(nullable = true)
        var name: String)