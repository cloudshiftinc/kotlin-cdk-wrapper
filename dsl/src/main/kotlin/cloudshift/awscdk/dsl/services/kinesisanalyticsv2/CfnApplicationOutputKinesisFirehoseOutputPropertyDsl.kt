@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

/**
 * For a SQL-based Kinesis Data Analytics application, when configuring application output,
 * identifies a Kinesis Data Firehose delivery stream as the destination.
 *
 * You provide the stream Amazon Resource Name (ARN) of the delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
 * KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputKinesisFirehoseOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder =
      CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

  /**
   * @param resourceArn The ARN of the destination delivery stream to write to. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationOutput.KinesisFirehoseOutputProperty = cdkBuilder.build()
}
