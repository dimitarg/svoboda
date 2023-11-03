package io.github.dimitarg
package svoboda
package model

import io.estatico.newtype.macros.newtype

final case class Group(id: Group.Id, name: String)

object Group {
  @newtype final case class Id(value: Int)
}