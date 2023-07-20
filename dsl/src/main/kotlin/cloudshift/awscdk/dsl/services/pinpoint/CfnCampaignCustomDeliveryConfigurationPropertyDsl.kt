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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCampaignCustomDeliveryConfigurationPropertyDsl {
    private val cdkBuilder: CfnCampaign.CustomDeliveryConfigurationProperty.Builder =
        CfnCampaign.CustomDeliveryConfigurationProperty.builder()

    private val _endpointTypes: MutableList<String> = mutableListOf()

    public fun deliveryUri(deliveryUri: String) {
        cdkBuilder.deliveryUri(deliveryUri)
    }

    public fun endpointTypes(vararg endpointTypes: String) {
        _endpointTypes.addAll(listOf(*endpointTypes))
    }

    public fun endpointTypes(endpointTypes: Collection<String>) {
        _endpointTypes.addAll(endpointTypes)
    }

    public fun build(): CfnCampaign.CustomDeliveryConfigurationProperty {
        if (_endpointTypes.isNotEmpty()) cdkBuilder.endpointTypes(_endpointTypes)
        return cdkBuilder.build()
    }
}
