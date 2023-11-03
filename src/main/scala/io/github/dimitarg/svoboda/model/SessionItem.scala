package io.github.dimitarg
package svoboda
package model

import io.estatico.newtype.macros.newtype

final case class SessionItem(id: SessionItem.Id, number: Int, displayName: String)

object SessionItem {
  @newtype final case class Id(value: String)
}