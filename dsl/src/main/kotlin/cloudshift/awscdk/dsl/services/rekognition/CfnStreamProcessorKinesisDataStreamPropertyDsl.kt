@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

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
