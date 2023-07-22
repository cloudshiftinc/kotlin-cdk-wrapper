@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignTimestreamConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.TimestreamConfigProperty.Builder =
      CfnCampaign.TimestreamConfigProperty.builder()

  /**
   * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution role that grants
   * AWS IoT FleetWise permission to deliver data to the Amazon Timestream table. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * @param timestreamTableArn The Amazon Resource Name (ARN) of the Amazon Timestream table. 
   */
  public fun timestreamTableArn(timestreamTableArn: String) {
    cdkBuilder.timestreamTableArn(timestreamTableArn)
  }

  public fun build(): CfnCampaign.TimestreamConfigProperty = cdkBuilder.build()
}
