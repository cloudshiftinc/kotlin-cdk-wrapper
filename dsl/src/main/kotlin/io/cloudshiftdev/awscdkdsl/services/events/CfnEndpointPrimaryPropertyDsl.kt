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
 * The primary Region of the endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * PrimaryProperty primaryProperty = PrimaryProperty.builder()
 * .healthCheck("healthCheck")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-primary.html)
 */
@CdkDslMarker
public class CfnEndpointPrimaryPropertyDsl {
    private val cdkBuilder: CfnEndpoint.PrimaryProperty.Builder =
        CfnEndpoint.PrimaryProperty.builder()

    /**
     * @param healthCheck The ARN of the health check used by the endpoint to determine whether
     *   failover is triggered.
     */
    public fun healthCheck(healthCheck: String) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun build(): CfnEndpoint.PrimaryProperty = cdkBuilder.build()
}
