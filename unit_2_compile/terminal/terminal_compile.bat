javac -sourcepath ./src -d build/classes/ -cp ./libs/commons-lang3-3.11.jar;./libs/java-util-1.3.1.jar src/ua/com/nix/test1/Test1.java src/ua/com/nix/test2/Test2.java src/ua/com/nix/main/Mainn.java
java -cp build/classes/;./libs/commons-lang3-3.11.jar;./libs/java-util-1.3.1.jar ua.com.nix.main.Mainn