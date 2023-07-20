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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationMonitoringConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.MonitoringConfigurationProperty.Builder =
        CfnApplication.MonitoringConfigurationProperty.builder()

    public fun configurationType(configurationType: String) {
        cdkBuilder.configurationType(configurationType)
    }

    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun metricsLevel(metricsLevel: String) {
        cdkBuilder.metricsLevel(metricsLevel)
    }

    public fun build(): CfnApplication.MonitoringConfigurationProperty = cdkBuilder.build()
}
