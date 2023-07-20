@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@CdkDslMarker
public class CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl {
  private val cdkBuilder:
      CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
      CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

  public fun deliveryStreamArn(deliveryStreamArn: String) {
    cdkBuilder.deliveryStreamArn(deliveryStreamArn)
  }

  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
      cdkBuilder.build()
}
