@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationKinesisFirehoseInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisFirehoseInputProperty.Builder =
      CfnApplication.KinesisFirehoseInputProperty.builder()

  /**
   * @param resourceArn ARN of the input delivery stream. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
   * stream on your behalf. 
   * You need to make sure that the role has the necessary permissions to access the stream.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplication.KinesisFirehoseInputProperty = cdkBuilder.build()
}
