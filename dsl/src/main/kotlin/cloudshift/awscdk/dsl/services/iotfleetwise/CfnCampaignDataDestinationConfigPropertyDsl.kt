@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignDataDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.DataDestinationConfigProperty.Builder =
      CfnCampaign.DataDestinationConfigProperty.builder()

  /**
   * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
   * data.
   */
  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
  }

  /**
   * @param s3Config (Optional) The Amazon S3 bucket where the AWS IoT FleetWise campaign sends
   * data.
   */
  public fun s3Config(s3Config: CfnCampaign.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

  /**
   * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends data.
   */
  public fun timestreamConfig(timestreamConfig: IResolvable) {
    cdkBuilder.timestreamConfig(timestreamConfig)
  }

  /**
   * @param timestreamConfig (Optional) The Amazon Timestream table where the campaign sends data.
   */
  public fun timestreamConfig(timestreamConfig: CfnCampaign.TimestreamConfigProperty) {
    cdkBuilder.timestreamConfig(timestreamConfig)
  }

  public fun build(): CfnCampaign.DataDestinationConfigProperty = cdkBuilder.build()
}
