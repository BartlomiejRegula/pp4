const getProducts = ()  => {
    return fetch("/api/products")
        .then(response => response.json());
}

const createProductHtmlEl = (productData) => {
    const template = `
    <div>
        <h4>${productData.name}</h4>
        <img src="https://picsum.photos/id/1/200/200" height=200 />
        <div>
            <span>${productData.price}</span>
            <button data-id="${productData.id}"> Add to cart</button>
        </div>
    <div>
    `;
    const htmlEl = document.createElement("Li");
    htmlEl.innerHTML = template.trim();
    return html;
}
document.addEventListener("DOMContentLoaded", () => {
    const productsListEl = document.querySelector('#productsList');

    getProducts()
        .then(productsAsJson => productsAsJson.map(createProductHtmlEl))
        .then(productsAsHtml => {
            productsAsHtml.forEach(el => productsListEl.appendChild(el))
        })
});