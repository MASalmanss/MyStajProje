package com.stajProje.stajProje.repository;

import com.stajProje.stajProje.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location , UUID> {
}
