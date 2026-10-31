plugins {
    id("net.fabricmc.fabric-loom-remap") version "1.19.3"
    id("accountsx.mc.adapter")
}

adapter {
    minecraft = "1.20.4"
    yarn = 3
    loader = "0.16.10"
    api = "0.97.2"
    authlib = "6.0.52"
}