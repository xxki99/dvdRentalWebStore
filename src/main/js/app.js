const React = require("react")
const ReactDOM = require("react-dom")
import { useState, useEffect } from "react"
import ActorsPage from "./actors"
import { FilmsPage, FilmDetail } from "./films"
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

                <Router>
                    <NavBar />
                    <Switch>
                        <Route path="/actors">
                            
                            <ActorsPage />
                        </Route>
                        <Route path="/films/:id">
                            <FilmDetail />
                        </Route>
                        <Route path="/films">
                            <FilmsPage />
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
                    
                    <a className="nav-link text-white" href="/actors">Actor</a>
                </li>
                <li className="nav-item">
                    
                    <a className="nav-link text-white" href="/films">Films</a>
                </li>
            </ul>
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById("react"))
