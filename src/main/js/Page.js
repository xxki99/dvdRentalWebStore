import React, { useState, useEffect } from "react"


function Page({
    ItemComponent,
    fetchFunction,
    handleErrorFunction,
    nItemPerPage = 12, 
    nPage = 2,
}) {
    const [itemsData, setItemsData] = useState([])
    const [pageData, setPageData] = useState({})
    const [linkData, setLinkData] = useState({})

    const [size, setSize] = useState(nItemPerPage)
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
        e.target.blur()
        scroll(0, 0)
    }

    const itemList = (items) => {
        const list = items.map((item, index) => {
            return (
                <div className="col card-listItem" key={index}>
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
            upperPage <= lastPage - 1
                ? upperPage
                : lastPage - 1
        const loopArray = Array.from(
            { length: endPage - startPage + 1 },
            (_, i) => startPage + i
        )

        const pageButton = (p) => {
            const isDisabled =  (  p === pageData["number"])? "disabled" : " "
            return (
                    <button
                        className={`btn btn-outline-light me-1 btn-block ${isDisabled }`}
                        value={p}
                        onClick={handleChangePage}
                    >
                        {p + 1}
                    </button>
            )
        }

        const pageButtons = loopArray.map((p, index) => {
            return (
                <div key={index}>
                    {
                        pageButton(p)
                    }
                </div>
            )
        })

        const pageButtonNavBar = () => {
            return (
                <React.Fragment>
                    {
                        startPage !== 0 && 
                        <div className="d-flex">
                            {
                                pageButton(0)
                            }
                            <div className="ms-2 me-2">

                                <span className="text-light">
                                    ...
                                </span>
                            </div>
                        </div>
                    }
                    {
                        pageButtons
                    }
                    {
                        endPage !== (lastPage - 1) && 
                        <div className="d-flex">
                            <div className="ms-2 me-2">

                                <span className="text-light">
                                    ...
                                </span>
                            </div>
                            {
                                pageButton(lastPage - 1)
                            }
                        </div>
                    }
                </React.Fragment>

            )
        }

        return (
            <React.Fragment>
                <div className="d-flex justify-content-center">
                    {pageButtonNavBar()}
                </div>
            </React.Fragment>
        )
    }

    // render
    return (
        <div>
            {/* items list */}
            <div className="container" >
                <div className="row">{itemList(itemsData)}</div>
            </div>

            {/* page nav bar */}
            <div>{pageBar()}</div>
        </div>
    )
}

export { Page }
