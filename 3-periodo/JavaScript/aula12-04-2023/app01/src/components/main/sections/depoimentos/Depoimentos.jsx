import TituloSection from "../TituloSection"
import AvaliacaoCliente from "./AvaliacaoCliente"

export default function Depoimentos(){
    return(
        <section>
            <TituloSection
            titulo = "Cliente Felizes. Novos Amigos :)"
            subtitulo = "DEPOIMENTOS DE ALGUNS CLIENTES REAIS"/>
            <div className="depoimentosCliente">
                <AvaliacaoCliente nome = "Ana Brook"
                avaliacao01 = "Estou muito feliz..."
                avaliacao02 = "Me surpreendeu muito e recomendo a todos"/>
                <AvaliacaoCliente nome = "Dani Shutz"
                avaliacao01 = "Foi uma satisfação tão grande..."
                avaliacao02 = "Adorei minha aquisição"/>
                <AvaliacaoCliente nome = "Bia Wolf"
                avaliacao01 = "Não poderia ter uma compra tão incrivel..."
                avaliacao02 = "Amei!!!"/>
            </div>
        </section>
    )
}