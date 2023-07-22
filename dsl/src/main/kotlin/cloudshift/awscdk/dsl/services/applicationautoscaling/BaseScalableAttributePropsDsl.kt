@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.BaseScalableAttributeProps
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class BaseScalableAttributePropsDsl {
  private val cdkBuilder: BaseScalableAttributeProps.Builder = BaseScalableAttributeProps.builder()

  /**
   * @param dimension Scalable dimension of the attribute. 
   */
  public fun dimension(dimension: String) {
    cdkBuilder.dimension(dimension)
  }

  /**
   * @param maxCapacity Maximum capacity to scale to. 
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity Minimum capacity to scale to.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * @param resourceId Resource ID of the attribute. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param role Role to use for scaling. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param serviceNamespace Service namespace of the scalable attribute. 
   */
  public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun build(): BaseScalableAttributeProps = cdkBuilder.build()
}
