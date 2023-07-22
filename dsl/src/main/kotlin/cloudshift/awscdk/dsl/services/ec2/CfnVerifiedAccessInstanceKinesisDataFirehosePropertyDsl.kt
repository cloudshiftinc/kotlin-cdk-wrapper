@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

/**
 * Options for Kinesis as a logging destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * KinesisDataFirehoseProperty kinesisDataFirehoseProperty = KinesisDataFirehoseProperty.builder()
 * .deliveryStream("deliveryStream")
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessinstance-kinesisdatafirehose.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.Builder =
      CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.builder()

  /**
   * @param deliveryStream The ID of the delivery stream.
   */
  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  /**
   * @param enabled Indicates whether logging is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether logging is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty = cdkBuilder.build()
}
