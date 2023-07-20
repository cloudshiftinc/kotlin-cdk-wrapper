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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnInstance.BlockDeviceMappingProperty.Builder =
        CfnInstance.BlockDeviceMappingProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    public fun ebs(ebs: CfnInstance.EbsProperty) {
        cdkBuilder.ebs(ebs)
    }

    public fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun noDevice(noDevice: CfnInstance.NoDeviceProperty) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnInstance.BlockDeviceMappingProperty = cdkBuilder.build()
}
