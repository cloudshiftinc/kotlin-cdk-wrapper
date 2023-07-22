@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Details on SNS that are required to send the notification.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * SnsConfigurationProperty snsConfigurationProperty = SnsConfigurationProperty.builder()
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-snsconfiguration.html)
 */
@CdkDslMarker
public class CfnScheduledQuerySnsConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.SnsConfigurationProperty.Builder =
      CfnScheduledQuery.SnsConfigurationProperty.builder()

  /**
   * @param topicArn SNS topic ARN that the scheduled query status notifications will be sent to. 
   */
  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnScheduledQuery.SnsConfigurationProperty = cdkBuilder.build()
}
