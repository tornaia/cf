SET PATH=c:\Program Files\Java\jdk-16\bin\;%PATH%
SET JAVA_HOME=c:\Program Files\Java\jdk-16\

REM jextract -C "--verbose" -d target\jextract\classes --target-package com.github.tornaia.wcs -I "C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0\cppwinrt" "C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0\um\cfapi.h"

jextract --source -C "--verbose" -d src\main\java --target-package com.github.tornaia.cf.win.cfapi "C:\Program Files (x86)\Windows Kits\10\Include\10.0.19041.0\um\cfapi.h"
