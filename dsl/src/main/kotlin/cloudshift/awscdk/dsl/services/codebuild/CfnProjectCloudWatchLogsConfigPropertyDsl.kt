@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectCloudWatchLogsConfigPropertyDsl {
  private val cdkBuilder: CfnProject.CloudWatchLogsConfigProperty.Builder =
      CfnProject.CloudWatchLogsConfigProperty.builder()

  /**
   * @param groupName The group name of the logs in CloudWatch Logs.
   * For more information, see [Working with Log Groups and Log
   * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
   * .
   */
  public fun groupName(groupName: String) {
    cdkBuilder.groupName(groupName)
  }

  /**
   * @param status The current status of the logs in CloudWatch Logs for a build project. Valid
   * values are:. 
   * * `ENABLED` : CloudWatch Logs are enabled for this build project.
   * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param streamName The prefix of the stream name of the CloudWatch Logs.
   * For more information, see [Working with Log Groups and Log
   * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
   * .
   */
  public fun streamName(streamName: String) {
    cdkBuilder.streamName(streamName)
  }

  public fun build(): CfnProject.CloudWatchLogsConfigProperty = cdkBuilder.build()
}
