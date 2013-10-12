core {
  baseUrl = "http://localhost:8000"
  baseContext = "/filmster-core/"
}

environments {
  functional01 {
    core {
      baseUrl = "http://filmster-core-func01.herokuapp.com/"
      baseContext = "/"
    }
  }
}