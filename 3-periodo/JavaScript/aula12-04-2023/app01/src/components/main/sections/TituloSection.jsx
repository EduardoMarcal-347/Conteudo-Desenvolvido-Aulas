export default function TituloSection(props){
    
    return (
        <div className="centralizar">
            <h2 style={{color:"darkorchid"}}>{props.titulo}</h2>
            <p>{props.subtitulo}</p>
        </div>
    )

}

