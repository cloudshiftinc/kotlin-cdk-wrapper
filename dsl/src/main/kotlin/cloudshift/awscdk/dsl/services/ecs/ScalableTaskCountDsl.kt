@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.ecs.ScalableTaskCount
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class ScalableTaskCountDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ScalableTaskCount.Builder = ScalableTaskCount.Builder.create(scope, id)

  /**
   * Scalable dimension of the attribute.
   *
   * @param dimension Scalable dimension of the attribute. 
   */
  public fun dimension(dimension: String) {
    cdkBuilder.dimension(dimension)
  }

  /**
   * Maximum capacity to scale to.
   *
   * @param maxCapacity Maximum capacity to scale to. 
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * Minimum capacity to scale to.
   *
   * Default: 1
   *
   * @param minCapacity Minimum capacity to scale to. 
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * Resource ID of the attribute.
   *
   * @param resourceId Resource ID of the attribute. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * Role to use for scaling.
   *
   * @param role Role to use for scaling. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * Service namespace of the scalable attribute.
   *
   * @param serviceNamespace Service namespace of the scalable attribute. 
   */
  public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun build(): ScalableTaskCount = cdkBuilder.build()
}
