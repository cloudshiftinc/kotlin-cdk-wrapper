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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationCloudWatchLoggingOption.Builder =
        CfnApplicationCloudWatchLoggingOption.Builder.create(scope, id)

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOption = cdkBuilder.build()
}
