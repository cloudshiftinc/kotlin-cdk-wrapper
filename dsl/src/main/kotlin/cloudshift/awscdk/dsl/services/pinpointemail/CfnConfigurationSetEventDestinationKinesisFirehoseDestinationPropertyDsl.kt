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

  /**
   * @param deliveryStreamArn The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose
   * stream that Amazon Pinpoint sends email events to. 
   */
  public fun deliveryStreamArn(deliveryStreamArn: String) {
    cdkBuilder.deliveryStreamArn(deliveryStreamArn)
  }

  /**
   * @param iamRoleArn The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when
   * sending email events to the Amazon Kinesis Data Firehose stream. 
   */
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
      cdkBuilder.build()
}
