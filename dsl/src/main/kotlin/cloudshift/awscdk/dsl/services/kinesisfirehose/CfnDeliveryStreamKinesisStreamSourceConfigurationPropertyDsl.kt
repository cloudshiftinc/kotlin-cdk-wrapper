@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `KinesisStreamSourceConfiguration` property type specifies the stream and role Amazon
 * Resource Names (ARNs) for a Kinesis stream used as the source for a delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * KinesisStreamSourceConfigurationProperty kinesisStreamSourceConfigurationProperty =
 * KinesisStreamSourceConfigurationProperty.builder()
 * .kinesisStreamArn("kinesisStreamArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-kinesisstreamsourceconfiguration.html)
 */
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
