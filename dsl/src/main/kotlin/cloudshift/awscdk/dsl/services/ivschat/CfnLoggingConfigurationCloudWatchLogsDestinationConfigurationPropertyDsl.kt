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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.builder()

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty =
        cdkBuilder.build()
}
