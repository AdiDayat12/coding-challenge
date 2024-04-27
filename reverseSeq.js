function reverse(number){
    let arr = [];
    let i = 0;
    for (number; number > 0; number--){
        arr[i] = number;
        i++;
    }
    return arr;
}

console.log(reverse(10));

