## User Stories

```
As a system administrator,
I want my users to have to create a user account with an email address and a password.

I want them to receive an "invalid password" message if they provide a
password less than 8 characters in length.

I want them to receive an "invalid email" message if they provide an email
address without an @ symbol in it.

I want new accounts to be disabled by default until I manually set them as enabled.

I want users to know if they are able to log in or not based on whether their
account is enabled or disabled.
```

## Domain Model


| Classes      | Members          | Methods                                     | Scenarios                                                          | Outputs         |
|--------------|------------------|---------------------------------------------|--------------------------------------------------------------------|-----------------|
| LoginManager | String email     | LoginManager(String email, String password) | Create a new user using an email address and password              |                 |
|              |                  |                                             | with their canLogin status automatically set to false              |                 |
|              | String password  | String setEmail(String email)               | Set or modify their email address successfully                     | Success message |
|              |                  |                                             | Fail to set or modify their email address as email is invalid      | Failure message |
|              | boolean canLogin | String getEmail()                           | Get the user's email address                                       | Email address   |
|              |                  | String setPassword(String password)         | Set or modify the user's password successfully                     | Success message |
|              |                  |                                             | Fail to set or modify the user's password as password is too short | Failure message |
|              |                  | String getPassword()                        | Get the user's password                                            | Password        |
|              |                  | boolean getLoginStatus()                    | The user can query whether they can login or not                   | true or false   |
|              |                  | void toggleLogin()                          | Change the user's login status                                     |                 |

