+ Stream {
	test { |limit=16|
        this.reset;
        limit.do({ this.next(()).postln });
	}
}
