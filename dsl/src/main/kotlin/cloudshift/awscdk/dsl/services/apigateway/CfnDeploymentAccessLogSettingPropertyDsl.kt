@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDeployment

@CdkDslMarker
public class CfnDeploymentAccessLogSettingPropertyDsl {
  private val cdkBuilder: CfnDeployment.AccessLogSettingProperty.Builder =
      CfnDeployment.AccessLogSettingProperty.builder()

  /**
   * @param destinationArn The Amazon Resource Name (ARN) of the CloudWatch Logs log group or
   * Kinesis Data Firehose delivery stream to receive access logs.
   * If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with
   * `amazon-apigateway-` .
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  /**
   * @param format A single line format of the access logs of data, as specified by selected
   * $context variables.
   * The format must include at least `$context.requestId` .
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun build(): CfnDeployment.AccessLogSettingProperty = cdkBuilder.build()
}
