Narrative:
As a user
I want to visit jbehave page and reuse steps from another story

Scenario: Visit jbehave page
Given I go to https://jbehave.org/ page
Then I should be on https://jbehave.org/ page

Scenario: Visit the same jbehave page as second scenario
Given I go to https://jbehave.org/ page
Then I should be on https://jbehave.org/ page
