package com.nc.course_kotlin_multi_platform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}