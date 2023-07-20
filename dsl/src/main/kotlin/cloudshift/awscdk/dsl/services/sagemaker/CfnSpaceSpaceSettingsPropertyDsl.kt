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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

@CdkDslMarker
public class CfnSpaceSpaceSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceSettingsProperty.Builder =
        CfnSpace.SpaceSettingsProperty.builder()

    public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    public fun jupyterServerAppSettings(jupyterServerAppSettings: CfnSpace.JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnSpace.KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    public fun build(): CfnSpace.SpaceSettingsProperty = cdkBuilder.build()
}
