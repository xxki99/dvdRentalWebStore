const React = require("react")
const ReactDOM = require("react-dom")
import { useState, useEffect } from "react"
import ActorsPage from "./actors"




function App() {

    // render
    return (
        <div>
            <ActorsPage />
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById("react"))
