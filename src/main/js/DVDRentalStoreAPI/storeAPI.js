import {nav} from "./hal"

const root = "/api"


async function getAllActors(size, page)  {

    return await nav(root, ["actors"], {size: size, page: page})

}

async function getAllFilms(size, page){
    return await nav(root, ["films"], {size: size, page:page})
}

async function getFilmDetail(id){
    return await nav(root, ["films"], id=id) 
}

export {getAllActors, getAllFilms, getFilmDetail}
