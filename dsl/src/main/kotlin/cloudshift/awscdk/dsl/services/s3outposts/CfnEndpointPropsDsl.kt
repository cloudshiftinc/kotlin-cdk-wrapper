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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.amazon.awscdk.services.s3outposts.CfnEndpointProps
import kotlin.String

@CdkDslMarker
public class CfnEndpointPropsDsl {
    private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

    public fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
    }

    public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
        cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
    }

    public fun failedReason(failedReason: IResolvable) {
        cdkBuilder.failedReason(failedReason)
    }

    public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
        cdkBuilder.failedReason(failedReason)
    }

    public fun outpostId(outpostId: String) {
        cdkBuilder.outpostId(outpostId)
    }

    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnEndpointProps = cdkBuilder.build()
}
