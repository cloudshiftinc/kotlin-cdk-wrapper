@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

/**
 * The Amazon Timestream table where the AWS IoT FleetWise campaign sends data.
 *
 * Timestream stores and organizes data to optimize query processing time and to reduce storage
 * costs. For more information, see [Data
 * modeling](https://docs.aws.amazon.com/timestream/latest/developerguide/data-modeling.html) in the
 * *Amazon Timestream Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * TimestreamConfigProperty timestreamConfigProperty = TimestreamConfigProperty.builder()
 * .executionRoleArn("executionRoleArn")
 * .timestreamTableArn("timestreamTableArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-timestreamconfig.html)
 */
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
