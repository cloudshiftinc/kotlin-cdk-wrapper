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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
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
 * .appType("appType")
 * .codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .customFileSystems(List.of(CustomFileSystemProperty.builder()
 * .efsFileSystem(EFSFileSystemProperty.builder()
 * .fileSystemId("fileSystemId")
 * .build())
 * .build()))
 * .jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty.builder()
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
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
 * .spaceStorageSettings(SpaceStorageSettingsProperty.builder()
 * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
 * .ebsVolumeSizeInGb(123)
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

    private val _customFileSystems: MutableList<Any> = mutableListOf()

    /** @param appType The type of app created within the space. */
    public fun appType(appType: String) {
        cdkBuilder.appType(appType)
    }

    /** @param codeEditorAppSettings The Code Editor application settings. */
    public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings)
    }

    /** @param codeEditorAppSettings The Code Editor application settings. */
    public fun codeEditorAppSettings(
        codeEditorAppSettings: CfnSpace.SpaceCodeEditorAppSettingsProperty
    ) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings)
    }

    /**
     * @param customFileSystems A file system, created by you, that you assign to a space for an
     *   Amazon SageMaker Domain. Permitted users can access this file system in Amazon SageMaker
     *   Studio.
     */
    public fun customFileSystems(vararg customFileSystems: Any) {
        _customFileSystems.addAll(listOf(*customFileSystems))
    }

    /**
     * @param customFileSystems A file system, created by you, that you assign to a space for an
     *   Amazon SageMaker Domain. Permitted users can access this file system in Amazon SageMaker
     *   Studio.
     */
    public fun customFileSystems(customFileSystems: Collection<Any>) {
        _customFileSystems.addAll(customFileSystems)
    }

    /**
     * @param customFileSystems A file system, created by you, that you assign to a space for an
     *   Amazon SageMaker Domain. Permitted users can access this file system in Amazon SageMaker
     *   Studio.
     */
    public fun customFileSystems(customFileSystems: IResolvable) {
        cdkBuilder.customFileSystems(customFileSystems)
    }

    /** @param jupyterLabAppSettings The settings for the JupyterLab application. */
    public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings)
    }

    /** @param jupyterLabAppSettings The settings for the JupyterLab application. */
    public fun jupyterLabAppSettings(
        jupyterLabAppSettings: CfnSpace.SpaceJupyterLabAppSettingsProperty
    ) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings)
    }

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

    /** @param spaceStorageSettings The storage settings for a private space. */
    public fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings)
    }

    /** @param spaceStorageSettings The storage settings for a private space. */
    public fun spaceStorageSettings(spaceStorageSettings: CfnSpace.SpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings)
    }

    public fun build(): CfnSpace.SpaceSettingsProperty {
        if (_customFileSystems.isNotEmpty()) cdkBuilder.customFileSystems(_customFileSystems)
        return cdkBuilder.build()
    }
}
