import React, { useState, useEffect } from "react"
import {getAllActors} from "./DVDRentalStoreAPI/storeAPI"

const root = "/api"

function ActorItem(actorInfo) {
    return <div>actorItem</div>
}

function Actor() {
    const defaultActorsData = []
    const [actorsData, setActorsData] = useState(defaultActorsData)

    const [page, setPage] = useState(1)
    useEffect(() => {
        
        getAllActors(5)
            
            
        
    }, [page])

    return (
        <div>
            Actor
        </div>
    )
}

export default Actor
