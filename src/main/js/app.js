const React = require("react")
const ReactDOM = require("react-dom")
import { useState, useEffect } from "react"
import ActorsPage from "./actors"
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

function App() {
    // render
    return (
        <div>
            <NavBar />

                <Router>
                    <Switch>
                        <Route path="/">
                            
                            <ActorsPage />
                        </Route>
                        <Route path="/actors">
                            
                            <ActorsPage />
                        </Route>
                    </Switch>
                </Router>

        </div>
    )
}

function NavBar() {
    return (
        <div className="customNavBar navbar-light bg-dark">
            <ul className="nav justify-content-center">
                <li className="nav-item">
                    
                    <a className="nav-link text-white" href="#">Actor</a>
                </li>
            </ul>
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById("react"))
