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
public class CfnApplicationFlinkApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.FlinkApplicationConfigurationProperty.Builder =
        CfnApplication.FlinkApplicationConfigurationProperty.builder()

    public fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration)
    }

    public fun checkpointConfiguration(checkpointConfiguration: CfnApplication.CheckpointConfigurationProperty) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration)
    }

    public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    public fun monitoringConfiguration(monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    public fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    public fun parallelismConfiguration(parallelismConfiguration: CfnApplication.ParallelismConfigurationProperty) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    public fun build(): CfnApplication.FlinkApplicationConfigurationProperty = cdkBuilder.build()
}
