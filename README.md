# lzstring4j - LZString for Java

lzstring4j is an easy to use implementation of [JavaScript LZString Library](https://github.com/pieroxy/lz-string) for Java.

This idea is inspired by [lz-string-java](https://github.com/ownaginatious/lz-string-java).

Features:

 * Based on last version of JavaScript LZString Library (version 1.3.3) 
 * UTF-16 compression
 * Interoperable with the JavaScript Library through the UTF-16 compression methods (Java Server -> JS on Web or Node.js server -> Java Client/Android) 
 	thanks to this [post](http://www.productiverage.com/javascript-compression-putting-my-json-search-indexes-on-a-diet).

## How to use

Using lzstring4j is quite simple. But lets see:

Checkout and compile the project:

``` bash
git clone https://github.com/diogoduailibe/lzstring4j.git
cd lzstring4j
ant jar
mv jar/lzstring4j.jar /path/to/your/libs/project
```

If you're using ant, change your build.xml to include lzstring4j.jar. If you're eclipse, add the jar to your project buildpath.

Afterwards, you'll be able to use this library: 

#### Normal Compression and Decompression:

``` java
	
	    // Normal Compression and Decompression
		String test = "Lets see how much we can compress this string!";

		String output = LZString.compress(test);

		System.out.println("Compressed: " + output);

		String decompressed = LZString.decompress(output);
		
		System.out.println("Decompressed: " + decompressed);
```

#### UTF-16 Compression and Decompression:

``` java		
		//UTF-16 Compression and Decompression 
		String testUTF16 = "Lets see how much we can compress this string!";

		String outputUTF16 = LZString.compressToUTF16(testUTF16);

		System.out.println("Compressed: " + outputUTF16);

		String decompressedUTF16 = LZString.decompressFromUTF16(outputUTF16);
		
		System.out.println("Decompressed: " + decompressedUTF16);
```

 
## Checkout

	git clone https://github.com/diogoduailibe/lzstring4j.git

## Building
	
to build a jar-file:

	cd $PATH_TO_LZSTRING4J
	ant jar
	ls jar/lzstring4j.jar

You'll find the lzstring4j-jar in jar/lzstring4j.jar 

## Bugs

Please report any bugs feature requests to [the Github issue tracker](https://github.com/diogoduailibe/lzstring4j/issues)

## Frameworks

This Library was designed with portability in mind.

* __Android__ is fully supported.
* __JRE__ is fully supported.


## TODO

* Implement base64 compression and decompression methods
* More tests...

## License - the boring stuff...

See LICENSE file.
