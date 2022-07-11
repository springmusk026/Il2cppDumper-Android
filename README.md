# Il2cppDumper-Android
all credits to prefare for his work -Zysgik il2cpp dumper i just changed the way it worked 

# Notice
This repo contains codes of {Prefare](https://github.com/Perfare) from repo [Zysgik-Dumper](https://github.com/Perfare/Zygisk-Il2CppDumper)

# Features
- Can Dump Hardly Encrypted Games As Codm

# Usage 
- Compile with Android Studio

-Search for game's main activity and paste this on onCreate
```smali
 const-string v0, "native-lib"
 
 invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
```
- re-compile and run it
- once the dump complete it will auto generate dump.cs in /sdcard/Download

# Credit :
[Zysgik-Il2cppDumper](https://github.com/Perfare/Zygisk-Il2CppDumper) <br/>
