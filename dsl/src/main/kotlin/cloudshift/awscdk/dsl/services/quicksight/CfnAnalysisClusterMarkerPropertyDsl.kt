@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The cluster marker that is a part of the cluster marker configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ClusterMarkerProperty clusterMarkerProperty = ClusterMarkerProperty.builder()
 * .simpleClusterMarker(SimpleClusterMarkerProperty.builder()
 * .color("color")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-clustermarker.html)
 */
@CdkDslMarker
public class CfnAnalysisClusterMarkerPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ClusterMarkerProperty.Builder =
        CfnAnalysis.ClusterMarkerProperty.builder()

    /**
     * @param simpleClusterMarker The simple cluster marker of the cluster marker.
     */
    public fun simpleClusterMarker(simpleClusterMarker: IResolvable) {
        cdkBuilder.simpleClusterMarker(simpleClusterMarker)
    }

    /**
     * @param simpleClusterMarker The simple cluster marker of the cluster marker.
     */
    public fun simpleClusterMarker(simpleClusterMarker: CfnAnalysis.SimpleClusterMarkerProperty) {
        cdkBuilder.simpleClusterMarker(simpleClusterMarker)
    }

    public fun build(): CfnAnalysis.ClusterMarkerProperty = cdkBuilder.build()
}
