# aes-file-for-enclave-custom-1000-blocks
Run this to avoid getting permission errors later on during script. we didnt use sudo in script as it would have asked for password for each of the 900 lines of code.
```
sudo su
```
First Clone then run: 
```
sudo chmod +x <filename.sh>
```
To make the file executable. Otherwise you will get errors.

As name of class was Main in code hence file name should match it. Also first run:
```
javac Main.java
```
followed by

```
java Main > aeswithoutsgx.sh
```
run using this command:
```
time ./<filename.sh>
```
