@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

@CdkDslMarker
public class CfnVirtualClusterContainerInfoPropertyDsl {
  private val cdkBuilder: CfnVirtualCluster.ContainerInfoProperty.Builder =
      CfnVirtualCluster.ContainerInfoProperty.builder()

  public fun eksInfo(eksInfo: IResolvable) {
    cdkBuilder.eksInfo(eksInfo)
  }

  public fun eksInfo(eksInfo: CfnVirtualCluster.EksInfoProperty) {
    cdkBuilder.eksInfo(eksInfo)
  }

  public fun build(): CfnVirtualCluster.ContainerInfoProperty = cdkBuilder.build()
}
