import { useState } from "react"

export default function Contador(props){
    const [contador, setContador] = useState(props.limiteMin);
    
    function incrementar() {
        if(contador < props.limiteMax) setContador(contador + 1);
    }

    function decrementar() {
        if(contador > props.limiteMin) setContador(contador - 1);
    }

    return(
        <div>
            <h2 style={{color:"red"}}>Intervalo (limite) do Contador: [{props.limiteMin},{props.limiteMax}]</h2>
            <h2>Valor Atual do Contador: {contador}</h2>
            <button onClick={decrementar}>-</button>
            <button onClick={incrementar}>+</button>
            <hr />
        </div>
    )

}

Contador.defaultProps = {
    limiteMin : 0,
    limiteMax: 10,
};