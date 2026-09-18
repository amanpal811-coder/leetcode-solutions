SELECT 
    Person.firstName,
    Person.lastName,
    Address.city,
    Address.state
FROM Person left JOIN Address
ON Person.personId = Address.personId;