import TituloSection from "../TituloSection"
import AvaliacaoCliente from "./AvaliacaoCliente"

export default function Depoimentos(){

    let avaliacoes = [
        {
            foto:"foto01.jpg",
            nome :"Ana Brook",
            avaliacao01:"Estou muito feliz...",
            avaliacao02:"Me surpreendeu muito e recomendo a todos"
        },
        {
            foto:"foto03.jpg",
            nome:"Dani Shutz",
            avaliacao01:"Foi uma satisfação tão grande...",
            avaliacao02:"Adorei minha aquisição"
        },
        {
            foto:"foto05.jpg",
            nome:"Bia Wolf",
            avaliacao01:"Não poderia ter uma compra tão incrivel...",
            avaliacao02:"Amei!!!"
        }
    ]
    
    function showAvaliacoes(){
        return avaliacoes.map(e => 
            <AvaliacaoCliente 
                    foto = {avaliacoes[e].foto}
                    nome = {avaliacoes[e].nome}
                    avaliacao01 = {avaliacoes[e].avaliacao01}
                    avaliacao02 = {avaliacoes[e].avaliacao02}/>)
    }

    return(
        <section>
            <TituloSection
            titulo = "Cliente Felizes. Novos Amigos :)"
            subtitulo = "DEPOIMENTOS DE ALGUNS CLIENTES REAIS"/>
            <div className="depoimentosCliente">
                {showAvaliacoes()}
            </div>
        </section>
    )
}