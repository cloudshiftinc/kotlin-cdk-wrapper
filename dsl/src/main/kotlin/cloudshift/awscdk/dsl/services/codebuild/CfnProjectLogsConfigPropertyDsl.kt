@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `LogsConfig` is a property of the [AWS CodeBuild
 * Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that specifies information about logs for a build project. These can be logs in Amazon
 * CloudWatch Logs, built in a specified S3 bucket, or both.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * LogsConfigProperty logsConfigProperty = LogsConfigProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsConfigProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .groupName("groupName")
 * .streamName("streamName")
 * .build())
 * .s3Logs(S3LogsConfigProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .encryptionDisabled(false)
 * .location("location")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
 */
@CdkDslMarker
public class CfnProjectLogsConfigPropertyDsl {
    private val cdkBuilder: CfnProject.LogsConfigProperty.Builder =
        CfnProject.LogsConfigProperty.builder()

    /**
     * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
     * CloudWatch Logs are enabled by default.
     */
    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /**
     * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
     * CloudWatch Logs are enabled by default.
     */
    public fun cloudWatchLogs(cloudWatchLogs: CfnProject.CloudWatchLogsConfigProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    /**
     * @param s3Logs Information about logs built to an S3 bucket for a build project.
     * S3 logs are not enabled by default.
     */
    public fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs)
    }

    /**
     * @param s3Logs Information about logs built to an S3 bucket for a build project.
     * S3 logs are not enabled by default.
     */
    public fun s3Logs(s3Logs: CfnProject.S3LogsConfigProperty) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun build(): CfnProject.LogsConfigProperty = cdkBuilder.build()
}
