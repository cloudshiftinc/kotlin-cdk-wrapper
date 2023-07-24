@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery
import kotlin.String

/**
 * Query to hosted zone context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
 * EndpointServiceAvailabilityZonesContextQuery.builder()
 * .account("account")
 * .region("region")
 * .serviceName("serviceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class EndpointServiceAvailabilityZonesContextQueryDsl {
    private val cdkBuilder: EndpointServiceAvailabilityZonesContextQuery.Builder =
        EndpointServiceAvailabilityZonesContextQuery.builder()

    /**
     * @param account Query account.
     */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param region Query region.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param serviceName Query service name.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): EndpointServiceAvailabilityZonesContextQuery = cdkBuilder.build()
}
