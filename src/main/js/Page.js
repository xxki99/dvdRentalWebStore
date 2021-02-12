import React, { useState, useEffect } from "react"

function Page({
    ItemComponent,
    fetchFunction,
    handleErrorFunction,
    nPage = 3,
}) {
    const [itemsData, setItemsData] = useState([])
    const [pageData, setPageData] = useState({})
    const [linkData, setLinkData] = useState({})

    const [size, setSize] = useState(20)
    const [page, setPage] = useState(1)
    useEffect(() => {
        fetchFunction(size, page)
            .then((data) => {
                setItemsData(data["data"])
                setPageData(data["page"])
                setLinkData(data["links"])
            })
            .catch((error) => {
                handleErrorFunction(error)
            })
    }, [size, page])

    const handleChangePage = (e) => {
        console.log("change page")
        setPage(e.target.value)
    }

    const itemList = (items) => {
        const list = items.map((item, index) => {
            return (
                <div className="col-3" key={index}>
                    <ItemComponent item={item} />
                </div>
            )
        })
        return <React.Fragment>{list}</React.Fragment>
    }

    const pageBar = () => {
        const lowerPage = pageData["number"] - nPage
        const startPage = lowerPage >= 1 ? lowerPage : 1
        const upperPage = pageData["number"] + nPage
        const endPage =
            upperPage <= pageData["totalPages"]
                ? upperPage
                : pageData["totalPages"]

        const pageButtons = Array.from(
            { length: endPage - startPage + 1 },
            (_, i) => startPage + i
        ).map((p, index) => {
            return (
                <li className="nav-item">
                    <button
                        className="btn btn-outline-light"
                        value={p}
                        key={index}
                        onClick={handleChangePage}
                    >
                        {p}
                    </button>
                </li>
            )
        })

        return (
            <React.Fragment>
                <nav className="navbar navbar-expand-lg navbar-dark bg-dark">{pageButtons}</nav>
            </React.Fragment>
        )
    }

    // render
    return (
        <div> 
            {/* items list */}
            <div className="container" style={{ width: "100%" }}>
                <div className="row">{itemList(itemsData)}</div>
            </div>

            {/* page nav bar */}
            <div>{pageBar()}</div>
        </div>
    )
}

export { Page }
