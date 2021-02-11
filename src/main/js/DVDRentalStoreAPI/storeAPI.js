import {nav} from "./hal"

const root = "/api"


function getAllActors(size)  {
    
    nav(root, ["actors"], {size: size})
        .then((data) => {
            console.log(data)
        })
        .catch((error) => {
            console.log(error)
        })
    
}

export {getAllActors}
