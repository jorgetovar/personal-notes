# Clean code

You can rewrite your project keeping only the test
Tell a story 
Write a single behavior per spec
Write code that makes code easier to write
Old code is a trainer for new people
Write code than other people can mantain
Minimize the maintanibility risk
Good-Fast-Cheap-Done
The largest threat to reaching scale from a technical perspective was to be complexity, for the both system and the team

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

## Startups are about people 
- Choosing the right people is more important  than choosing the right product, marketing
- Two founders is usually the best bet for success -10 years-
- In the beginning hire full stack people
- Participate in hackathons and competitions
- Make talsk, blog post and open source code

### Hiring 
- Get thing done people
- Culture is important, deliver wow through service
- ask the candidate to teach you something
- Pair programming with candidates
- Find activities that push you beyond your capabilities

## Study
- Set concrete measurable logs, practice and teach
- Be a builder
- Share what you learn
- Mentoring and documentation

## Programmers oath
I Promise that, to the best of my ability and judgement:

- I will not produce harmful code.
- The code that I produce will always be my best work. I will not knowingly allow code that is defective either in behavior or structure to accumulate.
- I will produce, with each release, a quick, sure, and repeatable proof that every element of the code works as it should.
- I will make frequent, small, releases so that I do not impede the progress of others.
- I will fearlessly and relentlessly improve my creations at every opportunity. I will never degrade them.
- I will do all that I can to keep the productivity of myself, and others, as high as possible. I will do nothing that decreases that productivity.
- I will continuously ensure that others can cover for me, and that I can cover for them.
- I will produce estimates that are honest both in magnitude and precision. I will not make promises without certainty.
- I will never stop learning and improving my craft.

##  Effective engineers
Adopt the right mindset:
- **Focus on High Leverage Activities**
- Leverage = Impact Produced / Time Invested
- Use Leverage as Your Yardstick for Effectiveness 
- They are the people who get things done. Effective Engineers produce results.
- Talk to people. Become good at telling stories.
- **Optimize for Learning**
- Seek work enviroments conducive to learning :
    * Fast Growth: Companies where #problems >> #resources. Opportunity to choose high impact work.
- Read code written by brilliant engineers.
- Always be learning. Invest in skills that are in high demand
- Priorizate Regularly
- Don't try to remember stuff. Brain is bad at remembering. It's rather good at processing
- Ask yourself regularly: Is this the most important thing I should be working on?
- Limit the amount of Work in Progress. Cost of context switching is high.
- **Invest in Iteration Speed**
- Continous deployment is high leverage
- Move fast to learn fast
- Invest time  in saving tools: compilation, testing, hot-reload
- High test coverage to reduce build and site breakages
- Master Your Programming Environment
- **Measure what you want to Improve**
- If you can't measure it, you can't improve it.
- Good metric.
    * Helps you focus on right things.
    * Performance ratcheting: Any change should strictly improve the metric.
- Metric you choose influences your decisions and behavior.
- Instrumenting everything to understand was going on
- Internalize useful numbers
- **Validate your ideas early and often.**
- Not validating early leads to wasted efforts.
- Approach problem iteratively.
- **Improve project estimation skills.**
- Communication overhead is significant.
- Additional hours hurt productivity. Causes burnout.
- Allow buffer room for the unknown.
- **Balance Quality with Pragmatism**
- High code quality. Code readability.
- Establish sustainable code review process.
    * Catch bugs and design problems early.
    * Sharing working knowledge of the codebase.
    * Increases long term agility. Easier to understand, quicker to modify.
- Manage complexity through Abstraction
- Right abstractions make huge difference.
- *Automate Testing*
- Unit test cases and some integration testing provide a scalable way of managing growing codebase.
- Tests also allow engineers to make changes, especially large refactorings, with significantly higher confidence.
- *Repay Technical Debt*
- Technical debt refers to all the deferred work that’s necessary to improve the health and quality of the codebase and that would slow us down if left unaddressed.
- **Reduce Operational Complexity**
- fail-fast to surface issues immediately.
- **Invest in your team's Growth**
- Invest in onboarding.
- your effectiveness will be measured not by your individual contributions but by your impact on the people around you
- Keep bus factor more than one.
- Shared ownership removes isolated silos of information.
- Invest in your onboarding
- Dont rewrite the legacy code from scrath is a big mistake
- Get familiar with UNIX


Key Takeaways
- **The faster you can iterate**, the more you can learn. Conversely, when you move too slowly trying to avoid mistakes, you lose opportunities.
- **Invest in tooling**. Faster compile times, faster deployment cycles, and faster turnaround times for development all providetime-saving benefits that compound the more you use them.
- **Optimize your debugging workflow**. Don’t underestimate how much time gets spent validating that your code works. Invest enough time to shorten those workflows.
- **Master the fundamentals of your craft**. Get comfortable andefficient with the development environment that you use on adaily basis. This will pay off dividends throughout your career.
- **Take a holistic view of your iteration loop**. Don’t ignore any organizational and team-related bottlenecks that may be within your circle of influence.
=======
=======
### Bugs
- Most expensive in production
- Expensive in QA
- Cheaper to fix in Dev
- Least expensive to avoid in design

### Qualities

- Problem solver
- Skilled
- Mentor
- Excellent learner

Abstraction is the key to simple code

Saying no its as important as saying yes and taking responsability

Don’t write code when you are tired. Dedication and professionalism are more about discipline than hours. Make sure that your sleep, health, and lifestyle are tuned so that you can put in eight good hours per day.

If you compromise the structure you compromise the future
Remove ambiguity between stakeholders & developers with automation and acceptance TDD
Automate happy paths with business and unhappy paths
IT evolve from support to Source of competitive differentiation (develop in house talent)
Promote craftmanship and outcume instead of speed features
Unburden top people.. Give time to code and Problem solvong instead of bureocratic navigation hurdles and progress review and updates
Follow your disciplines under pressure... Add more test more refactors and more pairing
Estimation are distributions and always meet the commitment
Programmers must understand businesses goals
Products are better than projects
Test behaviors not classes

# Lean Software

- Remove code .. negative value: culture and mindset
- No code is the best code
- Domain driven design code starts with names but is more
- 10x developer if you make 10 people better
- Technical debt : Invest time in writing test and automation tools not debugging
- Create software as a sustainable code not speed and rot

# Programers oath

- Dont ship harmful code
- Do your best possible work
- Make a repetible and quick form of proof of your software delivery correctness
- Improve teams productivity
- Cover each other 
- Provide real stimations
- Make frequent small releases
- I will fearless improve my creations at every opportunity
- I will never stop learning and improve my craft

# Peopleware

- Productivity = Benefit /cost
- Creative work needs time to generate the best outcome
- Make quality set by the buyer rather than the builder
- People under pressure don't work better they work faster

# Startups

- Big will not beat small anymore. The fastest will be beating the slow
- A complex system that works is invariably found to have evolved from a simple system that work
- Startups provide great autonomy and make you to take significant decisions
- Purpose, Mastery, Autonomy
- Be a maker
- Share your ideas
- Work for an stablished company, then an startup and finally start your own company
- Open source, Services, Distribution, Information, Money


# Head first 
- Encapsulte what varies
- Favor composition over inheritance
- Program to interfaces not implementations
- Strive for loosely coupled design between objects that interact
- Classes should be open for extension closed for modification
- Depend on abstractions, do not depend on concrete classes
- A class should have only one reason to change