import TituloSection from "../TituloSection"
import AvaliacaoCliente from "./AvaliacaoCliente"

export default function Depoimentos(){
    return(
        <section>
            <TituloSection
            titulo = "Cliente Felizes. Novos Amigos :)"
            subtitulo = "DEPOIMENTOS DE ALGUNS CLIENTES REAIS"/>
            <div className="depoimentosCliente">
                <AvaliacaoCliente 
                foto = "foto01.jpg"
                nome = "Ana Brook"
                avaliacao01 = "Estou muito feliz..."
                avaliacao02 = "Me surpreendeu muito e recomendo a todos"/>
                <AvaliacaoCliente 
                foto = "foto03.jpg"
                nome = "Dani Shutz"
                avaliacao01 = "Foi uma satisfação tão grande..."
                avaliacao02 = "Adorei minha aquisição"/>
                <AvaliacaoCliente 
                foto = "foto05.jpg"
                nome = "Bia Wolf"
                avaliacao01 = "Não poderia ter uma compra tão incrivel..."
                avaliacao02 = "Amei!!!"/>
            </div>
        </section>
    )
}