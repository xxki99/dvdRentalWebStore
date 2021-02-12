import {nav} from "./hal"

const root = "/api"


async function getAllActors(size, page)  {

    return await nav(root, ["actors"], {size: size, page: page})

}

export {getAllActors}
