@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a scalable target.
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
public open class ScalableTarget(
  cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget,
) : Resource(cdkObject),
    IScalableTarget {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScalableTargetProps,
  ) :
      this(software.amazon.awscdk.services.applicationautoscaling.ScalableTarget(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ScalableTargetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ScalableTargetProps.Builder.() -> Unit,
  ) : this(scope, id, ScalableTargetProps(props)
  )

  /**
   * Add a policy statement to the role's policy.
   *
   * @param statement 
   */
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * Add a policy statement to the role's policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * The role used to give AutoScaling permissions to your resource.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * ID of the Scalable Target.
   *
   * Example value:
   * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH|ecs:service:DesiredCount|ecs`
   */
  public override fun scalableTargetId(): String = unwrap(this).getScalableTargetId()

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps): StepScalingPolicy =
      unwrap(this).scaleOnMetric(id,
      props.let(BasicStepScalingPolicyProps.Companion::unwrap)).let(StepScalingPolicy::wrap)

  /**
   * Scale out or in, in response to a metric.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("193d1ed3a5b25b3149e2c4067608c34da946c05963716db27c25dc573465ce60")
  public open fun scaleOnMetric(id: String, props: BasicStepScalingPolicyProps.Builder.() -> Unit):
      StepScalingPolicy = scaleOnMetric(id, BasicStepScalingPolicyProps(props))

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param action 
   */
  public open fun scaleOnSchedule(id: String, action: ScalingSchedule) {
    unwrap(this).scaleOnSchedule(id, action.let(ScalingSchedule.Companion::unwrap))
  }

  /**
   * Scale out or in based on time.
   *
   * @param id 
   * @param action 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e652746809f3e4412c49544d1500446974784d78cd2e4c1d569436b4931291f")
  public open fun scaleOnSchedule(id: String, action: ScalingSchedule.Builder.() -> Unit): Unit =
      scaleOnSchedule(id, ScalingSchedule(action))

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  public open fun scaleToTrackMetric(id: String, props: BasicTargetTrackingScalingPolicyProps):
      TargetTrackingScalingPolicy = unwrap(this).scaleToTrackMetric(id,
      props.let(BasicTargetTrackingScalingPolicyProps.Companion::unwrap)).let(TargetTrackingScalingPolicy::wrap)

  /**
   * Scale out or in in order to keep a metric around a target value.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc03770438dd3c85834667ceb73e2dd9e0a3151f3d610632fef5e6d4c52c759a")
  public open fun scaleToTrackMetric(id: String,
      props: BasicTargetTrackingScalingPolicyProps.Builder.() -> Unit): TargetTrackingScalingPolicy
      = scaleToTrackMetric(id, BasicTargetTrackingScalingPolicyProps(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalableTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * The resource identifier to associate with this scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * @param resourceId The resource identifier to associate with this scalable target. 
     */
    public fun resourceId(resourceId: String)

    /**
     * Role that allows Application Auto Scaling to modify your scalable target.
     *
     * Default: A role is automatically created
     *
     * @param role Role that allows Application Auto Scaling to modify your scalable target. 
     */
    public fun role(role: IRole)

    /**
     * The scalable dimension that's associated with the scalable target.
     *
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
     * @param scalableDimension The scalable dimension that's associated with the scalable target. 
     */
    public fun scalableDimension(scalableDimension: String)

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource
     * provided by your own application or service.
     *
     * For valid AWS service namespace values, see the RegisterScalableTarget
     * action in the Application Auto Scaling API Reference.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     * custom-resource for a resource provided by your own application or service. 
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.Builder.create(scope,
        id)

    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     * during a scaling activity. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * The resource identifier to associate with this scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * @param resourceId The resource identifier to associate with this scalable target. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * Role that allows Application Auto Scaling to modify your scalable target.
     *
     * Default: A role is automatically created
     *
     * @param role Role that allows Application Auto Scaling to modify your scalable target. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The scalable dimension that's associated with the scalable target.
     *
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
     * @param scalableDimension The scalable dimension that's associated with the scalable target. 
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource
     * provided by your own application or service.
     *
     * For valid AWS service namespace values, see the RegisterScalableTarget
     * action in the Application Auto Scaling API Reference.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     * custom-resource for a resource provided by your own application or service. 
     */
    override fun serviceNamespace(serviceNamespace: ServiceNamespace) {
      cdkBuilder.serviceNamespace(serviceNamespace.let(ServiceNamespace.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalableTarget =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromScalableTargetId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      scalableTargetId: String,
    ): IScalableTarget =
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget.fromScalableTargetId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, scalableTargetId).let(IScalableTarget::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScalableTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScalableTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalableTarget):
        ScalableTarget = ScalableTarget(cdkObject)

    internal fun unwrap(wrapped: ScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget = wrapped.cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
  }
}
