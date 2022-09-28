Difference between Java 8 Map() Vs flatMap()


                map()
=========================================
It processes stream of values.
It does only mapping.
It’s mapper function produces single value for each input value.
It is one-to-one mapping.
Data Transformation: From stream to Stream.
Use this method when the mapper function is producing a single value for each input value.



               flatMap()
=========================================
It processes stream of stream values.
It performs mapping as well as flattening.
It’s mapper function produces multiple values for each input value.
It is one-to-many mapping.
Data transformation: From stream<Stream to Stream.
Use this method when the mapper function is producing multiple values for each input value.
