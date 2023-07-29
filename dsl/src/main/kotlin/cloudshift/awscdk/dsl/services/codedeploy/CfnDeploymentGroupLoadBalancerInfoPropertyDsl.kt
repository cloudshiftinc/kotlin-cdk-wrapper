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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * The `LoadBalancerInfo` property type specifies information about the load balancer or target
 * group used for an AWS CodeDeploy deployment group.
 *
 * For more information, see
 * [Integrating CodeDeploy with Elastic Load Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
 * in the *AWS CodeDeploy User Guide* .
 *
 * For AWS CloudFormation to use the properties specified in `LoadBalancerInfo` , the
 * `DeploymentStyle.DeploymentOption` property must be set to `WITH_TRAFFIC_CONTROL` . If
 * `DeploymentStyle.DeploymentOption` is not set to `WITH_TRAFFIC_CONTROL` , AWS CloudFormation
 * ignores any settings specified in `LoadBalancerInfo` .
 *
 * AWS CloudFormation supports blue/green deployments on the AWS Lambda compute platform only.
 *
 * `LoadBalancerInfo` is a property of the
 * [DeploymentGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * LoadBalancerInfoProperty loadBalancerInfoProperty = LoadBalancerInfoProperty.builder()
 * .elbInfoList(List.of(ELBInfoProperty.builder()
 * .name("name")
 * .build()))
 * .targetGroupInfoList(List.of(TargetGroupInfoProperty.builder()
 * .name("name")
 * .build()))
 * .targetGroupPairInfoList(List.of(TargetGroupPairInfoProperty.builder()
 * .prodTrafficRoute(TrafficRouteProperty.builder()
 * .listenerArns(List.of("listenerArns"))
 * .build())
 * .targetGroups(List.of(TargetGroupInfoProperty.builder()
 * .name("name")
 * .build()))
 * .testTrafficRoute(TrafficRouteProperty.builder()
 * .listenerArns(List.of("listenerArns"))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupLoadBalancerInfoPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder =
        CfnDeploymentGroup.LoadBalancerInfoProperty.builder()

    private val _elbInfoList: MutableList<Any> = mutableListOf()

    private val _targetGroupInfoList: MutableList<Any> = mutableListOf()

    private val _targetGroupPairInfoList: MutableList<Any> = mutableListOf()

    /**
     * @param elbInfoList An array that contains information about the load balancer to use for load
     *   balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic
     *   Load Balancers.
     *
     * Adding more than one load balancer to the array is not supported.
     */
    public fun elbInfoList(vararg elbInfoList: Any) {
        _elbInfoList.addAll(listOf(*elbInfoList))
    }

    /**
     * @param elbInfoList An array that contains information about the load balancer to use for load
     *   balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic
     *   Load Balancers.
     *
     * Adding more than one load balancer to the array is not supported.
     */
    public fun elbInfoList(elbInfoList: Collection<Any>) {
        _elbInfoList.addAll(elbInfoList)
    }

    /**
     * @param elbInfoList An array that contains information about the load balancer to use for load
     *   balancing in a deployment. In Elastic Load Balancing, load balancers are used with Classic
     *   Load Balancers.
     *
     * Adding more than one load balancer to the array is not supported.
     */
    public fun elbInfoList(elbInfoList: IResolvable) {
        cdkBuilder.elbInfoList(elbInfoList)
    }

    /**
     * @param targetGroupInfoList An array that contains information about the target group to use
     *   for load balancing in a deployment. In Elastic Load Balancing , target groups are used with
     *   Application Load Balancers .
     *
     * Adding more than one target group to the array is not supported.
     */
    public fun targetGroupInfoList(vararg targetGroupInfoList: Any) {
        _targetGroupInfoList.addAll(listOf(*targetGroupInfoList))
    }

    /**
     * @param targetGroupInfoList An array that contains information about the target group to use
     *   for load balancing in a deployment. In Elastic Load Balancing , target groups are used with
     *   Application Load Balancers .
     *
     * Adding more than one target group to the array is not supported.
     */
    public fun targetGroupInfoList(targetGroupInfoList: Collection<Any>) {
        _targetGroupInfoList.addAll(targetGroupInfoList)
    }

    /**
     * @param targetGroupInfoList An array that contains information about the target group to use
     *   for load balancing in a deployment. In Elastic Load Balancing , target groups are used with
     *   Application Load Balancers .
     *
     * Adding more than one target group to the array is not supported.
     */
    public fun targetGroupInfoList(targetGroupInfoList: IResolvable) {
        cdkBuilder.targetGroupInfoList(targetGroupInfoList)
    }

    /** @param targetGroupPairInfoList the value to be set. */
    public fun targetGroupPairInfoList(vararg targetGroupPairInfoList: Any) {
        _targetGroupPairInfoList.addAll(listOf(*targetGroupPairInfoList))
    }

    /** @param targetGroupPairInfoList the value to be set. */
    public fun targetGroupPairInfoList(targetGroupPairInfoList: Collection<Any>) {
        _targetGroupPairInfoList.addAll(targetGroupPairInfoList)
    }

    /** @param targetGroupPairInfoList the value to be set. */
    public fun targetGroupPairInfoList(targetGroupPairInfoList: IResolvable) {
        cdkBuilder.targetGroupPairInfoList(targetGroupPairInfoList)
    }

    public fun build(): CfnDeploymentGroup.LoadBalancerInfoProperty {
        if (_elbInfoList.isNotEmpty()) cdkBuilder.elbInfoList(_elbInfoList)
        if (_targetGroupInfoList.isNotEmpty()) cdkBuilder.targetGroupInfoList(_targetGroupInfoList)
        if (_targetGroupPairInfoList.isNotEmpty())
            cdkBuilder.targetGroupPairInfoList(_targetGroupPairInfoList)
        return cdkBuilder.build()
    }
}
