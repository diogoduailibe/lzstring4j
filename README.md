# lzstring4j - LZString for Java

lzstring4j is an easy to use implementation of [JavaScript LZString Library](https://github.com/pieroxy/lz-string) for Java.

This idea is inspired by [lz-string-java](https://github.com/ownaginatious/lz-string-java).

Features:

 * Based on JavaScript LZString Library (version 1.3.3) 
 * UTF-16 compression
 * Base64 compression
 * Interoperable with the JavaScript Library through the UTF-16 compression methods (Java Server -> JS on Web or Node.js server -> Java Client/Android) 
 	thanks to this [post](http://www.productiverage.com/javascript-compression-putting-my-json-search-indexes-on-a-diet).

## How to use

Using lzstring4j is quite simple. But lets see:

Checkout and compile the project:

``` bash
git clone https://github.com/diogoduailibe/lzstring4j.git
cd lzstring4j
mvn clean install

```

Then, import in your project using maven dependecy

```xml
<dependency>
	<groupId>com.github.diogoduailibe</groupId>
	<artifactId>lzstring4j</artifactId>
	<version>1.3.3</version>
</dependency>
```


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

#### Base64 Compression and Decompression:

``` java		
		//Base64 Compression and Decompression 
		String testBase64 = "Lets see how much we can compress this string!";

		String outputBase64 = LZString.compressToBase64(testBase64);

		System.out.println("Compressed: " + outputBase64);

		String decompressedBase64 = LZString.decompressFromBase64(outputBase64);
		
		System.out.println("Decompressed: " + decompressedBase64);
```

## Tests

In order to run JUnit tests, just run: 

```bash
mvn test
```

You'll see tests for Normal, UTF-16 and Base64 compression and decompression.
 
## Checkout

	git clone https://github.com/diogoduailibe/lzstring4j.git

## Building
	
to build a jar-file:

	cd $PATH_TO_LZSTRING4J
	mvn clean install
	ls target/lzstring4j-<version>.jar

You'll find it in target/lzstring4j-<version>.jar 

## Bugs

Please report any bugs feature requests to [the Github issue tracker](https://github.com/diogoduailibe/lzstring4j/issues)

## Frameworks

This Library was designed with portability in mind.

* __Android__ is fully supported.
* __JRE__ is fully supported.


## TODO

* Improve code to execute more efficiently
* Update to version 1.4.4
* More tests...


## CONTRIBUTORS (Thanks to all, by the way!)

* diogoduailibe
* [helloanand](https://github.com/helloanand)
* [cloudeecn](https://github.com/cloudeecn)


## License - the boring stuff...

See LICENSE file.
