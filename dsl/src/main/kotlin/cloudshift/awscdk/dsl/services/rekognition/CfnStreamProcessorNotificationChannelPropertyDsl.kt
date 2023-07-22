@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorNotificationChannelPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.NotificationChannelProperty.Builder =
      CfnStreamProcessor.NotificationChannelProperty.builder()

  /**
   * @param arn The ARN of the SNS topic that receives notifications. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnStreamProcessor.NotificationChannelProperty = cdkBuilder.build()
}
