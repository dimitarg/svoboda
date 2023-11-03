package io.github.dimitarg
package svoboda
package model

import io.estatico.newtype.macros.newtype

final case class Councilor(id: Councilor.Id, name: String, group: Group, contact: PersonContactDetails)

object Councilor {
  @newtype final case class Id(value: Int)
}