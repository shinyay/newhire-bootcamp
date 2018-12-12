package io.pivotal.syanagihara.training.springboottopcf

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.webmvc.RepositoryRestController

@RepositoryRestController
interface EmployeeRepository : JpaRepository<Employee, Long> {
}