import React, { useState, useEffect } from "react"
import { getAllActors } from "./DVDRentalStoreAPI/storeAPI"
import { Page } from "./Page"
import { PageItem } from "./PageItem"

function ActorItem({ item }) {
    const actorName = `${item["firstName"]} ${item["lastName"]}`
    return (
        <PageItem
            title={actorName}
            content={item["filmsSubsetTitle"].join(", ")}
            image="https://cdn.pixabay.com/photo/2015/10/31/12/00/question-1015308_960_720.jpg"
        />
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
