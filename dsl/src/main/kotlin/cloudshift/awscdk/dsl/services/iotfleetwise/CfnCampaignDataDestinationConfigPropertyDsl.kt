@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignDataDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.DataDestinationConfigProperty.Builder =
      CfnCampaign.DataDestinationConfigProperty.builder()

  public fun s3Config(s3Config: IResolvable) {
    cdkBuilder.s3Config(s3Config)
  }

  public fun s3Config(s3Config: CfnCampaign.S3ConfigProperty) {
    cdkBuilder.s3Config(s3Config)
  }

  public fun timestreamConfig(timestreamConfig: IResolvable) {
    cdkBuilder.timestreamConfig(timestreamConfig)
  }

  public fun timestreamConfig(timestreamConfig: CfnCampaign.TimestreamConfigProperty) {
    cdkBuilder.timestreamConfig(timestreamConfig)
  }

  public fun build(): CfnCampaign.DataDestinationConfigProperty = cdkBuilder.build()
}
