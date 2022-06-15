package zio.notion

import zio._

trait Middleware[-R]

object Middleware {
  case class RequestMiddleware[R](observe: NotionRequest => URIO[R, Unit]) extends Middleware[R]
}
