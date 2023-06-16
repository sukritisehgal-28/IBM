import {Component, ReactNode} from "react";

export default class Toggle extends Component{
    state=  {toggle : true };

handleEvent=()=>{
    this.setState(state=>({toggle: !state.toggle}));

}

render(): ReactNode {
    return (
        <button Toggle=!this.state>
    );
}




}