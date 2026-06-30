# Automation Recommendation

Based on my current QA experience, I would recommend starting automation coverage with API tests before UI tests.

## Reasoning

API tests are faster, less brittle, easier to debug, and provide strong coverage of business rules.

## Suggested first candidates

- Authentication API
- User profile API
- Search or lookup API
- Permission-based API checks
- Key regression workflows

## UI automation should focus on

- Critical happy paths
- Smoke coverage
- High-value regression flows
- Cross-browser confidence checks