<?php

interface Greeter {
    public function sayHi();
}

class MyGreeter implements Greeter {
    public function sayHi() {
        echo "Hi there!\n";
    }
}

function runGreeter($greeter) {
    $greeter->sayHi();
}

runGreeter(new MyGreeter());
// runGreeter(23);
// runGreeter(null);

?>
