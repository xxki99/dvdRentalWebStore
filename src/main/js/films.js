import React, { useState, useEffect } from "react"
import { Page } from "./Page"
import { PageItem } from "./PageItem"
import { getAllFilms, getFilmDetail } from "./DVDRentalStoreAPI/storeAPI"
import { useParams } from "react-router-dom"

function FilmsItem({ item }) {
    const handleClick = () => {
        console.log(item["title"])
    }
    return (
        <PageItem
            title={item.title}
            content={item["filmsActorsName"].join(", ")}
            onClick={handleClick}
            image="https://cdn.pixabay.com/photo/2017/06/08/17/32/not-found-2384304_960_720.jpg"
        />
    )
}

function FilmDetail() {
    let {id} = useParams()
    const [filmDetailData, setFilmDetailData] = useState()
    useEffect(() => {
        getFilmDetail(id)
            .then((data) => {
                setFilmDetailData(data)
            })
            .catch((error) => {
                console.log(error)
            })
    }, [id])

    return (
        <div>
            {id}
        </div>
    )
}

function FilmsPage() {
    const handleError = (error) => {
        console.log(error)
    }
    return (
        <div>
            <Page
                ItemComponent={FilmsItem}
                fetchFunction={getAllFilms}
                handleErrorFunction={handleError}
            />
        </div>
    )
}

export { FilmsPage, FilmDetail }
