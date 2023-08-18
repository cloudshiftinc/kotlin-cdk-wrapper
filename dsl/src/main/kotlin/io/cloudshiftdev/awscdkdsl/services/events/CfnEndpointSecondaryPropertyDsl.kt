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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

/**
 * The secondary Region that processes events when failover is triggered or replication is enabled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * SecondaryProperty secondaryProperty = SecondaryProperty.builder()
 * .route("route")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-secondary.html)
 */
@CdkDslMarker
public class CfnEndpointSecondaryPropertyDsl {
    private val cdkBuilder: CfnEndpoint.SecondaryProperty.Builder =
        CfnEndpoint.SecondaryProperty.builder()

    /** @param route Defines the secondary Region. */
    public fun route(route: String) {
        cdkBuilder.route(route)
    }

    public fun build(): CfnEndpoint.SecondaryProperty = cdkBuilder.build()
}
