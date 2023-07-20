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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import kotlin.String

@CdkDslMarker
public class CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder =
        CfnContainerRecipe.InstanceBlockDeviceMappingProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    public fun ebs(ebs: CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs)
    }

    public fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnContainerRecipe.InstanceBlockDeviceMappingProperty = cdkBuilder.build()
}
