package io.github.dimitarg
package svoboda
package model

import io.estatico.newtype.macros.newtype
import java.time.LocalDateTime

final case class Session(
  id: Session.Id, kind: SessionKind, displayName: String,
  start: LocalDateTime, end: Option[LocalDateTime],
  items: List[SessionItem])

object Session {
  @newtype final case class Id(value: String)
}

sealed trait SessionKind

object SessionKind {
  final case object Ordinary extends SessionKind
  final case object Special extends SessionKind
}