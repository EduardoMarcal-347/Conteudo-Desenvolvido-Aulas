import { useState } from "react"

export default function ShowName(){
    const [nome, setNome] = useState("");
    
    return(
        <div>
            <form>
                <label id="inputName">Nome: </label>
                <input type="text" onChange={e => setNome(e.target.value.toUpperCase())}/>
            </form>
            <p>{nome}</p>
            <hr />
        </div>
    )
}