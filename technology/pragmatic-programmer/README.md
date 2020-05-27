# Pragmatic Programmer

## Pragmatic philosophy

 - Your life it's your life
   * Craftmanship 
   * Early adopter 
 - Responsability
   * Offer options 
 - Software Entropy
   * Simplicity
   * Maintainance
 - Good enough software
   * Quality as requirement
 - Your knowdledge portafolio:
   * **Investment in knowdledge always pays the best interest**
   * Read notechnical books
   * Read conceptual books
   * Learn one new lenguage every year
 - Communicate
 - Testeability is key


## Pramatic approach

 - The essence of good design : ETC
 - DRY : Code, Data, Documentation (Knowledge)
   * Don't abstract to early, wait until you have copied and pasted a couple of times, examples are needed to create good abstractions
 - Orthogonality:
   * Eliminate effects between unrelated things
   * Undestandable, and easier to debug, test and mantain
   * Design patterns
   * SOLID
   * Prefer composition and FP lenguages
 - Reversability:
   * Flexible architecture
   * Have options
 - Tracer bullets:
   * Code lean and complete
   * Find the target
 - Prototypes and post-it note:
   * Information gathering
   * Is coupling minimized
   * Collaborations between components well-defined
   * Responsabilities
   * Interfaces and data clear and available

 - Domain lenguages:
   * Program close to the problem domain //TODO3 learn DSL
 - Estimation:
   *  I'll back yo you
   * optimistic, most likely and pessimistic
   * model building: someone that already did it 

## Basic Tools

Be more productive with your tools

 - The power of plain text:
   * Self describing data
 - Shell games //TODO1 shell training
 - Power Editing //TODO0 Intellij shortcuts
 - Debugging skills 
   * localhost test
   * Explain to someone else
 - Text manipulation
   * Unix: sed, awk 
   * Scripting lenguages: Python //TODO2 make some pet projects
 -  Engineering daybooks

 ## Pragmatic Paranoia

 Validate all the information we're given, asssertions of bad data, and distrust data from potential attackers

   - Design by contract
      * Preconditions, postconditions : Clojure Specs
   - Dead programs tell no lies
      * Crash early
      * Defensive programming is a waste of time let it crash! (Supervisor)
   - Assertive programming
      * Use assertions to prevent the impossible 
   - How to balance resources
      * Release free resources
   - Don't outrun your headlights
      * take smalls steps always

## Bend or break

Make our code as flexible as possible, a good way to stay flexible it's to write less code

   - Decoupling
      * Allow fleixibility
      * Shy code that promotes cohesion
      * Law of demeter: Depend on abstractions
      * Avoid global data
      * Avoid inheritance
   - Juggling the real world
      * Events
      * Finite state machine
      * Observer
      * Publish/Subscribe (Channels)
      * Reactive Streams
   - Transforming programming
      * Think in programs like Input Output and transformation of data
      * Process of data
      * find . -name '*.java' | xargs wc -l | sort -n | tail -11 | head -10
      * Programming is about code but programs are about data
   - Inheritance tax
      * Coupling
      * Interfaces to express polymprphism
   - Configuration
      * Parameterize your app using external configuration

## Concurrency

   - Concurrency: Two pieces of code run at the same time using Fibers, Threads and process
   - Parallelism: Hardware that can do two things at once
   - Breaking temporal coupling
   - Avoid shared state
   - Actor and process
   - Blackboards
      * Communication using Kafka or other streaming services

## While you are coding
  - Listen to your lizard brain
      * Give time and space to yout brains to organize your ideas
  - Algorithm speed
  - Refactoring
      * Rethink
      * Gardening
      * Unit test
      * (Duplication, Not DRY, Bad performance, Outdated knowdelge, Test passing. Nonorthogonal)
      * Redesign
      * Refactor early and often is like a surgery
  - Test the code
      * Feedback
      * Improve design
      * Embrace TDD
  - Property based testing
  - Security
      * Authentication 
      * I/O data
      * Principle of least privilege
      * Up to date
      * Encrypt sensitive information
  - Naming
    * **In programming all the things have names and reveal the intent and belief of the system**
    * Communication

## Before the project
  - Requirements Pit
    * User doesn't know what he wants
    * Our job is to help business to undestand what they want
    * Improve the feedback loop
    * BDUF is not a good thing
    * Work with the user to think like one
  - Solving de puzzle 
    * Think out of the box
    * Make time to think in unfocused mode
  - Working together
    * Pair programming
    * Mob programming
  - Agile
    * Its about values, context and feedback loop

## Pragmatic Teams
  - Pragmatic Teams
    * No broken windows
    * Be aware of the enviroment and health of the project
    * DRY 
    * Small teams
    * Cross-functional teams **Tracer bullets**
    * Automation
    * Create and identity (Team name)
    * Schedule time to improve knowdledge portafolio
  - Context
    * Use the right tools and practices
    * Software delivery (When release flow is slow status meetings are high)
    * Kanban
  - The programmer starter kit
    * Version control
    * Routhless testing
      - Unit, Integration, Component, Performance
      - If modules doesn't work well as a unit , they won't work well as a system
      - Saboteurs: Chaos engineering
  - Automate everything
    * Software delivery es fully automated
  - Delight your users
    * What are your expections
    * Deliver quality not code
  - Pride and prejudice
    * Code that you feel proud
    * Collective ownership