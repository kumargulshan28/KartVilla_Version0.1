package com.kartvilla.authmodel.audit;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class DateAudit implements Serializable{

	@CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}
