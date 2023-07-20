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
import software.amazon.awscdk.services.ec2.VpnGateway
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class VpnGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VpnGateway.Builder = VpnGateway.Builder.create(scope, id)

    public fun amazonSideAsn(amazonSideAsn: Number) {
        cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): VpnGateway = cdkBuilder.build()
}
