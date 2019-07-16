# Nearby-WalkieTalkie

This is an improvised version of android [Nearby Connection API](https://github.com/googlesamples/android-nearby/tree/master/connections/walkietalkie), In which I have implemented Mesh Network to cover large area without an internet connection.  

## How Does It Works?

Google Nearby  platform makes it easy to discover nearby devices and establish communication with them. It uses technologies such as Bluetooth, Wi-Fi, IP, and audio.

Click [here](https://developers.google.com/nearby/) to read More. 

This app used The Nearby Messages API allows apps to publish small messages that other devices can subscribe to and receive when nearby. The messages are transmitted through the cloud. Nearby devices are detected using Bluetooth and near-ultrasound audio.

## How does Mesh Network works?

In a wireless mesh network, the network connection is spread out among dozens or even hundreds of wireless mesh nodes that "talk" to each other to share the network connection across a large area.

When you installing this app in your phone, your phone can be act as mesh node. The app will asign a mesh Id for the uniquiness of the node and will be used as source/destination address based on the user action, that is  message send  or receive. Every message payload will be having a header data in which it specifies the source and destination adress and the maximum hope to conver the message payload.  
