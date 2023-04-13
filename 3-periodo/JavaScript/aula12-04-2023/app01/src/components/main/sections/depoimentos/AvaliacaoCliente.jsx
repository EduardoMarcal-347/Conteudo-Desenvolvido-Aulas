export default function AvaliacaoCliente(props){
    return(
        <div className="avaliacaoCliente">
        {/* <img src="" alt="" /> */}
        <p>{props.nome}</p>
        <p>{props.avaliacao01}</p>
        <p>{props.avaliacao02}</p>
        </div>
    )
}