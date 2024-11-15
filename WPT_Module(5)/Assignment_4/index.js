// Question 1
const toUC = (str) => {
    return str.toUpperCase();
};
const processData = (str, toUC) => {
    const output = toUC(str);
    console.log("Question 1 Output:", output);
};
processData("POOJA", toUC);

// Question 2
const multiple = (value) => {
    return value * 2;
};
const changeArr = (a, multiple) => {
    let newArr = a.map((a) => {
        return multiple(a);
    });
    return newArr;
};
let arr = [1, 2, 3, 4, 5];
console.log("Question 2 Output:", changeArr(arr, multiple));

// Question 3
const func = (string) => {
    console.log("Question 3 Output: response from", string);
};
const fetchData = (url, func) => {
    setTimeout(() => {
        func(url);
    }, 10000); // 10-second delay
};
fetchData("user/profile", func);

// Question 4
const func1 = (string) => {
    return {
        ok: true,
        res: "response",
    };
};
const fetchData1 = (url, func) => {
    setTimeout(() => {
        try {
            let response = func(url);
            if (response.ok) {
                console.log("Question 4 Output:", response.res);
            } else {
                throw new Error("Response Failed");
            }
        } catch (error) {
            console.error("Question 4 Error:", error.message);
        }
    }, 10000); // 10-second delay
};
fetchData1("user/profile", func1);

// Question 5
const func2 = (string) => {
    return {
        ok: true,
        res: "response",
    };
};
const fetchData2 = (url, func, callback) => {
    setTimeout(() => {
        let response = func(url);
        if (response.ok) {
            callback(null, response.res); // Success callback
        } else {
            callback(new Error("Response Failed"), null); // Error callback
        }
    }, 10000); // 10-second delay
};
const processData1 = (res) => {
    console.log("Question 5 Output: Response is", res);
};
fetchData2("user/profile", func2, (error, result) => {
    if (error) {
        console.error("Question 5 Error:", error.message);
    } else {
        processData1(result);
    }
});
