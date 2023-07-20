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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnLaunchConfigurationBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder =
        CfnLaunchConfiguration.BlockDeviceMappingProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    public fun ebs(ebs: CfnLaunchConfiguration.BlockDeviceProperty) {
        cdkBuilder.ebs(ebs)
    }

    public fun noDevice(noDevice: Boolean) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnLaunchConfiguration.BlockDeviceMappingProperty = cdkBuilder.build()
}
