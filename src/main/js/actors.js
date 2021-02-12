import React, { useState, useEffect } from "react"
import {getAllActors} from "./DVDRentalStoreAPI/storeAPI"
import {Page} from "./Page"

const root = "/api"

function ActorItem({item}) {
    const actorName = `${item["firstName"]} ${item["lastName"]}`
    return (
        <div className="card mb-3">
            <img className="actor-image" src="#" alt="actor image" />
            <div className="card-body">
                <h5 className="card-title">{actorName}</h5>
                <p className="card-text">Actor Info here</p>
                <a href="#" className="btn btn-primary">Go somewhere</a>
            </div>
        </div>
    )
}

function ActorsPage(){

    const handleError = (error) => {
        console.log(error)
    }

    return (
        <Page ItemComponent={ActorItem} fetchFunction={getAllActors} handleErrorFunction={handleError} />
    )
}

export default ActorsPage
