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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayVpcAttachmentOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayVpcAttachment.OptionsProperty.Builder =
        CfnTransitGatewayVpcAttachment.OptionsProperty.builder()

    public fun applianceModeSupport(applianceModeSupport: String) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
    }

    public fun dnsSupport(dnsSupport: String) {
        cdkBuilder.dnsSupport(dnsSupport)
    }

    public fun ipv6Support(ipv6Support: String) {
        cdkBuilder.ipv6Support(ipv6Support)
    }

    public fun build(): CfnTransitGatewayVpcAttachment.OptionsProperty = cdkBuilder.build()
}
