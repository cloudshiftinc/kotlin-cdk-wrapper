@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignTimestreamConfigPropertyDsl {
  private val cdkBuilder: CfnCampaign.TimestreamConfigProperty.Builder =
      CfnCampaign.TimestreamConfigProperty.builder()

  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  public fun timestreamTableArn(timestreamTableArn: String) {
    cdkBuilder.timestreamTableArn(timestreamTableArn)
  }

  public fun build(): CfnCampaign.TimestreamConfigProperty = cdkBuilder.build()
}
