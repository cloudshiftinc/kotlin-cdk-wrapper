@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * Amazon Rekognition Video Stream Processor take as input a Kinesis video stream (Input) and a
 * Kinesis data stream (Output).
 *
 * This is the Amazon Kinesis Data Streams instance to which the Amazon Rekognition stream processor
 * streams the analysis results. This must be created within the constraints specified at
 * [KinesisDataStream](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_KinesisDataStream)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * KinesisDataStreamProperty kinesisDataStreamProperty = KinesisDataStreamProperty.builder()
 * .arn("arn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-kinesisdatastream.html)
 */
@CdkDslMarker
public class CfnStreamProcessorKinesisDataStreamPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.KinesisDataStreamProperty.Builder =
      CfnStreamProcessor.KinesisDataStreamProperty.builder()

  /**
   * @param arn ARN of the output Amazon Kinesis Data Streams stream. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnStreamProcessor.KinesisDataStreamProperty = cdkBuilder.build()
}
