@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
