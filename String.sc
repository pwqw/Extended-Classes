+ String {

	*setNetAddr { |addr, port|
		Library.put(\oscAddr, NetAddr(addr, port));
	}

	*getNetAddr {
		^Library.at(\oscAddr);
	}

	postoc {
		var netAddr = Library.at(\oscAddr);
		netAddr !? { netAddr.sendMsg("/post", this) };
		^this.postln
	}

	postocf { | ... items|
		var msg = this.prFormat( items.collect(_.asString));
		var netAddr = Library.at(\oscAddr);
		netAddr !? { netAddr.sendMsg("/post", msg) };
		^msg.postln;
	}
}
