@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@CdkDslMarker
public class CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl {
  private val cdkBuilder:
      CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
      CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

  /**
   * @param deliveryStreamArn The ARN of the Amazon Kinesis Firehose stream that email sending
   * events should be published to. 
   */
  public fun deliveryStreamArn(deliveryStreamArn: String) {
    cdkBuilder.deliveryStreamArn(deliveryStreamArn)
  }

  /**
   * @param iamRoleArn The ARN of the IAM role under which Amazon SES publishes email sending events
   * to the Amazon Kinesis Firehose stream. 
   */
  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
      cdkBuilder.build()
}
