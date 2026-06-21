# ADR-003: Event Driven Architecture

## Status

Accepted

## Context

Multiple services need to communicate asynchronously.

Examples:

* Pull Request Created
* Analysis Started
* Analysis Completed
* Security Issue Detected
* Notification Generated

## Decision

Use Apache Kafka for asynchronous communication.

## Consequences

### Positive

* Loose coupling
* Scalability
* Event replay
* Resilience

### Negative

* Increased infrastructure complexity
* Eventual consistency

## Decision Outcome

Kafka selected as the primary event bus.
