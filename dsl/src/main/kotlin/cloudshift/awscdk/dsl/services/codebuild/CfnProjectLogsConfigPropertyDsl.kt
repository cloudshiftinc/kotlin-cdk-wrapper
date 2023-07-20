@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

@CdkDslMarker
public class CfnProjectLogsConfigPropertyDsl {
    private val cdkBuilder: CfnProject.LogsConfigProperty.Builder =
        CfnProject.LogsConfigProperty.builder()

    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    public fun cloudWatchLogs(cloudWatchLogs: CfnProject.CloudWatchLogsConfigProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    public fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun s3Logs(s3Logs: CfnProject.S3LogsConfigProperty) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun build(): CfnProject.LogsConfigProperty = cdkBuilder.build()
}
