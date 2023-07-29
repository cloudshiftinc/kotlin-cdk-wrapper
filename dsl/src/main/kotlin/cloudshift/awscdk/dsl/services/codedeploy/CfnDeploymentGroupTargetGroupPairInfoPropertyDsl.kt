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

    /** @param prodTrafficRoute the value to be set. */
    public fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute)
    }

    /** @param prodTrafficRoute the value to be set. */
    public fun prodTrafficRoute(prodTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
        cdkBuilder.prodTrafficRoute(prodTrafficRoute)
    }

    /** @param targetGroups the value to be set. */
    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /** @param targetGroups the value to be set. */
    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    /** @param targetGroups the value to be set. */
    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    /** @param testTrafficRoute the value to be set. */
    public fun testTrafficRoute(testTrafficRoute: IResolvable) {
        cdkBuilder.testTrafficRoute(testTrafficRoute)
    }

    /** @param testTrafficRoute the value to be set. */
    public fun testTrafficRoute(testTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
        cdkBuilder.testTrafficRoute(testTrafficRoute)
    }

    public fun build(): CfnDeploymentGroup.TargetGroupPairInfoProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
