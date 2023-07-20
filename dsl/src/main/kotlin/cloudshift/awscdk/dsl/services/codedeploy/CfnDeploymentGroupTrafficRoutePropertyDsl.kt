@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentGroupTrafficRoutePropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TrafficRouteProperty.Builder =
        CfnDeploymentGroup.TrafficRouteProperty.builder()

    private val _listenerArns: MutableList<String> = mutableListOf()

    public fun listenerArns(vararg listenerArns: String) {
        _listenerArns.addAll(listOf(*listenerArns))
    }

    public fun listenerArns(listenerArns: Collection<String>) {
        _listenerArns.addAll(listenerArns)
    }

    public fun build(): CfnDeploymentGroup.TrafficRouteProperty {
        if (_listenerArns.isNotEmpty()) cdkBuilder.listenerArns(_listenerArns)
        return cdkBuilder.build()
    }
}
