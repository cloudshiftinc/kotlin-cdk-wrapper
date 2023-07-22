@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

/**
 * Configuration information of a Kinesis Data Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * KinesisFirehoseConfigProperty kinesisFirehoseConfigProperty =
 * KinesisFirehoseConfigProperty.builder()
 * .firehoseArn("firehoseArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-kinesisfirehoseconfig.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl {
  private val cdkBuilder: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder =
      CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder()

  /**
   * @param firehoseArn The Amazon Resource Name (ARN) of the delivery stream. 
   */
  public fun firehoseArn(firehoseArn: String) {
    cdkBuilder.firehoseArn(firehoseArn)
  }

  public fun build(): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty = cdkBuilder.build()
}
