package org.darkstorm.minecraft.darkbot.protocol.v5x.play.client;

import org.darkstorm.minecraft.darkbot.protocol.*;
import org.darkstorm.minecraft.darkbot.protocol.ProtocolX.State;

import java.io.*;

public class PacketC14_TabComplete extends AbstractPacketX implements WriteablePacket {

	public PacketC14_TabComplete() {
		super(0x00, State.PLAY, Direction.UPSTREAM);
	}

	@Override
	public void writeData(DataOutputStream out) throws IOException {
	}
}
