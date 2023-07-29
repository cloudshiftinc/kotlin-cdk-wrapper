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
import kotlin.Number
import software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase

/**
 * Base options for all route specs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * RouteSpecOptionsBase routeSpecOptionsBase = RouteSpecOptionsBase.builder()
 * .priority(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class RouteSpecOptionsBaseDsl {
    private val cdkBuilder: RouteSpecOptionsBase.Builder = RouteSpecOptionsBase.builder()

    /**
     * @param priority The priority for the route. When a Virtual Router has multiple routes, route
     *   match is performed in the order of specified value, where 0 is the highest priority, and
     *   first matched route is selected.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): RouteSpecOptionsBase = cdkBuilder.build()
}
