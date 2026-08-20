package com.jakewharton.mosaic

public interface VirtualStdStreams {

	public fun print(text: Any?)

}

public class VirtualStdStreamsImpl : VirtualStdStreams {

	public override fun print(text: Any?) {
		kotlin.io.print(text)
	}

}
