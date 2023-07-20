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
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import kotlin.Number

@CdkDslMarker
public class CfnEC2FleetTotalLocalStorageGBRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.TotalLocalStorageGBRequestProperty.Builder =
        CfnEC2Fleet.TotalLocalStorageGBRequestProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnEC2Fleet.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
