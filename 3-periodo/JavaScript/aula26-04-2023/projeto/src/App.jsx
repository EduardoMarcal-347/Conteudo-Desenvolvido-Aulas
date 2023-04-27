import Contador from "./components/Contador";
import PannelText from "./components/PannelText";
import ShowName from "./components/ShowName";

export default function App() {
  return (
    <div>
      <Contador 
        limiteMin={3} 
        limiteMax={7}/>
      <Contador/>
      <ShowName/>
      <PannelText/>
    </div>
  )
}


