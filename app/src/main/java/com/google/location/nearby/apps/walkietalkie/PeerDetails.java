package com.google.location.nearby.apps.walkietalkie;

public class PeerDetails {
    static PeerDetails peerDetails;
    String peerAddress;
    public static PeerDetails getInstance(){
        if(peerDetails==null){
            peerDetails=new PeerDetails();
        }
        return peerDetails;
    }



    public String getPeerAddress() {
        return peerAddress;
    }

    public void setPeerAddress(String peerAddress) {
        this.peerAddress = peerAddress;
    }

    public int peerAddressToInt(){
        try{
            return Integer.parseInt(getPeerAddress());
        }catch (Exception e){
            return -1;
        }
    }
}
