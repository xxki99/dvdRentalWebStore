const React = require("react")
const ReactDOM = require("react-dom")
import { useState, useEffect } from "react"
import Actor from "./actors" 



// import bootstrap





function App() {

    // render
    return (
        <div>
            <Actor />
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById("react"))
