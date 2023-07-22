@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterLoggingPropertyDsl {
  private val cdkBuilder: CfnCluster.LoggingProperty.Builder = CfnCluster.LoggingProperty.builder()

  /**
   * @param clusterLogging The cluster control plane logging configuration for your cluster.
   */
  public fun clusterLogging(clusterLogging: IResolvable) {
    cdkBuilder.clusterLogging(clusterLogging)
  }

  /**
   * @param clusterLogging The cluster control plane logging configuration for your cluster.
   */
  public fun clusterLogging(clusterLogging: CfnCluster.ClusterLoggingProperty) {
    cdkBuilder.clusterLogging(clusterLogging)
  }

  public fun build(): CfnCluster.LoggingProperty = cdkBuilder.build()
}
