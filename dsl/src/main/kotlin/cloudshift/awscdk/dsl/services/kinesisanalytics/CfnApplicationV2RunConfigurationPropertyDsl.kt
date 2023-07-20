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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2RunConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.RunConfigurationProperty.Builder =
        CfnApplicationV2.RunConfigurationProperty.builder()

    public fun applicationRestoreConfiguration(applicationRestoreConfiguration: IResolvable) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    public fun applicationRestoreConfiguration(applicationRestoreConfiguration: CfnApplicationV2.ApplicationRestoreConfigurationProperty) {
        cdkBuilder.applicationRestoreConfiguration(applicationRestoreConfiguration)
    }

    public fun flinkRunConfiguration(flinkRunConfiguration: IResolvable) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    public fun flinkRunConfiguration(flinkRunConfiguration: CfnApplicationV2.FlinkRunConfigurationProperty) {
        cdkBuilder.flinkRunConfiguration(flinkRunConfiguration)
    }

    public fun build(): CfnApplicationV2.RunConfigurationProperty = cdkBuilder.build()
}
