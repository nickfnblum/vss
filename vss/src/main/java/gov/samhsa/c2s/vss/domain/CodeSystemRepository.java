package gov.samhsa.c2s.vss.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeSystemRepository extends JpaRepository<CodeSystem, Long> {
}
