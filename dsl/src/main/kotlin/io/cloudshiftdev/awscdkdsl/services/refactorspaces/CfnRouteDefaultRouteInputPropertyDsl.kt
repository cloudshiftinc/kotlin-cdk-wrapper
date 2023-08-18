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

package io.cloudshiftdev.awscdkdsl.services.refactorspaces

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnRoute

/**
 * The configuration for the default route type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.refactorspaces.*;
 * DefaultRouteInputProperty defaultRouteInputProperty = DefaultRouteInputProperty.builder()
 * .activationState("activationState")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-defaultrouteinput.html)
 */
@CdkDslMarker
public class CfnRouteDefaultRouteInputPropertyDsl {
    private val cdkBuilder: CfnRoute.DefaultRouteInputProperty.Builder =
        CfnRoute.DefaultRouteInputProperty.builder()

    /**
     * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
     *   after the route is created.
     */
    public fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
    }

    public fun build(): CfnRoute.DefaultRouteInputProperty = cdkBuilder.build()
}
