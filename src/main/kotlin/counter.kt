import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

val Counter = functionalComponent<RProps> {
    val (count, setCount) = useState(0)
    div {
        div {
            +count.toString()
        }
        button {
            attrs.onClickFunction = { setCount(count + 1) }
            +"+"
        }
        button {
            attrs.onClickFunction = { setCount(count - 1) }
            +"-"
        }
    }
}
