wsdluri='http://services.aonaware.com/DictService/DictService.asmx?WSDL'
gensrcdir='./src'
targetpackage='com.topriddy.tenibot.client'
genoutdir='./war/WEB-INF/classes'
wsimport -d "$genoutdir" -s "$gensrcdir" -p $targetpackage -keep "$wsdluri"
