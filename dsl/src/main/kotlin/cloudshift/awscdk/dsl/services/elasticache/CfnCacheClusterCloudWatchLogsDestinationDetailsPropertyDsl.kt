@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

/**
 * Configuration details of a CloudWatch Logs destination.
 *
 * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
 * destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CloudWatchLogsDestinationDetailsProperty cloudWatchLogsDestinationDetailsProperty =
 * CloudWatchLogsDestinationDetailsProperty.builder()
 * .logGroup("logGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-cloudwatchlogsdestinationdetails.html)
 */
@CdkDslMarker
public class CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder =
      CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.builder()

  /**
   * @param logGroup The name of the CloudWatch Logs log group. 
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty = cdkBuilder.build()
}
