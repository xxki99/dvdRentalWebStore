import React, { useState, useEffect } from "react"

function Page({
    ItemComponent,
    fetchFunction,
    handleErrorFunction,
    nPage = 2,
}) {
    const [itemsData, setItemsData] = useState([])
    const [pageData, setPageData] = useState({})
    const [linkData, setLinkData] = useState({})

    const [size, setSize] = useState(10)
    const [page, setPage] = useState(0)
    useEffect(() => {
        fetchIPageData()
    }, [size, page])

    

    const fetchIPageData = () => {
        fetchFunction(size, page).then((data) => {
            setItemsData(data["data"])
            setPageData(data["page"])
            setLinkData(data["links"])
        })
    }

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
        const startPage = lowerPage >= 0 ? lowerPage : 0
        const upperPage = pageData["number"] + nPage
        const lastPage = pageData["totalPages"]
        const endPage =
            upperPage <= pageData["totalPages"] - 1
                ? upperPage
                : pageData["totalPages"] - 1
        const loopArray = Array.from(
            { length: endPage - startPage + 1 },
            (_, i) => startPage + i
        )


        const pageButtons = loopArray.map((p, index) => {
            return (
                <li className="nav-item">
                    <button
                        className="btn btn-outline-light"
                        value={p}
                        key={index}
                        onClick={handleChangePage}
                    >
                        {p + 1}
                    </button>
                </li>
            )
        })


        return (
            <React.Fragment>
                <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                    {pageButtons}
                </nav>
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
