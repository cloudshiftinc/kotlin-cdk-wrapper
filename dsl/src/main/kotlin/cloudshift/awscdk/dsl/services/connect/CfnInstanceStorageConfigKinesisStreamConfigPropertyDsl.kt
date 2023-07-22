@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

/**
 * Configuration information of a Kinesis data stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * KinesisStreamConfigProperty kinesisStreamConfigProperty = KinesisStreamConfigProperty.builder()
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisstreamconfig.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.KinesisStreamConfigProperty.Builder =
      CfnInstanceStorageConfig.KinesisStreamConfigProperty.builder()

  /**
   * @param streamArn The Amazon Resource Name (ARN) of the data stream. 
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnInstanceStorageConfig.KinesisStreamConfigProperty = cdkBuilder.build()
}
