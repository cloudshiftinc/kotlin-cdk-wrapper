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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.BlockDeviceMappingProperty.Builder =
        CfnLaunchTemplate.BlockDeviceMappingProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    public fun ebs(ebs: CfnLaunchTemplate.EbsProperty) {
        cdkBuilder.ebs(ebs)
    }

    public fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnLaunchTemplate.BlockDeviceMappingProperty = cdkBuilder.build()
}
