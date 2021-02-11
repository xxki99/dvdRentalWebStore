const root = "/api"

async function fetchData(url){
    try{
        const response = await fetch(url)
        if (response.ok){
            const data = await response.json()
            return data
        }
        else{
            const data = await response.json()
            throw data
        }
    }
    catch(error){
        throw error
    }
}



async function nav(url, searchPatten, qs=undefined){
    var tmpUrl = url
    for (let word of searchPatten) {
        const tmpData = await fetchData(tmpUrl)

        if ("_links" in tmpData){
            const tmpLinks = tmpData["_links"]
            if (word in tmpLinks){
                var nextUrl = tmpLinks[word]["href"]
                nextUrl = nextUrl.replace(/ *\{[^)]*\} */g, "")
                if (qs === undefined){
                    
                }
                else{
                    nextUrl = `${nextUrl}?`
                    for (let key in qs){
                        nextUrl = `${nextUrl}${key}=${qs[key]}&`
                    }
                }
                tmpUrl = nextUrl
            }
            else{
                throw new Error(`Not found: ${word}`)
            }
        }
        else{
            throw new Error(`Not found _links: ${word}`)
        }
    };

    console.log(tmpUrl)
    const returnValue = await fetchData(tmpUrl)
    return returnValue
    

}



export {nav}