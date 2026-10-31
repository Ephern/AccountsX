plugins {
    id("net.fabricmc.fabric-loom-remap") version "1.19.3"
    id("accountsx.mc.adapter")
}

adapter {
    minecraft = "1.20.6"
    yarn = 3
    loader = "0.16.10"
    api = "0.100.8"
    authlib = "6.0.54"
}