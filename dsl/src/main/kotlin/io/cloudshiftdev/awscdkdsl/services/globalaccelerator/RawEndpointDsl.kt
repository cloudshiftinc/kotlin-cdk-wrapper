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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.RawEndpoint

/**
 * Untyped endpoint implementation.
 *
 * Prefer using the classes in the `aws-globalaccelerator-endpoints` package instead, as they accept
 * typed constructs. You can use this class if you want to use an endpoint type that does not have
 * an appropriate class in that package yet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * RawEndpoint rawEndpoint = RawEndpoint.Builder.create()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .preserveClientIp(false)
 * .region("region")
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class RawEndpointDsl {
    private val cdkBuilder: RawEndpoint.Builder = RawEndpoint.Builder.create()

    /**
     * Identifier of the endpoint.
     *
     * Load balancer ARN, instance ID or EIP allocation ID.
     *
     * @param endpointId Identifier of the endpoint.
     */
    public fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
    }

    /**
     * Forward the client IP address.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order to preserve the client
     * IP address.
     *
     * Only applies to Application Load Balancers and EC2 instances.
     *
     * Client IP address preservation is supported only in specific AWS Regions. See the
     * GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if possible and available
     *
     * @param preserveClientIp Forward the client IP address.
     */
    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * The region where this endpoint is located.
     *
     * Default: - Unknown what region this endpoint is located
     *
     * @param region The region where this endpoint is located.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): RawEndpoint = cdkBuilder.build()
}
