# ADR-001: Monorepo Architecture

## Status

Accepted

## Date

2026-06-20

## Context

CodeReview AI is an AI-powered engineering excellence platform consisting of multiple backend microservices, frontend applications, infrastructure code, documentation, CI/CD pipelines, and AI components.

The system will include:

* API Gateway
* Authentication Service
* Repository Service
* Review Service
* Security Service
* AI Service
* Analytics Service
* Notification Service
* Angular Frontend
* Infrastructure as Code

A decision is required regarding repository organization.

## Decision

Use a Monorepo architecture.

All backend services, frontend applications, infrastructure code, and documentation will be maintained in a single repository.

## Consequences

### Positive

* Easier refactoring across services
* Centralized dependency management
* Simplified onboarding
* Consistent CI/CD pipelines
* Shared libraries are easier to maintain
* Better visibility across the platform

### Negative

* Larger repository size
* Potentially longer build times
* Requires disciplined module ownership

## Alternatives Considered

### Polyrepo

Each service in a separate repository.

Pros:

* Independent releases
* Smaller repositories

Cons:

* Difficult cross-service refactoring
* Dependency drift
* More CI/CD maintenance

## Decision Outcome

Monorepo selected for startup-stage development and long-term maintainability.
