@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

/**
 * When you configure a SQL-based Kinesis Data Analytics application's output, identifies a Kinesis
 * data stream as the destination.
 *
 * You provide the stream Amazon Resource Name (ARN).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
 * KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder =
      CfnApplicationOutputV2.KinesisStreamsOutputProperty.builder()

  /**
   * @param resourceArn The ARN of the destination Kinesis data stream to write to. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationOutputV2.KinesisStreamsOutputProperty = cdkBuilder.build()
}
