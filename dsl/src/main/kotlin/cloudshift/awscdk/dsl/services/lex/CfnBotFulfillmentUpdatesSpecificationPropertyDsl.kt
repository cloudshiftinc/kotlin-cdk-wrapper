@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotFulfillmentUpdatesSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.FulfillmentUpdatesSpecificationProperty.Builder =
      CfnBot.FulfillmentUpdatesSpecificationProperty.builder()

  /**
   * @param active Determines whether fulfillment updates are sent to the user. When this field is
   * true, updates are sent. 
   * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
   * `timeoutInSeconds` fields are required.
   */
  public fun active(active: Boolean) {
    cdkBuilder.active(active)
  }

  /**
   * @param active Determines whether fulfillment updates are sent to the user. When this field is
   * true, updates are sent. 
   * If the `active` field is set to true, the `startResponse` , `updateResponse` , and
   * `timeoutInSeconds` fields are required.
   */
  public fun active(active: IResolvable) {
    cdkBuilder.active(active)
  }

  /**
   * @param startResponse Provides configuration information for the message sent to users when the
   * fulfillment Lambda functions starts running.
   */
  public fun startResponse(startResponse: IResolvable) {
    cdkBuilder.startResponse(startResponse)
  }

  /**
   * @param startResponse Provides configuration information for the message sent to users when the
   * fulfillment Lambda functions starts running.
   */
  public fun startResponse(startResponse: CfnBot.FulfillmentStartResponseSpecificationProperty) {
    cdkBuilder.startResponse(startResponse)
  }

  /**
   * @param timeoutInSeconds The length of time that the fulfillment Lambda function should run
   * before it times out.
   */
  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  /**
   * @param updateResponse Provides configuration information for messages sent periodically to the
   * user while the fulfillment Lambda function is running.
   */
  public fun updateResponse(updateResponse: IResolvable) {
    cdkBuilder.updateResponse(updateResponse)
  }

  /**
   * @param updateResponse Provides configuration information for messages sent periodically to the
   * user while the fulfillment Lambda function is running.
   */
  public fun updateResponse(updateResponse: CfnBot.FulfillmentUpdateResponseSpecificationProperty) {
    cdkBuilder.updateResponse(updateResponse)
  }

  public fun build(): CfnBot.FulfillmentUpdatesSpecificationProperty = cdkBuilder.build()
}
