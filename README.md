# gptStores

1.  /api/product/items which has a GET request and it returns all the products the store has (I hardcoded a few)
2.  /api/product/items which has a POST request to add to the item list and takes a json like “{
    "id": 8,
    "price": 12.04,
    "name": "Air Canada backpack"
}”
3.  /api/cart which has a GET request to get all items in a cart, at the time of first start the cart is empty
4.  /api/cart which has a POST request to add to cart and takes the following json “    {
        "id": 1,
        "price": 12.04,
        "name": "Pokeman backpack"
    }”
5. /api/order which has a POST request to submit the order and it returns the items that were used to place an order and the total cost
