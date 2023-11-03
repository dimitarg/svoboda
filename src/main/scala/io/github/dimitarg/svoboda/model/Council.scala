package io.github.dimitarg
package svoboda
package model

import java.time.LocalDate

import io.estatico.newtype.macros.newtype

final case class Council(
  id: Council.Id,
  from: LocalDate,
  to: Option[LocalDate],
  current: Boolean
)

object Council {
  @newtype final case class Id(value: Int)
}
