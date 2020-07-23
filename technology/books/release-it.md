# Release it 

## Stability anti-patterns

- Integrations points are the number one killers of systems
- Chain reaction not handled properly
- Cascading failures
- Users : Traffic, unwanted, malicious
- Blocked threads: can happen anytime you check resources out of a connection pool, deal with caches or object registries, or make calls to external systems
The “synchronized” keyword there should draw your attention. That’s a Java keyword that makes that method into a critical section. Only one thread may execute inside the method at a time
- Self denied attacks : Share nothing architectures, Protect shared resources
- Scaling effects: avoid point-to-point communications
- Unbalanced capacities

## Stability patterns
- Timeouts
- Circuit Breaker
- Bulkheads
- Steady State
- Fail Fast
- Let It Crash
- Handshaking
- Test Harnesses
- Decoupling Middleware
- Shed Load
- Create Back Pressure
- Governor