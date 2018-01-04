# fantastic-doodle

## Running the tests

To run all the tests

```
gradle clean test aggregate
```

To run only tests with tag feature:Pet

```
gradle clean test aggregate -Dtags="feature:Pet"
```

To run only tests with tag feature:Inventoryt

```
gradle clean test aggregate -Dtags="feature:Inventory"
```