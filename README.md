## Rabobank Assignment for Authorizations Area

This project contains several premade modules for you to implement your API

### API
This module is where you have to implement the API interface and connect the other two modules
### Data
This module is where you implement all stateful Mongo data.
We have provided an embedded Mongo configuration for you.
You just need to design the data you need to store and the repositories to store or retrieve it with.
### Domain
This module represents the domain you will be working with. The domain module presents classes for the power of attorney
model that contains a Read or Write authorization for a Payment or Savings account. 

We ask you kindly not to touch this module :-)

## The task at hand
Implement the following business requirement
- Users must be able to create write or read access for payments and savings accounts
- Users need to be able to retrieve a list of accounts they have read or write access for

Boundaries
- You can add dependencies as you like
- You can design the data and API models as you like (what a dream, isn't it?)
- You cannot touch the domain module
- You cannot store the domain objects directly in the database
  
Notes
- The code should be ready to go to production on delivery
