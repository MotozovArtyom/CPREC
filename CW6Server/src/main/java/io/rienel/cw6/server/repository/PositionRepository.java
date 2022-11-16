package io.rienel.cw6.server.repository;

import java.util.UUID;

import io.rienel.cw6.server.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO ArMotozov
 *
 * @since 11/16/2022
 */
@Repository
public interface PositionRepository extends JpaRepository<Position, UUID> {
}
