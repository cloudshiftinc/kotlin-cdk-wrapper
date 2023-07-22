@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputKinesisFirehoseOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder =
      CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

  /**
   * @param resourceArn ARN of the destination Amazon Kinesis Firehose delivery stream to write to. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
   * destination stream on your behalf. 
   * You need to grant the necessary permissions to this role.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplicationOutput.KinesisFirehoseOutputProperty = cdkBuilder.build()
}
