cmake_minimum_required(VERSION 3.18.1)

set(CMAKE_CXX_STANDARD 20)

set (CMAKE_CXX_FLAGS "-Werror,-Wformat-security")

find_package(Dobby REQUIRED CONFIG)

include_directories(include)
include_directories(prefab/modules/dobby/include)

add_library(native-lib SHARED
        SHARED hook.cpp il2cpp_dump.cpp)

target_link_libraries(native-lib log dobby::dobby )
