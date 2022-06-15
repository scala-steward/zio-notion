package zio.notion

//trait Client[-R] { self =>
//  protected val sttpClient: SttpClient
//  protected val middlewares: Seq[Middleware[R]]
//
//  def @@[R2 <: R](middleware: Middleware[R2]): Client[R with R2] =
//    new Client[R with R2] {
//      override protected val sttpClient: SttpClient                        = self.sttpClient
//      override protected val middlewares: scala.Seq[Middleware[R with R2]] = self.middlewares :+ middleware
//    }
//
//  def handle(request: NotionRequest): IO[NotionError, NotionResponse] = {
//
//    val requestNotion =
//      sttpClient
//        .send(request)
//        .flatMap(response =>
//          response.code match {
//            case code if code.isSuccess => ZIO.succeed(response.body.merge)
//            case _ =>
//              val error =
//                decode[NotionClientError](response.body.merge) match {
//                  case Left(error)  => JsonError(error)
//                  case Right(error) => NotionError.HttpError(request.toCurl, error.status, error.code, error.message)
//                }
//
//              ZIO.fail(error)
//          }
//        )
//  }
//}
//
//object Client {
//
//  def default(sttpClient: SttpClient): Client[Any] =
//    new Client[Any] {
//      override protected val sttpClient: SttpClient   = sttpClient
//      protected val middlewares: Seq[Middleware[Any]] = Seq.empty
//    }
//}
