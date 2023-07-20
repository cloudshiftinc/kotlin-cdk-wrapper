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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationRunConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.RunConfigurationProperty.Builder =
        CfnApplication.RunConfigurationProperty.builder()

    public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    public fun applicationRestoreConfiguration(applicationRestoreConfiguration: CfnApplication.ApplicationRestoreConfigurationProperty) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    public fun flinkRunConfiguration(flinkRunConfiguration: CfnApplication.FlinkRunConfigurationProperty) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    public fun build(): CfnApplication.RunConfigurationProperty = cdkBuilder.build()
}
