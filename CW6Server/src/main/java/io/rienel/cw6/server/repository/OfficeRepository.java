package io.rienel.cw6.server.repository;

import java.util.UUID;

import io.rienel.cw6.server.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO ArMotozov
 *
 * @since 11/16/2022
 */
@Repository
public interface OfficeRepository extends JpaRepository<Office, UUID> {
	Office findByName(String name);
}
