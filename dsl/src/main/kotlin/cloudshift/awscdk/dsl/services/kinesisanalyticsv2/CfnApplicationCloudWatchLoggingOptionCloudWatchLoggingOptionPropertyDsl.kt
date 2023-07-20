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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import kotlin.String

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl {
    private val cdkBuilder:
        CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder =
        CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.builder()

    public fun logStreamArn(logStreamArn: String) {
        cdkBuilder.logStreamArn(logStreamArn)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty =
        cdkBuilder.build()
}
