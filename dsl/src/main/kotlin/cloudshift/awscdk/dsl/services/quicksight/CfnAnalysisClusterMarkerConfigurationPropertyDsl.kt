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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisClusterMarkerConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ClusterMarkerConfigurationProperty.Builder =
        CfnAnalysis.ClusterMarkerConfigurationProperty.builder()

    public fun clusterMarker(clusterMarker: IResolvable) {
        cdkBuilder.clusterMarker(clusterMarker)
    }

    public fun clusterMarker(clusterMarker: CfnAnalysis.ClusterMarkerProperty) {
        cdkBuilder.clusterMarker(clusterMarker)
    }

    public fun build(): CfnAnalysis.ClusterMarkerConfigurationProperty = cdkBuilder.build()
}
