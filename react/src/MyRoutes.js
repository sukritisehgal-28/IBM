import React from "react";
import { BrowserRouter as Router,Routes,Route } from "react-router-dom";
import Login from "./components/login";

import Dashboard from "./components/dashboard";
import Register from "./components/register";

const MyRoutes = (props)=>(
    <Router{...props}>
    <Routes>
        <Route exact path ="/" elemement={<Login/>}/>
        <Route path="/login" element={<Login/>}/>
        <Route path="/register" element={<Register/>}/>
        <Route path="/dash" element={<Dashboard/>}/>
    </Routes>
    </Router>
)
export default MyRoutes;