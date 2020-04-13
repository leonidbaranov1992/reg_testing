Registration testing


Positive scenarios

First scenario
1. Open auth -reg page
2. Set correct password
3. Set correct email
4. Check that button is enabled

------------------------------------

Second scenario
1. Open auth -reg page
2. Push Registration button
3. Set correct password
4. Set correct email
5. Check Enter button is enabled

-------------------------------------

Third scenario
1. Open auth -reg page
2. Push Registration button
3. Set correct password
4. Set correct email
5. Push enter button
6. Redirect to next page

-------------------------------------

Fourth scenario
1. Open auth -reg page
2. Push Auth button
3. Set email and password which used before
4. Push enter button
5. Redirect to next page

################################################
Negative


First scenario
1. Open auth -reg page
2. Push Registration button
3. Set short password(less then 8 symbols)
4. Set correct email
5. Check that button is enabled
6. Push the button
7. Pop-up incorrect password is shown

------------------------------------

Second scenario
1. Open auth -reg page
2. Push Registration button
3. Set correct pass
4. Set incorrect email (abc)
5. Check that button is enabled
6. Push the button
7. Pop-up incorrect email is shown

-------------------------------------

Third scenario
1. Open auth -reg page
2. Push Registration button
3. Set short password(less then 8 symbols)
4. Set incorrect email (abc)
5. Check that button is enabled
6. Push the button
7. Pop-up incorrect email and incorrect email are shown

---------------------------------------

Fourth scenario
1. Open auth -reg page
2. Push Registration button
3. Set empty password
4. Set empty email
5. Check that button is disabled

Also:
Negative
*Should combination of different symbols in password and email (also special symbols)
*Should test different diapason of string length(like 1000 symbols)
*Should test negative integer
*Should test auth from twitter, facebook and vk



What should be fixed:
When enter email and password in Registration and after go to Auth page and go back - fields are empty



