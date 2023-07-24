@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-clustermarker.html)
 */
@CdkDslMarker
public class CfnTemplateClusterMarkerPropertyDsl {
    private val cdkBuilder: CfnTemplate.ClusterMarkerProperty.Builder =
        CfnTemplate.ClusterMarkerProperty.builder()

    /**
     * @param simpleClusterMarker The simple cluster marker of the cluster marker.
     */
    public fun simpleClusterMarker(simpleClusterMarker: IResolvable) {
        cdkBuilder.simpleClusterMarker(simpleClusterMarker)
    }

    /**
     * @param simpleClusterMarker The simple cluster marker of the cluster marker.
     */
    public fun simpleClusterMarker(simpleClusterMarker: CfnTemplate.SimpleClusterMarkerProperty) {
        cdkBuilder.simpleClusterMarker(simpleClusterMarker)
    }

    public fun build(): CfnTemplate.ClusterMarkerProperty = cdkBuilder.build()
}
