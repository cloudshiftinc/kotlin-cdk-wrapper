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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import kotlin.String

@CdkDslMarker
public class CfnWirelessDeviceOtaaV11PropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.OtaaV11Property.Builder =
        CfnWirelessDevice.OtaaV11Property.builder()

    public fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
    }

    public fun joinEui(joinEui: String) {
        cdkBuilder.joinEui(joinEui)
    }

    public fun nwkKey(nwkKey: String) {
        cdkBuilder.nwkKey(nwkKey)
    }

    public fun build(): CfnWirelessDevice.OtaaV11Property = cdkBuilder.build()
}
