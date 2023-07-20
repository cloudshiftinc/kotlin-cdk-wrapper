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
public class CfnWirelessDeviceAbpV11PropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.AbpV11Property.Builder =
        CfnWirelessDevice.AbpV11Property.builder()

    public fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
    }

    public fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    public fun sessionKeys(sessionKeys: CfnWirelessDevice.SessionKeysAbpV11Property) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    public fun build(): CfnWirelessDevice.AbpV11Property = cdkBuilder.build()
}
