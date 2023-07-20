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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionMonitoringResourcesPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder =
        CfnDataQualityJobDefinition.MonitoringResourcesProperty.builder()

    public fun clusterConfig(clusterConfig: IResolvable) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    public fun clusterConfig(clusterConfig: CfnDataQualityJobDefinition.ClusterConfigProperty) {
        cdkBuilder.clusterConfig(clusterConfig)
    }

    public fun build(): CfnDataQualityJobDefinition.MonitoringResourcesProperty = cdkBuilder.build()
}
