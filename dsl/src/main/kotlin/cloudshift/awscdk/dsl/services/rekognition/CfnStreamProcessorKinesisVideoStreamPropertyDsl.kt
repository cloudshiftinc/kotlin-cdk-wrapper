@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@CdkDslMarker
public class CfnStreamProcessorKinesisVideoStreamPropertyDsl {
  private val cdkBuilder: CfnStreamProcessor.KinesisVideoStreamProperty.Builder =
      CfnStreamProcessor.KinesisVideoStreamProperty.builder()

  /**
   * @param arn ARN of the Kinesis video stream stream that streams the source video. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnStreamProcessor.KinesisVideoStreamProperty = cdkBuilder.build()
}
