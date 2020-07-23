# Clean Architecture

Entities are business objects
Use case use the business objects and made application indepent abstractions
Small is always better
The principles are always the same
Ports and adapters are an form of clean architecture

## Onion Architecture

The key tenets of onion architecture
- The application is build around a business independent model
- Inner layer define interfaces, outer layer implement interfaces
- Direction of coupling is toward the center
- The application core code can be compiled and run separe from Infra code

## Design considerations

- Effort is inversely proportional to Software design
- Make ir work then make it right
- The key to go fast its not to build the things that make you go slow
- First value is to meet customer needs
- Second value its have a good structure that allow the software to be maintainable
- Architecture must show intent!
- Isolate things and defer decisions
- Acceptance test must be finished in the middle of the sprint