# Clean Agile

Great thing are made of small teams making smalls things
Agile provides data
The customer doesnt know what he wants
Agile is not a mini-waterfall : Rather the activities of architecture, design, implementation are continous throught the iteration
Agile is not about going fast is about destroying hope though continous feedback
Adding man power to a late project can have a negative impact: Learning curve, communication complexity
the only way to go fast is to go well

## Reasonable expections

- We can ship shit
- Continous technical readiness: system must be technically deployable at the end of the iteration (no qa stabilization, bypass demos)
- Stable productivity: Go very fast greenfield project then slow down  (mess in the code is acomulated)
The existing code is the most powerful instructor
- poring the old code to redesign because this is all the documentation
The original developers had all been promoted and gone off to management positions. The current members of the team stood up in unison and said, “You can’t ship this, it’s crap. It needs to be redesigned.” (The tiger team never finished the new system design)
- Inexpensive adaptability : word. The word “ware” means “product.” The word “soft” means easy to change. Therefore, software is a product that is easy to change
I’ve got some news for you, sunshine. If a change to the requirements breaks your architecture, then your architecture sucks.
- *Make changes relative inexpensive is our job*
- Continous improvement: humans make better with time
The design and architecture of a software system should get better with time, structure of the code
- Fearless Competence: fear forces you to bevahe incompetenly
- QA Should Find Nothing
- Test automation: Manual test are expensive
- We cover for each other
- Honest stimates
- You need to say no
- Continous agressive learning
- Mentoring : the best way to learn is teach

## Customer Bill of Rights
- An overall plan and to know what can be accomplished when and at what cost
- The most possible value out of every iteration
- See progress in a running system, proven to work by passing repeatable tests that you specify

## Developer Bill of Rights
- know what is needed with clear declarations of priority
- produce high-quality work at all times: business people can push for lower quality
- ask for and receive help from peers, managers, and customers
- accept your responsibilities instead of having them assigned to you
- change stimates -> stimates are not commintments




## Practices

### Technical practices

 Test driven development
- Pairing
- Simple desing
- Refactoring

### Team practices

- Continous integration
- Methapor (ubiquotous language)
- Sustanible peace
- Collective ownership

### Business practices

## Acceptance test
Must be written between BA, Developers and QA
QA must write the unhappy paths and provide early feedback using acceptance test

## Whole team (Cross functional)
Shorten the distance between users and programmers
## Planning game
Breaking down the pieces and stimate them, stimates are imprecise by definition

Such estimates are composed of three numbers: best-case 95%, nominal-case 50%, and worst-case 5%.
A user story is an abbreviated description of a feature of the system, told from the point of view of a user

The wording is simple, and the details are omitted because it is too early to count on those details. We want to delay the specification of those details as long as possible

Iteration zero: placeholders stories
Midpoint check 
The end of the project is when the stories are not worth
Stories: INVEST
* Independent: Order of business value
* Negotiable: Check the cost of development
* Valuable: H/M/L
* Estimable
* Small: can be donde in one iteration

Acceptance test writing should go quickly
The demo should include showing that all the acceptance tests run—including all previous acceptance tests
Always have a golde story
Return of investment
* High cost - high value: do later
* Low cost - high value: do now
* Low value - high cost: do never
* Low value - low cost: do much later

## Small releases
The practice of Small Releases suggests that a development team should release their software as often as possible

