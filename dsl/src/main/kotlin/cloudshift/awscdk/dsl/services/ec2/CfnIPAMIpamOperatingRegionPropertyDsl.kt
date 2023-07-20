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
import software.amazon.awscdk.services.ec2.CfnIPAM
import kotlin.String

@CdkDslMarker
public class CfnIPAMIpamOperatingRegionPropertyDsl {
    private val cdkBuilder: CfnIPAM.IpamOperatingRegionProperty.Builder =
        CfnIPAM.IpamOperatingRegionProperty.builder()

    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnIPAM.IpamOperatingRegionProperty = cdkBuilder.build()
}
