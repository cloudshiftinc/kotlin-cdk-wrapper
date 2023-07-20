@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ScalableTaskCountPropsDsl {
  private val cdkBuilder: ScalableTaskCountProps.Builder = ScalableTaskCountProps.builder()

  public fun dimension(dimension: String) {
    cdkBuilder.dimension(dimension)
  }

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun build(): ScalableTaskCountProps = cdkBuilder.build()
}
