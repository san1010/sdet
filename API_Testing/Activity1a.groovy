package example

class Activity1a {
	static void main(def args) {
		def inputList=[4,2,9,"mango","apple","banana"]
		println "Given inputList " + inputList
		def intList=inputList.minus(["mango","apple","banana"])
		println "Original List"+intList
		println "Sorted List "+intList.sort()
		def strList=inputList.minus([4,2,9])
		println "Original List"+strList
		println "Sorted List "+strList.sort()
		
	}
}
