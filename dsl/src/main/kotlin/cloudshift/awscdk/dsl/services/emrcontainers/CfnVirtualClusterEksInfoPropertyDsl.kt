@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

@CdkDslMarker
public class CfnVirtualClusterEksInfoPropertyDsl {
  private val cdkBuilder: CfnVirtualCluster.EksInfoProperty.Builder =
      CfnVirtualCluster.EksInfoProperty.builder()

  /**
   * @param namespace The namespaces of the EKS cluster. 
   * *Minimum* : 1
   *
   * *Maximum* : 63
   *
   * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  public fun build(): CfnVirtualCluster.EksInfoProperty = cdkBuilder.build()
}
