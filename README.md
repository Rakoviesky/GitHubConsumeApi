# Consuming GitHubApi
Simple consuming GitHub Api user data with a twist of counting requests.

Api made as a quick interview project, but also this is my first Spring boot application. 

## Task Description
Create simple REST service that should return:
- ID
- Login
- Name
- Type
- Avatar URL
- creation Date

Service should consume data from https://api.github.com/users/{login}
then save Login and request_count for each use in in-memory database(H2).



