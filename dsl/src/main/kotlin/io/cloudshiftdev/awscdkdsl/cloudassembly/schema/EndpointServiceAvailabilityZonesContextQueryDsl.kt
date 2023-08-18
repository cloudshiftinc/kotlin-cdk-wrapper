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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery

/**
 * Query to endpoint service context provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
 * EndpointServiceAvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class EndpointServiceAvailabilityZonesContextQueryDsl {
    private val cdkBuilder: EndpointServiceAvailabilityZonesContextQuery.Builder =
        EndpointServiceAvailabilityZonesContextQuery.builder()

    /** @param account Query account. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param region Query region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param serviceName Query service name. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): EndpointServiceAvailabilityZonesContextQuery = cdkBuilder.build()
}
