'use strict';
var path = require('path');
var autoprefixer = require('autoprefixer');//自动修补css浏览器前缀

module.exports = {
	entry: [
		'./src/index.js'
	],
	output: {
		path: __dirname + '/build',
		filename: 'bundle.js',
	},
	module: {
		loaders:[
			{
				test: /\.css/, loader: 'style-loader!css-loader'
			},
			{
				test: /\.(js|jsx)$/,
				exclude: /node_modules/,
				loader: 'babel-loader', //更多配置在.babelrc
				query: {
					presets: ['es2015', 'react'],
					plugins: ['transform-runtime', ['import', {
						libraryName: 'antd',
						style: 'css'
					}]]
				}
			},
			{
				test: /\.(png|jpg)$/,
				loader: 'url-loader?limit=25000'
			},
			{
				test: /\.(woff|svg|eot|ttf|woff2)\??.*$/,
				loader: 'url-loader?limit=2000'
			},
			{
				test: /\.json$/,
				loader: "json-loader"
			}
		]
	},
	resolve: {
		extensions: ['.js','.jsx']
	},
	devServer: {
		port: 8080,
		contentBase: "./publish",//本地服务器所加载的页面所在的目录
		historyApiFallback: true,//不跳转
		inline: true//实时刷新
	}
};