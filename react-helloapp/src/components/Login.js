import { Component } from "react";

export default class Login extends Component{
    state ={username : '' , password : ''};

validate =() =>{
    if (this.state.username.length<4&& this.state.password.length<4)
    alert("invalid username/password");
    else if (this.state.username!=='duke' && this.state.password!=='java')
    alert ("invalid username/password");
    else 
    alert("login succesfully");

}


    render(){
        return (
            <div>
                <form onSubmit={this.validate}>
                    <label>username</label>
                    <input type="text" onChange={e=>this.setState({username: e.target.value})}/><br/>
                    <label>password</label>
                    <input type="password" onChange={e=>this.setState({password:e.target.value})}/><br/>
                    <button type="submit">Login</button>
                </form>
                <hr/>
                username:{this.state.username}<br/>
                password:{this.state.password}
            </div>

        );
    }
}