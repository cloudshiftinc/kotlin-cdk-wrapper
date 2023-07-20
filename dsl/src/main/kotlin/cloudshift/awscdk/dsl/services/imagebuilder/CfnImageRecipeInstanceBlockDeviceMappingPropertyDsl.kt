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
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import kotlin.String

@CdkDslMarker
public class CfnImageRecipeInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder =
        CfnImageRecipe.InstanceBlockDeviceMappingProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    public fun ebs(ebs: CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs)
    }

    public fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
    }

    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnImageRecipe.InstanceBlockDeviceMappingProperty = cdkBuilder.build()
}
