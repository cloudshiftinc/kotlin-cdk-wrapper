@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

@CdkDslMarker
public class CfnVirtualClusterContainerProviderPropertyDsl {
  private val cdkBuilder: CfnVirtualCluster.ContainerProviderProperty.Builder =
      CfnVirtualCluster.ContainerProviderProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun info(info: IResolvable) {
    cdkBuilder.info(info)
  }

  public fun info(info: CfnVirtualCluster.ContainerInfoProperty) {
    cdkBuilder.info(info)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnVirtualCluster.ContainerProviderProperty = cdkBuilder.build()
}
