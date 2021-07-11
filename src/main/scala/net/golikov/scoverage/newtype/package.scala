package net.golikov.scoverage

import io.estatico.newtype.macros.newtype

package object newtype {
    @newtype case class Word(s: String)
    case class Id(i: Int)
}
