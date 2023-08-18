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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents the match metadata for the route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcRouteMetadataProperty grpcRouteMetadataProperty = GrpcRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GrpcRouteMetadataMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html)
 */
@CdkDslMarker
public class CfnRouteGrpcRouteMetadataPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRouteMetadataProperty.Builder =
        CfnRoute.GrpcRouteMetadataProperty.builder()

    /**
     * @param invert Specify `True` to match anything except the match criteria. The default value
     *   is `False` .
     */
    public fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
    }

    /**
     * @param invert Specify `True` to match anything except the match criteria. The default value
     *   is `False` .
     */
    public fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert)
    }

    /** @param match An object that represents the data to match from the request. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the data to match from the request. */
    public fun match(match: CfnRoute.GrpcRouteMetadataMatchMethodProperty) {
        cdkBuilder.match(match)
    }

    /** @param name The name of the route. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRoute.GrpcRouteMetadataProperty = cdkBuilder.build()
}
