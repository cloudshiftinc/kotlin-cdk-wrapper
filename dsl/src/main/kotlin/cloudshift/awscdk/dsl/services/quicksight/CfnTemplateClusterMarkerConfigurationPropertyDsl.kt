@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The cluster marker configuration of the geospatial map selected point style.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ClusterMarkerConfigurationProperty clusterMarkerConfigurationProperty =
 * ClusterMarkerConfigurationProperty.builder()
 * .clusterMarker(ClusterMarkerProperty.builder()
 * .simpleClusterMarker(SimpleClusterMarkerProperty.builder()
 * .color("color")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-clustermarkerconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateClusterMarkerConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ClusterMarkerConfigurationProperty.Builder =
      CfnTemplate.ClusterMarkerConfigurationProperty.builder()

  /**
   * @param clusterMarker The cluster marker that is a part of the cluster marker configuration.
   */
  public fun clusterMarker(clusterMarker: IResolvable) {
    cdkBuilder.clusterMarker(clusterMarker)
  }

  /**
   * @param clusterMarker The cluster marker that is a part of the cluster marker configuration.
   */
  public fun clusterMarker(clusterMarker: CfnTemplate.ClusterMarkerProperty) {
    cdkBuilder.clusterMarker(clusterMarker)
  }

  public fun build(): CfnTemplate.ClusterMarkerConfigurationProperty = cdkBuilder.build()
}
