@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Identifies a Kinesis data stream as the streaming source.
 *
 * You provide the stream's Amazon Resource Name (ARN).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * KinesisStreamsInputProperty kinesisStreamsInputProperty = KinesisStreamsInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisstreamsinput.html)
 */
@CdkDslMarker
public class CfnApplicationKinesisStreamsInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisStreamsInputProperty.Builder =
      CfnApplication.KinesisStreamsInputProperty.builder()

  /**
   * @param resourceArn The ARN of the input Kinesis data stream to read. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.KinesisStreamsInputProperty = cdkBuilder.build()
}
