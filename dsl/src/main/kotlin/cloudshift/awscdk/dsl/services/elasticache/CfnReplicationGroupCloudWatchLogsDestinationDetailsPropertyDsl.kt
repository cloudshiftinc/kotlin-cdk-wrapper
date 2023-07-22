@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

/**
 * The configuration details of the CloudWatch Logs destination.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-cloudwatchlogsdestinationdetails.html)
 */
@CdkDslMarker
public class CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder =
      CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

  /**
   * @param logGroup The name of the CloudWatch Logs log group. 
   */
  public fun logGroup(logGroup: String) {
    cdkBuilder.logGroup(logGroup)
  }

  public fun build(): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
      cdkBuilder.build()
}
