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
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.String

@CdkDslMarker
public class CfnProjectCloudWatchLogsConfigPropertyDsl {
    private val cdkBuilder: CfnProject.CloudWatchLogsConfigProperty.Builder =
        CfnProject.CloudWatchLogsConfigProperty.builder()

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnProject.CloudWatchLogsConfigProperty = cdkBuilder.build()
}
