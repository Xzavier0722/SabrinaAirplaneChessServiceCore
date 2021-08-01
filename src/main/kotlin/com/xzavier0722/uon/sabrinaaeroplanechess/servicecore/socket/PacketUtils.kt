package com.xzavier0722.uon.sabrinaaeroplanechess.servicecore.socket

import com.xzavier0722.uon.sabrinaaeroplanechess.common.networking.Packet
import com.xzavier0722.uon.sabrinaaeroplanechess.common.networking.Request

object PacketUtils {

    fun getReplyPacketFor(packet: Packet) : Packet{
        val re = Packet()
        re.id = packet.id
        re.sessionId = packet.sessionId
        return re
    }

    fun getConfirmPacket(packet: Packet) : Packet{
        val re = getReplyPacketFor(packet)
        re.id = packet.id
        re.data = "CONFIRM"
        re.request = Request.CONFIRM
        re.sign = "NULL"
        return re
    }

}