@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer

@CdkDslMarker
public class CfnContainerContainerServiceDeploymentPropertyDsl {
  private val cdkBuilder: CfnContainer.ContainerServiceDeploymentProperty.Builder =
      CfnContainer.ContainerServiceDeploymentProperty.builder()

  private val _containers: MutableList<Any> = mutableListOf()

  public fun containers(vararg containers: Any) {
    _containers.addAll(listOf(*containers))
  }

  public fun containers(containers: Collection<Any>) {
    _containers.addAll(containers)
  }

  public fun containers(containers: IResolvable) {
    cdkBuilder.containers(containers)
  }

  public fun publicEndpoint(publicEndpoint: IResolvable) {
    cdkBuilder.publicEndpoint(publicEndpoint)
  }

  public fun publicEndpoint(publicEndpoint: CfnContainer.PublicEndpointProperty) {
    cdkBuilder.publicEndpoint(publicEndpoint)
  }

  public fun build(): CfnContainer.ContainerServiceDeploymentProperty {
    if(_containers.isNotEmpty()) cdkBuilder.containers(_containers)
    return cdkBuilder.build()
  }
}
