import { useState } from "react"

export default function PannelText(props){

    const [text, setText] = useState("")
    const [countCar, setCountCar] = useState (props.max)

    return(
        <div>
            <p>Mensagem:</p>
            <textarea name="" id="" cols="70" rows="15" maxLength={props.max} onChange={e => setCountCar(props.max - e.target.value.length)}></textarea>
            <p>Restante: {countCar} caracteres</p>
        </div>
    )

}

PannelText.defaultProps = {
    max: 100
}