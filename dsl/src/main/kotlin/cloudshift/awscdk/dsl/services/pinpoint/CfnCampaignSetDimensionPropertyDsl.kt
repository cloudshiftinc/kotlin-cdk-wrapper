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
public class CfnCampaignSetDimensionPropertyDsl {
    private val cdkBuilder: CfnCampaign.SetDimensionProperty.Builder =
        CfnCampaign.SetDimensionProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
    }

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnCampaign.SetDimensionProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
