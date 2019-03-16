// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/asharda/Downloads/play/play-java-seed/conf/routes
// @DATE:Fri Mar 15 07:18:24 EDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
