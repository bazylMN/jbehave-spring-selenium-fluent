Narrative:
As a user
I want to visit jbehave page and reuse steps from another story

Scenario: Visit o2 page
Given I go to https://www.o2.pl page
Then I should be on https://www.o2.pl page

Scenario: Visit the same o2 page as second scenario
Given I go to https://www.o2.pl page
Then I should be on https://www.o2.pl page
