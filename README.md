# GraphQL-SpringBoot

### Create Book Request
```
mutation{
  createBook(book: {
    name:"ZZZ", 
    authorId:"f0e5b25a-3c0c-4ce8-8e04-c1db86d5caec",
    stock:10,
    amount:50.2
  }) {
    id,
    name
  }
}
```
### Get Book Request
```
query{
  getBooks {
    id,
    name,
    author{id, name},
    stock, 
    amount
  }
}
```