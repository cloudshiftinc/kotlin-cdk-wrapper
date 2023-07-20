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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationZeppelinApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ZeppelinApplicationConfigurationProperty.Builder =
        CfnApplication.ZeppelinApplicationConfigurationProperty.builder()

    private val _customArtifactsConfiguration: MutableList<Any> = mutableListOf()

    public fun catalogConfiguration(catalogConfiguration: IResolvable) {
        cdkBuilder.catalogConfiguration(catalogConfiguration)
    }

    public fun catalogConfiguration(catalogConfiguration: CfnApplication.CatalogConfigurationProperty) {
        cdkBuilder.catalogConfiguration(catalogConfiguration)
    }

    public fun customArtifactsConfiguration(vararg customArtifactsConfiguration: Any) {
        _customArtifactsConfiguration.addAll(listOf(*customArtifactsConfiguration))
    }

    public fun customArtifactsConfiguration(customArtifactsConfiguration: Collection<Any>) {
        _customArtifactsConfiguration.addAll(customArtifactsConfiguration)
    }

    public fun customArtifactsConfiguration(customArtifactsConfiguration: IResolvable) {
        cdkBuilder.customArtifactsConfiguration(customArtifactsConfiguration)
    }

    public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: IResolvable) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration)
    }

    public fun deployAsApplicationConfiguration(deployAsApplicationConfiguration: CfnApplication.DeployAsApplicationConfigurationProperty) {
        cdkBuilder.deployAsApplicationConfiguration(deployAsApplicationConfiguration)
    }

    public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    public fun monitoringConfiguration(monitoringConfiguration: CfnApplication.ZeppelinMonitoringConfigurationProperty) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    public fun build(): CfnApplication.ZeppelinApplicationConfigurationProperty {
        if (_customArtifactsConfiguration.isNotEmpty()) {
            cdkBuilder.customArtifactsConfiguration(_customArtifactsConfiguration)
        }
        return cdkBuilder.build()
    }
}
