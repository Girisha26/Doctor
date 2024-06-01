package com.mini_project_2.Repository;

import java.time.LocalDate;
import java.util.List;
import com.mini_project_2.Model.Appointment;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Tag(name = "Appointment History - Rest API Controllers", description = "Appointment API")
@RepositoryRestResource(collectionResourceRel = "appointment", path = "appointment")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
     List<Appointment> findByPatientId(@Param("id") int id);
     List<Appointment> findByDoctorId(@Param("id") int id);
     List<Appointment> findByDoctorIdAndVisitDate(@Param("id") int id, @Param("vdate") LocalDate vdate);

}

