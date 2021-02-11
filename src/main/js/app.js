const React = require("react")
const ReactDOM = require("react-dom")
import {useState, useEffect} from "react"

function App(){
    const defaultActorsData = [
        {first_name: "", last_name: "", }
    ]
    const [actorsData, setActorsData] = useState(defaultActorsData)
    useEffect(() => {
        fetch("api/actorEntities", {
            method: "GET", 
        })
            .then((response) => {
                if (response.ok){
                    response.json()
                        .then((data) => {
                            setActorsData(data)
                        })
                }
            })
    }, [])

    return (
        <div>
            Hello World!
        </div>
    )
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)
