data Greeter = Greeter {
  sayHi :: IO ()
}

myGreeter = Greeter {
  sayHi = do
    putStrLn "Hi there!"
}

runGreeter greeter = do
  sayHi greeter

main = do
  runGreeter myGreeter
  -- runGreeter 23
  -- runGreeter Nothing
