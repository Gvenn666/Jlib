# JLIB
## Util
### SYS
- Static class
- Private class
#### Methods
- PrintStream getStdOut()
- PrintStream getStdErr()
- InputStream getStdIn()
- void setStdOut(PrintStream)
- void setStdErr(PrintStream)
- void setStdIn(InputStream)

### IO
- Static class
- Private Constructor
#### Methods
- String[] loadStrings(String path)
- short[] loadUnsignedBytes(String path)
- int[] loadUnsignedShorts(String path)
- void saveStrings(String[] data, String path)
- void saveInts(int[] data, String path)
