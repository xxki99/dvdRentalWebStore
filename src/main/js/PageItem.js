import React, { useState, useEffect } from "react"

function PageItem({ title, content, action, image, onClick }) {
    return (
        <div className="card mb-3 cardButton" onClick={onClick}>
            <img className="card-image" src={image} alt="card image" />
            <div className="card-body">
                <div className="mb-3">
                    <h5 className="card-title hideOverflow">{title}</h5>
                </div>
                <div className="mb-3">
                    <p className="card-text hideOverflow mh-25">
                        {content}
                    </p>
                </div>
                {
                    (action !== undefined )&& 
                    
                        <div className="d-flex justify-content-end">
                            {action}
                        </div>
                    }
            </div>
        </div>
    )
}

export {PageItem}