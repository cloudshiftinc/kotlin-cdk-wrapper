@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class ScalableTargetPropsDsl {
  private val cdkBuilder: ScalableTargetProps.Builder = ScalableTargetProps.builder()

  /**
   * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
   * during a scaling activity. 
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
   * during a scaling activity. 
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  /**
   * @param resourceId The resource identifier to associate with this scalable target. 
   * This string consists of the resource type and unique identifier.
   *
   * Example value: `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param role Role that allows Application Auto Scaling to modify your scalable target.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param scalableDimension The scalable dimension that's associated with the scalable target. 
   * Specify the service namespace, resource type, and scaling property.
   *
   * Example value: `ecs:service:DesiredCount`
   */
  public fun scalableDimension(scalableDimension: String) {
    cdkBuilder.scalableDimension(scalableDimension)
  }

  /**
   * @param serviceNamespace The namespace of the AWS service that provides the resource or
   * custom-resource for a resource provided by your own application or service. 
   * For valid AWS service namespace values, see the RegisterScalableTarget
   * action in the Application Auto Scaling API Reference.
   */
  public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun build(): ScalableTargetProps = cdkBuilder.build()
}
