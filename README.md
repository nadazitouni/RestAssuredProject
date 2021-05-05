# RestAssuredProject


Test Case 1: Test HTTP response
Initial condition (pre-request script):
- there isn't initial condition in our case
Scenario of test:
- send the endpoint «http://localhost:8080/mytest »
- method: GET

Expected result:
- HTTP Response: 200
- Response Content:
{
 a random value
}


Test Case 2: Test random value between 10 and 50
Initial condition (pre-request script):
- there isn't initial condition in our case
Scenario of test:
- send the endpoint «http://localhost:8080/mytest »
- method: GET

Expected result:
- HTTP Response: 200
- Response Content:
{
 a random value between 10 and 50
}

Test Case 3: Test condition of correct random value
Initial condition (pre-request script):
- there isn't initial condition in our case
Scenario of test:
- send the endpoint «http://localhost:8080/mytest »
- method: GET

Expected result:
- HTTP Response: 200
- Response Content:
{
 a random value
}
if random is < 15 then return Correct else return Not Correct
