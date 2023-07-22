@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamKinesisStreamSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.Builder =
      CfnDeliveryStream.KinesisStreamSourceConfigurationProperty.builder()

  /**
   * @param kinesisStreamArn The ARN of the source Kinesis data stream. 
   */
  public fun kinesisStreamArn(kinesisStreamArn: String) {
    cdkBuilder.kinesisStreamArn(kinesisStreamArn)
  }

  /**
   * @param roleArn The ARN of the role that provides access to the source Kinesis data stream. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDeliveryStream.KinesisStreamSourceConfigurationProperty =
      cdkBuilder.build()
}
