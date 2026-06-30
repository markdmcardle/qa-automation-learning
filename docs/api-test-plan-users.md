# API Test Plan - Users Endpoint

## Endpoint

GET /users/{id}

## Test scenarios

| Scenario                | Expected result                 | Automation priority |
|-------------------------|---------------------------------|---------------------|
| Valid user ID           | 200 response with user details  | High                |
| Non-existing user ID    | 404 response                    | High                |
| Invalid ID format       | 400 response                    | High                |
| Missing auth token      | 401 response                    | High                |
| User without permission | 403 response                    | Medium              |
| Response time too slow  | Response under agreed threshold | Medium              |

## Assertions to automate

- Status code
- Response body fields
- Required fields are not null
- Error message
- Response time
- Schema shape
- Auth behaviour

## Data needed

- Valid user ID
- Invalid user ID
- Authenticated user token
- Unauthorized token
- Expired token

## Notes

API automation is a good early focus because it is faster, more stable, and easier to run in CI than UI automation.