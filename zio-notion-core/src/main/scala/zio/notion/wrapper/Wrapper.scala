package zio.notion.wrapper

import zio._

sealed trait Wrapper[-R]

object Wrapper {

//  type NotionRequest = Request[Either[String, String], Any]
//
//  sealed trait SimpleWrapper[-R, E, A, Info] extends Wrapper[R] {
//    def wrap[R1 <: R](f: Info => ZIO[R1, E, A]): Info => ZIO[R1, E, A]
//  }
//
//  trait OverallWrapper[-R] extends SimpleWrapper[R, NotionError, NotionResponse, Request[Either[String, String], Any]]
//
//  def yodaWrapper: OverallWrapper[Console] =
//    new OverallWrapper[Console] {
//
//      override def wrap[R1 <: Console](
//          f: Request[Either[String, String], Any] => ZIO[R1, NotionError, NotionResponse]
//      ): Request[Either[String, String], Any] => ZIO[R1, NotionError, NotionResponse] =
//        (req: Request[Either[String, String], Any]) =>
//          for {
//            _ <- Console.printLine("yoda").orDie
//          } yield ()
//    }

}
