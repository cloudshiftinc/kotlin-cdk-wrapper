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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnDevice
import kotlin.String

@CdkDslMarker
public class CfnDeviceAWSLocationPropertyDsl {
    private val cdkBuilder: CfnDevice.AWSLocationProperty.Builder =
        CfnDevice.AWSLocationProperty.builder()

    public fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
    }

    public fun zone(zone: String) {
        cdkBuilder.zone(zone)
    }

    public fun build(): CfnDevice.AWSLocationProperty = cdkBuilder.build()
}
