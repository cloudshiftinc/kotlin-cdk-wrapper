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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardClusterMarkerConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ClusterMarkerConfigurationProperty.Builder =
        CfnDashboard.ClusterMarkerConfigurationProperty.builder()

    public fun clusterMarker(clusterMarker: IResolvable) {
        cdkBuilder.clusterMarker(clusterMarker)
    }

    public fun clusterMarker(clusterMarker: CfnDashboard.ClusterMarkerProperty) {
        cdkBuilder.clusterMarker(clusterMarker)
    }

    public fun build(): CfnDashboard.ClusterMarkerConfigurationProperty = cdkBuilder.build()
}
