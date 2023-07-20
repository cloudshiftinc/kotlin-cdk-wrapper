@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery
import kotlin.String

@CdkDslMarker
public class EndpointServiceAvailabilityZonesContextQueryDsl {
    private val cdkBuilder: EndpointServiceAvailabilityZonesContextQuery.Builder =
        EndpointServiceAvailabilityZonesContextQuery.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): EndpointServiceAvailabilityZonesContextQuery = cdkBuilder.build()
}
