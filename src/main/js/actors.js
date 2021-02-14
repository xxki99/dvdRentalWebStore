import React, { useState, useEffect } from "react"
import { getAllActors } from "./DVDRentalStoreAPI/storeAPI"
import { Page } from "./Page"

const root = "/api"

function ActorItem({ item }) {
    const actorName = `${item["firstName"]} ${item["lastName"]}`
    return (
        <div className="card mb-3 ">
            <img className="actor-image" src="https://cdn.pixabay.com/photo/2015/10/31/12/00/question-1015308_960_720.jpg" alt="actor image" />
            <div className="card-body">
                <div className="mb-3">
                    <h5 className="card-title hideOverflow">{actorName}</h5>
                </div>
                <div className="mb-3">
                    <p className="card-text hideOverflow mh-25">
                        {item["filmsSubsetTitle"].join(", ")}
                    </p>
                </div>
                <div className="d-flex justify-content-end">

                    <a href="#" className="btn btn-outline-light">Details</a>
                </div>
            </div>
        </div>
    )
}

function ActorsPage() {
    const handleError = (error) => {
        console.log(error)
    }

    return (
        <Page
            ItemComponent={ActorItem}
            fetchFunction={getAllActors}
            handleErrorFunction={handleError}
        />
    )
}

export default ActorsPage
