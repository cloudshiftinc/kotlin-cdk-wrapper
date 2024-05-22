@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a scalable target.
 *
 * Example:
 *
 * ```
 * ScalableTarget shardsScalableTarget = ScalableTarget.Builder.create(this,
 * "ElastiCacheRedisShardsScalableTarget")
 * .serviceNamespace(ServiceNamespace.ELASTICACHE)
 * .scalableDimension("elasticache:replication-group:NodeGroups")
 * .minCapacity(2)
 * .maxCapacity(10)
 * .resourceId("replication-group/main-cluster")
 * .build();
 * shardsScalableTarget.scaleToTrackMetric("ElastiCacheRedisShardsCPUUtilization",
 * BasicTargetTrackingScalingPolicyProps.builder()
 * .targetValue(20)
 * .predefinedMetric(PredefinedMetric.ELASTICACHE_PRIMARY_ENGINE_CPU_UTILIZATION)
 * .build());
 * ```
 */
public interface ScalableTargetProps {
  /**
   * The maximum value that Application Auto Scaling can use to scale a target during a scaling
   * activity.
   */
  public fun maxCapacity(): Number

  /**
   * The minimum value that Application Auto Scaling can use to scale a target during a scaling
   * activity.
   */
  public fun minCapacity(): Number

  /**
   * The resource identifier to associate with this scalable target.
   *
   * This string consists of the resource type and unique identifier.
   *
   * Example value: `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
   */
  public fun resourceId(): String

  /**
   * Role that allows Application Auto Scaling to modify your scalable target.
   *
   * Default: A role is automatically created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The scalable dimension that's associated with the scalable target.
   *
   * Specify the service namespace, resource type, and scaling property.
   *
   * Example value: `ecs:service:DesiredCount`
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
   */
  public fun scalableDimension(): String

  /**
   * The namespace of the AWS service that provides the resource or custom-resource for a resource
   * provided by your own application or service.
   *
   * For valid AWS service namespace values, see the RegisterScalableTarget
   * action in the Application Auto Scaling API Reference.
   *
   * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
   */
  public fun serviceNamespace(): ServiceNamespace

  /**
   * A builder for [ScalableTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param resourceId The resource identifier to associate with this scalable target. 
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     */
    public fun resourceId(resourceId: String)

    /**
     * @param role Role that allows Application Auto Scaling to modify your scalable target.
     */
    public fun role(role: IRole)

    /**
     * @param scalableDimension The scalable dimension that's associated with the scalable target. 
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     */
    public fun scalableDimension(scalableDimension: String)

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     * custom-resource for a resource provided by your own application or service. 
     * For valid AWS service namespace values, see the RegisterScalableTarget
     * action in the Application Auto Scaling API Reference.
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps.builder()

    /**
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param resourceId The resource identifier to associate with this scalable target. 
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param role Role that allows Application Auto Scaling to modify your scalable target.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param scalableDimension The scalable dimension that's associated with the scalable target. 
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     * custom-resource for a resource provided by your own application or service. 
     * For valid AWS service namespace values, see the RegisterScalableTarget
     * action in the Application Auto Scaling API Reference.
     */
    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps,
  ) : CdkObject(cdkObject), ScalableTargetProps {
    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     */
    override fun minCapacity(): Number = unwrap(this).getMinCapacity()

    /**
     * The resource identifier to associate with this scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * Role that allows Application Auto Scaling to modify your scalable target.
     *
     * Default: A role is automatically created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The scalable dimension that's associated with the scalable target.
     *
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
     */
    override fun scalableDimension(): String = unwrap(this).getScalableDimension()

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource
     * provided by your own application or service.
     *
     * For valid AWS service namespace values, see the RegisterScalableTarget
     * action in the Application Auto Scaling API Reference.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     */
    override fun serviceNamespace(): ServiceNamespace =
        unwrap(this).getServiceNamespace().let(ServiceNamespace::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalableTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps):
        ScalableTargetProps = CdkObjectWrappers.wrap(cdkObject) as? ScalableTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalableTargetProps):
        software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.ScalableTargetProps
  }
}
