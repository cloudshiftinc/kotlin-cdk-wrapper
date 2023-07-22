@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Specifies whether the OpenSearch Service domain publishes application, search slow logs, or index
 * slow logs to Amazon CloudWatch.
 *
 * Each option must be an object of name `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
 * `INDEX_SLOW_LOGS` , or `AUDIT_LOGS` depending on the type of logs you want to publish. For the full
 * syntax, see the
 * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
 * .
 *
 * Before you enable log publishing, you need to create a CloudWatch log group and provide
 * OpenSearch Service the correct permissions to write to it. To learn more, see [Enabling log
 * publishing ( AWS
 * CloudFormation)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cfn)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
 * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html)
 */
@CdkDslMarker
public class CfnDomainLogPublishingOptionPropertyDsl {
  private val cdkBuilder: CfnDomain.LogPublishingOptionProperty.Builder =
      CfnDomain.LogPublishingOptionProperty.builder()

  /**
   * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
   * Required if you enable log publishing.
   */
  public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
    cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
  }

  /**
   * @param enabled If `true` , enables the publishing of logs to CloudWatch.
   * Default: `false` .
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled If `true` , enables the publishing of logs to CloudWatch.
   * Default: `false` .
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDomain.LogPublishingOptionProperty = cdkBuilder.build()
}
