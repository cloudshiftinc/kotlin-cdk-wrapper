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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents the action to take if a match is determined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcRouteActionProperty grpcRouteActionProperty = GrpcRouteActionProperty.builder()
 * .weightedTargets(List.of(WeightedTargetProperty.builder()
 * .virtualNode("virtualNode")
 * .weight(123)
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html)
 */
@CdkDslMarker
public class CfnRouteGrpcRouteActionPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRouteActionProperty.Builder =
        CfnRoute.GrpcRouteActionProperty.builder()

    private val _weightedTargets: MutableList<Any> = mutableListOf()

    /**
     * @param weightedTargets An object that represents the targets that traffic is routed to when a
     *   request matches the route.
     */
    public fun weightedTargets(vararg weightedTargets: Any) {
        _weightedTargets.addAll(listOf(*weightedTargets))
    }

    /**
     * @param weightedTargets An object that represents the targets that traffic is routed to when a
     *   request matches the route.
     */
    public fun weightedTargets(weightedTargets: Collection<Any>) {
        _weightedTargets.addAll(weightedTargets)
    }

    /**
     * @param weightedTargets An object that represents the targets that traffic is routed to when a
     *   request matches the route.
     */
    public fun weightedTargets(weightedTargets: IResolvable) {
        cdkBuilder.weightedTargets(weightedTargets)
    }

    public fun build(): CfnRoute.GrpcRouteActionProperty {
        if (_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
        return cdkBuilder.build()
    }
}
