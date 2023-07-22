@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanNotificationTargetItemPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.NotificationTargetItemProperty.Builder =
      CfnResponsePlan.NotificationTargetItemProperty.builder()

  /**
   * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic.
   */
  public fun snsTopicArn(snsTopicArn: String) {
    cdkBuilder.snsTopicArn(snsTopicArn)
  }

  public fun build(): CfnResponsePlan.NotificationTargetItemProperty = cdkBuilder.build()
}
