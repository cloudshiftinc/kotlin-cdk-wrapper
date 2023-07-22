@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubectlProviderProps

/**
 * Properties for a KubectlProvider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * Cluster cluster;
 * KubectlProviderProps kubectlProviderProps = KubectlProviderProps.builder()
 * .cluster(cluster)
 * .build();
 * ```
 */
@CdkDslMarker
public class KubectlProviderPropsDsl {
  private val cdkBuilder: KubectlProviderProps.Builder = KubectlProviderProps.builder()

  /**
   * @param cluster The cluster to control. 
   */
  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun build(): KubectlProviderProps = cdkBuilder.build()
}
