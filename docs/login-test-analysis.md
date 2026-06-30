# Login Test Analysis

## Manual test scenarios

1. Valid user can log in
2. Invalid password shows an error
3. Blank username shows validation
4. Blank password shows validation
5. Locked user cannot log in
6. User can log out
7. Session expires after inactivity

## Good automation candidates

- Valid login
- Invalid password error
- Required field validation
- Logout

## Poor automation candidates

- Visual judgement of exact layout
- Exploratory checks around confusing error wording
- One-off edge cases that rarely change

## API automation opportunities

- Validate successful authentication response
- Validate failed authentication response
- Validate status codes
- Validate valid users
- Validate error messages
- Validate response schema
- Validate token presence or absence

## Risks

- Test data may be unstable
- Environment may be slow
- UI tests may fail because of timing
- Login tests can block many other tests if not designed carefully