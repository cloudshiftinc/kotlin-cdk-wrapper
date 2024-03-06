@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Define a scalable target.
 *
 * Example:
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
@CdkDslMarker
public class ScalableTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ScalableTarget.Builder = ScalableTarget.Builder.create(scope, id)

    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     *   during a scaling activity.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     *   during a scaling activity.
     */
    public fun minCapacity(minCapacity: Number) {
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
     *
     * @param resourceId The resource identifier to associate with this scalable target.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /**
     * Role that allows Application Auto Scaling to modify your scalable target.
     *
     * Default: A role is automatically created
     *
     * @param role Role that allows Application Auto Scaling to modify your scalable target.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The scalable dimension that's associated with the scalable target.
     *
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
     *
     * @param scalableDimension The scalable dimension that's associated with the scalable target.
     */
    public fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource
     * provided by your own application or service.
     *
     * For valid AWS service namespace values, see the RegisterScalableTarget action in the
     * Application Auto Scaling API Reference.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     *
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     *   custom-resource for a resource provided by your own application or service.
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun build(): ScalableTarget = cdkBuilder.build()
}
