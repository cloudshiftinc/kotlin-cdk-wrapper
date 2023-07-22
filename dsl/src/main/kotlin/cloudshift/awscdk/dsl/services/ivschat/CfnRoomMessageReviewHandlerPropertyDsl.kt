@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnRoom

@CdkDslMarker
public class CfnRoomMessageReviewHandlerPropertyDsl {
  private val cdkBuilder: CfnRoom.MessageReviewHandlerProperty.Builder =
      CfnRoom.MessageReviewHandlerProperty.builder()

  /**
   * @param fallbackResult Specifies the fallback behavior (whether the message is allowed or
   * denied) if the handler does not return a valid response, encounters an error, or times out.
   * (For the timeout period, see [Service
   * Quotas](https://docs.aws.amazon.com/ivs/latest/userguide/service-quotas.html) .) If allowed, the
   * message is delivered with returned content to all users connected to the room. If denied, the
   * message is not delivered to any user.
   *
   * *Default* : `ALLOW`
   */
  public fun fallbackResult(fallbackResult: String) {
    cdkBuilder.fallbackResult(fallbackResult)
  }

  /**
   * @param uri Identifier of the message review handler.
   * Currently this must be an ARN of a lambda function.
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnRoom.MessageReviewHandlerProperty = cdkBuilder.build()
}
