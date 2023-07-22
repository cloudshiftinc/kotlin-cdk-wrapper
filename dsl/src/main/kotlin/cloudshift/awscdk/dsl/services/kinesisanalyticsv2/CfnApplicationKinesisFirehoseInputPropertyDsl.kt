@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * For a SQL-based Kinesis Data Analytics application, identifies a Kinesis Data Firehose delivery
 * stream as the streaming source.
 *
 * You provide the delivery stream's Amazon Resource Name (ARN).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * KinesisFirehoseInputProperty kinesisFirehoseInputProperty =
 * KinesisFirehoseInputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-kinesisfirehoseinput.html)
 */
@CdkDslMarker
public class CfnApplicationKinesisFirehoseInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisFirehoseInputProperty.Builder =
      CfnApplication.KinesisFirehoseInputProperty.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.KinesisFirehoseInputProperty = cdkBuilder.build()
}
