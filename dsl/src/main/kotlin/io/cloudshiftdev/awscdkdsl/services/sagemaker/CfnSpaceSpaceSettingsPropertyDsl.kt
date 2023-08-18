@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A collection of space settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SpaceSettingsProperty spaceSettingsProperty = SpaceSettingsProperty.builder()
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .kernelGatewayAppSettings(KernelGatewayAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html)
 */
@CdkDslMarker
public class CfnSpaceSpaceSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceSettingsProperty.Builder =
        CfnSpace.SpaceSettingsProperty.builder()

    /** @param jupyterServerAppSettings The JupyterServer app settings. */
    public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param jupyterServerAppSettings The JupyterServer app settings. */
    public fun jupyterServerAppSettings(
        jupyterServerAppSettings: CfnSpace.JupyterServerAppSettingsProperty
    ) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param kernelGatewayAppSettings The KernelGateway app settings. */
    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    /** @param kernelGatewayAppSettings The KernelGateway app settings. */
    public fun kernelGatewayAppSettings(
        kernelGatewayAppSettings: CfnSpace.KernelGatewayAppSettingsProperty
    ) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    public fun build(): CfnSpace.SpaceSettingsProperty = cdkBuilder.build()
}
