package zio

import sttp.client3.Request

package object notion {
  type NotionRequest = Request[Either[String, String], Any]
}
