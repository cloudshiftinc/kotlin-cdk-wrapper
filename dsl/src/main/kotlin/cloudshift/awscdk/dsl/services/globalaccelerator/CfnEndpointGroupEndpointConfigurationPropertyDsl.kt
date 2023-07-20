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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEndpointGroupEndpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnEndpointGroup.EndpointConfigurationProperty.Builder =
        CfnEndpointGroup.EndpointConfigurationProperty.builder()

    public fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
    }

    public fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
    }

    public fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEndpointGroup.EndpointConfigurationProperty = cdkBuilder.build()
}
