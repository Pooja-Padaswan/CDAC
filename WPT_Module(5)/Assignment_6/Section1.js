// Ques 2: Calculate the area of a rectangle using both regular function and arrow function

// Regular function
function calculateArea(length, breadth) {
    console.log(length * breadth);
}

// Arrow function
const calcArea = (length, breadth) => {
    console.log(length * breadth);
};

// Ques 3: Create an object to represent a book with properties and a method to display the book details

var book = {
    title: "Effective Java",
    author: "Sameer Sir",
    year: 2015,
    bookDetails: function() {
        console.log(`Title: ${this.title}, Author: ${this.author}, Year: ${this.year}`);
    }
};
book.bookDetails(); // Call the method to display book details

// Ques 4: Object destructuring to extract properties of a car object
var car = {
    model: "Fortuner",
    type: "SUV",
    price: 6000000
};

const { model, type, price } = car;
console.log(model, type, price); // Output destructured values

// Ques 5: Array destructuring to extract the first two numbers
let arr = [1, 2, 3, 4, 5];
const [first, second] = arr;
console.log(first, second); // Output first two elements

// Ques 6: Using map to create a new array with the lengths of the names in the array
let sArr = ["Pooja", "Rohini", "Shweta", "Kiran", "Priti"];
let newArr = sArr.map((x) => x.length);
console.log(newArr); // Output array of name lengths

// Ques 7: Using filter to create a new array containing only the even numbers
let a = [1, 2, 3, 4, 5, 6, 7, 8];
let evenArr = a.filter((x) => x % 2 === 0);
console.log(evenArr); // Output array of even numbers

// Ques 8: Using reduce to find the total price of items in a shopping cart
let shoppingCart = [
    { item: "bottle", price: 200 },
    { item: "Pen", price: 20 },
    { item: "Board", price: 250 },
    { item: "Mirror", price: 500 },
    { item: "Copy", price: 200 }
];

let total = shoppingCart.reduce((acc, curr) => curr.price + acc, 0);
console.log("Total:", total); // Output total price

// Ques 9: Use the rest operator to sum any number of arguments
const sum = (...args) => {
    return args.reduce((a, b) => a + b, 0);
};

console.log(sum(1, 2, 3, 4, 5)); // Output sum of arguments

// Ques 10: Use the spread operator to merge two arrays of fruits
let fruits1 = ["mango", "apple", "banana"];
let fruits2 = ["grapes", "tomato", "chiku"];

let allFruits = [...fruits1, ...fruits2];
console.log("All Fruits:", allFruits); // Output merged array of fruits

// Ques 11: Write a function that accepts a callback and executes it after a delay
const addNumbers = (a, b) => {
    return a + b;
};

const executed = (func) => {
    setTimeout(() => {
        let a = 3;
        let b = 5;
        func(a, b);
    }, 4000);
};

executed(addNumbers); // Executes sum after 4 seconds

// Ques 12: Create a promise that resolves with a message after 3 seconds
var myPromise = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Promise resolved!");
    }, 3000);
});

myPromise.then((message) => console.log(message)); // Output after 3 seconds

// Ques 13: Create a function that returns another function, demonstrating closure
const fetchData = () => {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Hi");
        }, 10000);
    });
};

const func = async () => {
    const value = await fetchData();
    console.log(value); // Output after 10 seconds
};

func(); // Call async function

// Ques 14: Apply filter to keep only even numbers, then map to double those numbers, and finally use reduce to calculate total
const operation = (arr) => {
    let value = arr
        .filter((x) => x % 2 === 0) // Keep only even numbers
        .map((a) => a * 2) // Double the even numbers
        .reduce((a, b) => a + b, 0); // Sum the doubled numbers
    return value;
};

let array = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(operation(array)); // Output the final total
