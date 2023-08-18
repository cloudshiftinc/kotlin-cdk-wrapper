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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents the range of values to match on.
 *
 * The first character of the range is included in the range, though the last character is not. For
 * example, if the range specified were 1-100, only values 1-99 would be matched.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * MatchRangeProperty matchRangeProperty = MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html)
 */
@CdkDslMarker
public class CfnRouteMatchRangePropertyDsl {
    private val cdkBuilder: CfnRoute.MatchRangeProperty.Builder =
        CfnRoute.MatchRangeProperty.builder()

    /** @param end The end of the range. */
    public fun end(end: Number) {
        cdkBuilder.end(end)
    }

    /** @param start The start of the range. */
    public fun start(start: Number) {
        cdkBuilder.start(start)
    }

    public fun build(): CfnRoute.MatchRangeProperty = cdkBuilder.build()
}
