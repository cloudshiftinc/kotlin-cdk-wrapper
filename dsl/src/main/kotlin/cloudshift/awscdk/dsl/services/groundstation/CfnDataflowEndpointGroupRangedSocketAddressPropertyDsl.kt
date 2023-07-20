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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import kotlin.String

@CdkDslMarker
public class CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.RangedSocketAddressProperty.Builder =
        CfnDataflowEndpointGroup.RangedSocketAddressProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange)
    }

    public fun portRange(portRange: CfnDataflowEndpointGroup.IntegerRangeProperty) {
        cdkBuilder.portRange(portRange)
    }

    public fun build(): CfnDataflowEndpointGroup.RangedSocketAddressProperty = cdkBuilder.build()
}
