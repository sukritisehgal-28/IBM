import {BrowserRouter as Router , Route,Link , Switch } from "react-router-dom"


export default function Routers(){
    return(
        <Router>
            <ul>
                <li><Link to="/home">HOME</Link></li>
                <li><Link to ="/about">About</Link></li>
                <li><Link to = "/dash">DashBoard</Link></li>
            </ul>
        </Router>
    );
}

function Home(){
    return (<h2>Home Component</h2>);
}

function About(){
    return (<h2>About us Component</h2>);
}

function DashBoard(){
    return (<h2>DashBoard Component</h2>)
}



