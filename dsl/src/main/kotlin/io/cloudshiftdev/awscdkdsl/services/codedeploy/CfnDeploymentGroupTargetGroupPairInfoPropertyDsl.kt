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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Information about two target groups and how traffic is routed during an Amazon ECS deployment.
 *
 * An optional test traffic route can be specified.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TargetGroupPairInfoProperty targetGroupPairInfoProperty = TargetGroupPairInfoProperty.builder()
 * .prodTrafficRoute(TrafficRouteProperty.builder()
 * .listenerArns(List.of("listenerArns"))
 * .build())
 * .targetGroups(List.of(TargetGroupInfoProperty.builder()
 * .name("name")
 * .build()))
 * .testTrafficRoute(TrafficRouteProperty.builder()
 * .listenerArns(List.of("listenerArns"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-targetgrouppairinfo.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupTargetGroupPairInfoPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TargetGroupPairInfoProperty.Builder =
        CfnDeploymentGroup.TargetGroupPairInfoProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    /**
     * @param prodTrafficRoute The path used by a load balancer to route production traffic when an
     *   Amazon ECS deployment is complete.
     */
    public fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute)
    }

    /**
     * @param prodTrafficRoute The path used by a load balancer to route production traffic when an
     *   Amazon ECS deployment is complete.
     */
    public fun prodTrafficRoute(prodTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute)
    }

    /**
     * @param targetGroups One pair of target groups. One is associated with the original task set.
     *   The second is associated with the task set that serves traffic after the deployment is
     *   complete.
     */
    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /**
     * @param targetGroups One pair of target groups. One is associated with the original task set.
     *   The second is associated with the task set that serves traffic after the deployment is
     *   complete.
     */
    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    /**
     * @param targetGroups One pair of target groups. One is associated with the original task set.
     *   The second is associated with the task set that serves traffic after the deployment is
     *   complete.
     */
    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    /**
     * @param testTrafficRoute An optional path used by a load balancer to route test traffic after
     *   an Amazon ECS deployment. Validation can occur while test traffic is served during a
     *   deployment.
     */
    public fun testTrafficRoute(testTrafficRoute: IResolvable) {
        cdkBuilder.testTrafficRoute(testTrafficRoute)
    }

    /**
     * @param testTrafficRoute An optional path used by a load balancer to route test traffic after
     *   an Amazon ECS deployment. Validation can occur while test traffic is served during a
     *   deployment.
     */
    public fun testTrafficRoute(testTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
        cdkBuilder.testTrafficRoute(testTrafficRoute)
    }

    public fun build(): CfnDeploymentGroup.TargetGroupPairInfoProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
