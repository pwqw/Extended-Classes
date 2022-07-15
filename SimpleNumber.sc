+ SimpleNumber {
	midilin { |a, b|
		^this.linlin(0,127, a, b)
	}

	linmidi { |a, b|
		^this.linlin(a, b, 0,127)
	}

	midiexp { |a, b|
		^this.linexp(0,127, a, b)
	}

	expmidi { |a, b|
		^this.explin(a, b, 0,127)
	}

	blin { |a, b|
		^this.linlin(0.0,1.0, a, b)
	}

	bexp { |a, b|
		^this.linexp(0.0,1.0, a, b)
	}

	expb { |a, b|
		^this.explin(a, b, 0.0,1.0)
	}
}
