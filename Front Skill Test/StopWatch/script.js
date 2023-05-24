// Initializing the hour, minute, second and millisecond with 0
let hr="0"+0;
let min="0"+0;
let sec="0"+0;
let ms="0"+0;
let startTimer;

// Getting reference to the start, stop and reset button
const startBtn = document.querySelector(".start");
const stopBtn = document.querySelector(".stop");
const resetBtn = document.querySelector(".reset");

// Adding event listeners to the start, stop and reset button
startBtn.addEventListener("click", start);
stopBtn.addEventListener("click", stop);
resetBtn.addEventListener("click", reset);

// Function to start the timer
function start() {
    // Adding the active class to the start button and removing the stopActive class from stop button
    startBtn.classList.add("active");
    stopBtn.classList.remove("stopActive");

    // Starting the timer and updating the millisecond, second, minute and hour value
    startTimer = setInterval(()=>{
        ms++;
        ms = ms<10? "0" + ms : ms;
        if(ms===100){
            sec++;
            sec = sec<10? "0" + sec :sec;
            ms="0"+ 0;
        }
        if(sec===60){
            min++;
            min = min<10? "0" + min :min;
            sec ="0"+0;
        }
        if(min===60){
            hr++;
            hr = hr<10? "0" + hr :hr;
            min = "0"+ 0;
        }
        putValue();
    }, 10); 
    //1000ms = 1s and here 100ms is showing in UI so we take interval of 10ms
}

// Function to stop the timer
function stop() {
    // Removing the active class from the start button and adding the stopActive class to the stop button
    startBtn.classList.remove("active");
    stopBtn.classList.add("stopActive");

    // Clearing the time interval set in start() to show value as it is currently 
    clearInterval(startTimer);
}

function reset(){
    // Removing the active and stopActive class from the start and stop button respectively
    startBtn.classList.remove("active");
    stopBtn.classList.remove("stopActive");
    clearInterval(startTimer);

    // Resetting the value of hour, minute, second and millisecond
    hr = min = sec = ms = "0"+0;
    putValue();
}

// Function to update the value of hour, minute, second and millisecond in the UI
function putValue() {
    document.querySelector(".hour").innerHTML = hr;
    document.querySelector(".minute").innerHTML = min;
    document.querySelector(".second").innerHTML = sec;
    document.querySelector(".millisecond").innerHTML = ms;
} 
