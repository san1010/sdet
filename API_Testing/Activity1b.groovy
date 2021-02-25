package example

class Activity1b {
	static void main(def args) {
		File file= new File("C:/Users/SandeepPatil/eclipse-workspace/MyFirstGroovyProject/src/example/input.txt")
		file.createNewFile()
		file.write("The quick brown fox jumps over the lazy cow\n")
		file.append("John Jumbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")
		file.eachLine { 
			if(it =~ /cow$/) {
				println it
			}
			
			if(it =~ /^John/) {
				println it
			}
			if(it =~ /\d{2}/) {
				println it
			}
			if(it =~/\d/) {
				println it
			}
			
			
		}
		def match1=file.text =~ /\S+er/
		println match1.findAll()
		
		def match2=file.text =~ /\S*\d\W/
		println match2.findAll()
	}
}
