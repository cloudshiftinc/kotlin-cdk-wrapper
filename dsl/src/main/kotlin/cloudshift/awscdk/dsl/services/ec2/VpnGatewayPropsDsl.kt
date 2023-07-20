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
import software.amazon.awscdk.services.ec2.VpnGatewayProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class VpnGatewayPropsDsl {
    private val cdkBuilder: VpnGatewayProps.Builder = VpnGatewayProps.builder()

    public fun amazonSideAsn(amazonSideAsn: Number) {
        cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): VpnGatewayProps = cdkBuilder.build()
}
