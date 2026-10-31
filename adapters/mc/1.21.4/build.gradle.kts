plugins {
    id("net.fabricmc.fabric-loom-remap") version "1.19.3"
    id("accountsx.mc.adapter")
}

adapter {
    minecraft = "1.21.4"
    yarn = 8
    loader = "0.16.10"
    api = "0.118.5"
    authlib = "6.0.54"
}