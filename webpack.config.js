var path = require("path")

module.exports = {
    entry: "./src/main/js/app.js",
    devtool: "source-map",
    cache: true,
    mode: "development",
    output: {
        path: __dirname,
        filename: "./src/main/resources/static/built/bundle.js",
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, "."),
                exclude: /(node_modules)/,

                loader: "babel-loader",
                options: {
                    presets: ["@babel/preset-env", "@babel/preset-react"],
                    plugins: ["@babel/transform-runtime"],
                },
            },
        ],
    },
}
