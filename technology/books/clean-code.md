# Clean code

You can rewrite your project keeping only the test
Tell a story 
Write a single behavior per spec



### Interview 

How to write hard to test code:
- Global variables
- Law of demeter violation
- Global reference to time
- New operators
- Lack of dependency injection

- readibility
- test
- Well written prose
- fewer elementd
- easy to change 
- easy to understood
- Remove duplication
- sensors, decide , act

- CAP: 
    * Consistency: all nodes see the same data
    * Availability: every request receive a response [success/failure]
    * Partition Tolerance;  system continoues to operate despite arbitrary messages

- Databases NoSQL, documental store, K.V, Graph, Columnar
- Lenguage decision is based on Ecosystem, experience, performance and expresiveness, feedback loop
- Working code is not enough you must reduce complexity
- Clean boundaries and adapter pattern
- Tests enable all the -ilities, because tests enable change.
- Motivation: autonomy, mastery, purpose
- Test should de FIRST
    * Fast
    * Independent
    * Repeteable
    * Self validating
    * Timely

# Enterpreurs
 - Magic number
 - Customer lifetime value
 - Metrics: activation, retention, reffereal, revenue, magic number
 - Design is important

# Startup 

- Essential complexity and accidental complexity that you must handle, with invest in productivity, reliability and simplicity  
- Teams must be autonomous and leverage automation to avoid human error
- The stronger the culture, the less company process are needed
- In a startup the most important thing is the why
- Lock free: avoid release manager and people intervention, work toward a goal should never be blocked
- Manager. 1 place to work with others, 2 a place where you do focused work, 3 a place where you can go away from work 4 a way to customize the office for personal needs
- Manager Individual contributor radio
- Mission is the startup why
- Rollback, canary release and feature flags are necessary to embrace continous integration
- Metrics... Business metrics. User, application and availability
- Acceptance test and loose coupling are important