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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * TrafficRouteProperty trafficRouteProperty = TrafficRouteProperty.builder()
 * .listenerArns(List.of("listenerArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-trafficroute.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupTrafficRoutePropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TrafficRouteProperty.Builder =
        CfnDeploymentGroup.TrafficRouteProperty.builder()

    private val _listenerArns: MutableList<String> = mutableListOf()

    /** @param listenerArns the value to be set. */
    public fun listenerArns(vararg listenerArns: String) {
        _listenerArns.addAll(listOf(*listenerArns))
    }

    /** @param listenerArns the value to be set. */
    public fun listenerArns(listenerArns: Collection<String>) {
        _listenerArns.addAll(listenerArns)
    }

    public fun build(): CfnDeploymentGroup.TrafficRouteProperty {
        if (_listenerArns.isNotEmpty()) cdkBuilder.listenerArns(_listenerArns)
        return cdkBuilder.build()
    }
}
