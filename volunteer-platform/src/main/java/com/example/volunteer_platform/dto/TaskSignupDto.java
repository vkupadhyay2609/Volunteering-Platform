package com.example.volunteer_platform.dto;

import lombok.Builder;
import lombok.Getter;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Future;
import java.time.LocalDate;

/**
 * Data Transfer Object for task signup requests.
 */
@Getter
@Builder
public class TaskSignupDto {

    /**
     * ID of the volunteer signing up for the task.
     */
    @NotNull(message = "Volunteer ID cannot be null")
    private final Long volunteerId;

    /**
     * ID of the task being signed up for.
     */
    @NotNull(message = "Task ID cannot be null")
    private final Long taskId;

    /**
     * Cancellation deadline for the task signup.
     * Must be a valid future date.
     */
    @NotNull(message = "Cancellation deadline cannot be null")
    @Future(message = "Cancellation deadline must be a future date")
    private final LocalDate cancellationDeadline;
}
