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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import kotlin.String

@CdkDslMarker
public class CfnWirelessDeviceLoRaWANDevicePropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.LoRaWANDeviceProperty.Builder =
        CfnWirelessDevice.LoRaWANDeviceProperty.builder()

    public fun abpV10X(abpV10X: IResolvable) {
        cdkBuilder.abpV10X(abpV10X)
    }

    public fun abpV10X(abpV10X: CfnWirelessDevice.AbpV10xProperty) {
        cdkBuilder.abpV10X(abpV10X)
    }

    public fun abpV11(abpV11: IResolvable) {
        cdkBuilder.abpV11(abpV11)
    }

    public fun abpV11(abpV11: CfnWirelessDevice.AbpV11Property) {
        cdkBuilder.abpV11(abpV11)
    }

    public fun devEui(devEui: String) {
        cdkBuilder.devEui(devEui)
    }

    public fun deviceProfileId(deviceProfileId: String) {
        cdkBuilder.deviceProfileId(deviceProfileId)
    }

    public fun otaaV10X(otaaV10X: IResolvable) {
        cdkBuilder.otaaV10X(otaaV10X)
    }

    public fun otaaV10X(otaaV10X: CfnWirelessDevice.OtaaV10xProperty) {
        cdkBuilder.otaaV10X(otaaV10X)
    }

    public fun otaaV11(otaaV11: IResolvable) {
        cdkBuilder.otaaV11(otaaV11)
    }

    public fun otaaV11(otaaV11: CfnWirelessDevice.OtaaV11Property) {
        cdkBuilder.otaaV11(otaaV11)
    }

    public fun serviceProfileId(serviceProfileId: String) {
        cdkBuilder.serviceProfileId(serviceProfileId)
    }

    public fun build(): CfnWirelessDevice.LoRaWANDeviceProperty = cdkBuilder.build()
}
