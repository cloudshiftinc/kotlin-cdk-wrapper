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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayMulticastDomainOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastDomain.OptionsProperty.Builder =
        CfnTransitGatewayMulticastDomain.OptionsProperty.builder()

    public fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String) {
        cdkBuilder.autoAcceptSharedAssociations(autoAcceptSharedAssociations)
    }

    public fun igmpv2Support(igmpv2Support: String) {
        cdkBuilder.igmpv2Support(igmpv2Support)
    }

    public fun staticSourcesSupport(staticSourcesSupport: String) {
        cdkBuilder.staticSourcesSupport(staticSourcesSupport)
    }

    public fun build(): CfnTransitGatewayMulticastDomain.OptionsProperty = cdkBuilder.build()
}
