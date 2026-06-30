## Week 2 Retrospective

### What went well?
- I became more comfortable writing small Java classes and testing their behaviour with JUnit.
- I practised using AssertJ assertions to make tests easier to read.
- I used `@BeforeEach` to reduce repeated setup code in my test classes.
- I ran tests through both IntelliJ and Maven.
- I continued building confidence with Git branches, commits, pushes, and pull requests.

### What was difficult?
- Understanding when setup should go into `@BeforeEach` versus inside an individual test.
- Remembering the correct imports for JUnit and AssertJ.
- Getting used to Java syntax around classes, methods, return types, and access modifiers.
- Thinking in terms of small testable behaviours rather than large end-to-end scenarios.

### What did I learn?
- A test class should be clean, readable, and focused.
- `@BeforeEach` is useful when the same setup is needed before every test.
- AssertJ makes test assertions easier to understand.
- Negative tests are just as important as happy path tests.
- Java can throw some exceptions naturally without custom exception handling.

### What would I improve next time?
- Write the test names before writing the test code.
- Keep each test focused on one clear behaviour.
- Commit smaller chunks of work more regularly.
- Add clearer README notes as I go instead of leaving them all until the end.