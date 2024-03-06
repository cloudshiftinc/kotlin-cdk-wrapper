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
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * A collection of settings that apply to users of Amazon SageMaker Studio.
 *
 * These settings are specified when the
 * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
 * API is called, and as `DefaultUserSettings` when the
 * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
 * API is called.
 *
 * `SecurityGroups` is aggregated when specified in both calls. For all other settings in
 * `UserSettings` , the values specified in `CreateUserProfile` take precedence over those specified
 * in `CreateDomain` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * UserSettingsProperty userSettingsProperty = UserSettingsProperty.builder()
 * .executionRole("executionRole")
 * // the properties below are optional
 * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build())
 * .customFileSystemConfigs(List.of(CustomFileSystemConfigProperty.builder()
 * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .fileSystemPath("fileSystemPath")
 * .build())
 * .build()))
 * .customPosixUserConfig(CustomPosixUserConfigProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build())
 * .defaultLandingUri("defaultLandingUri")
 * .jupyterLabAppSettings(JupyterLabAppSettingsProperty.builder()
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build())
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
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
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .rSessionAppSettings(RSessionAppSettingsProperty.builder()
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .rStudioServerProAppSettings(RStudioServerProAppSettingsProperty.builder()
 * .accessStatus("accessStatus")
 * .userGroup("userGroup")
 * .build())
 * .securityGroups(List.of("securityGroups"))
 * .sharingSettings(SharingSettingsProperty.builder()
 * .notebookOutputOption("notebookOutputOption")
 * .s3KmsKeyId("s3KmsKeyId")
 * .s3OutputPath("s3OutputPath")
 * .build())
 * .spaceStorageSettings(DefaultSpaceStorageSettingsProperty.builder()
 * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
 * .defaultEbsVolumeSizeInGb(123)
 * .maximumEbsVolumeSizeInGb(123)
 * .build())
 * .build())
 * .studioWebPortal("studioWebPortal")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-usersettings.html)
 */
@CdkDslMarker
public class CfnDomainUserSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.UserSettingsProperty.Builder =
        CfnDomain.UserSettingsProperty.builder()

    private val _customFileSystemConfigs: MutableList<Any> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /** @param codeEditorAppSettings The Code Editor application settings. */
    public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings)
    }

    /** @param codeEditorAppSettings The Code Editor application settings. */
    public fun codeEditorAppSettings(
        codeEditorAppSettings: CfnDomain.CodeEditorAppSettingsProperty
    ) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings)
    }

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user
     *   profile. Permitted users can access this file system in Amazon SageMaker Studio.
     */
    public fun customFileSystemConfigs(vararg customFileSystemConfigs: Any) {
        _customFileSystemConfigs.addAll(listOf(*customFileSystemConfigs))
    }

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user
     *   profile. Permitted users can access this file system in Amazon SageMaker Studio.
     */
    public fun customFileSystemConfigs(customFileSystemConfigs: Collection<Any>) {
        _customFileSystemConfigs.addAll(customFileSystemConfigs)
    }

    /**
     * @param customFileSystemConfigs The settings for assigning a custom file system to a user
     *   profile. Permitted users can access this file system in Amazon SageMaker Studio.
     */
    public fun customFileSystemConfigs(customFileSystemConfigs: IResolvable) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs)
    }

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system
     *   operations.
     */
    public fun customPosixUserConfig(customPosixUserConfig: IResolvable) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig)
    }

    /**
     * @param customPosixUserConfig Details about the POSIX identity that is used for file system
     *   operations.
     */
    public fun customPosixUserConfig(
        customPosixUserConfig: CfnDomain.CustomPosixUserConfigProperty
    ) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig)
    }

    /**
     * @param defaultLandingUri The default experience that the user is directed to when accessing
     *   the domain. The supported values are:.
     * * `studio::` : Indicates that Studio is the default experience. This value can only be passed
     *   if `StudioWebPortal` is set to `ENABLED` .
     * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
     */
    public fun defaultLandingUri(defaultLandingUri: String) {
        cdkBuilder.defaultLandingUri(defaultLandingUri)
    }

    /** @param executionRole The execution role for the user. */
    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    /** @param jupyterLabAppSettings The settings for the JupyterLab application. */
    public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings)
    }

    /** @param jupyterLabAppSettings The settings for the JupyterLab application. */
    public fun jupyterLabAppSettings(
        jupyterLabAppSettings: CfnDomain.JupyterLabAppSettingsProperty
    ) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings)
    }

    /** @param jupyterServerAppSettings The Jupyter server's app settings. */
    public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param jupyterServerAppSettings The Jupyter server's app settings. */
    public fun jupyterServerAppSettings(
        jupyterServerAppSettings: CfnDomain.JupyterServerAppSettingsProperty
    ) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    /** @param kernelGatewayAppSettings The kernel gateway app settings. */
    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    /** @param kernelGatewayAppSettings The kernel gateway app settings. */
    public fun kernelGatewayAppSettings(
        kernelGatewayAppSettings: CfnDomain.KernelGatewayAppSettingsProperty
    ) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    /**
     * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway` app.
     */
    public fun rSessionAppSettings(rSessionAppSettings: IResolvable) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings)
    }

    /**
     * @param rSessionAppSettings A collection of settings that configure the `RSessionGateway` app.
     */
    public fun rSessionAppSettings(rSessionAppSettings: CfnDomain.RSessionAppSettingsProperty) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings)
    }

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction
     *   with the `RStudioServerPro` app.
     */
    public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
    }

    /**
     * @param rStudioServerProAppSettings A collection of settings that configure user interaction
     *   with the `RStudioServerPro` app.
     */
    public fun rStudioServerProAppSettings(
        rStudioServerProAppSettings: CfnDomain.RStudioServerProAppSettingsProperty
    ) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
    }

    /**
     * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that the
     *   domain uses for communication. Optional when the `CreateDomain.AppNetworkAccessType`
     *   parameter is set to `PublicInternetOnly` .
     *
     * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
     * specified as part of the `DefaultUserSettings` for the domain.
     *
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
     * Therefore, the number of security groups that you can specify is one less than the maximum
     * number shown.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that the
     *   domain uses for communication. Optional when the `CreateDomain.AppNetworkAccessType`
     *   parameter is set to `PublicInternetOnly` .
     *
     * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
     * specified as part of the `DefaultUserSettings` for the domain.
     *
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
     * Therefore, the number of security groups that you can specify is one less than the maximum
     * number shown.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks. */
    public fun sharingSettings(sharingSettings: IResolvable) {
        cdkBuilder.sharingSettings(sharingSettings)
    }

    /** @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks. */
    public fun sharingSettings(sharingSettings: CfnDomain.SharingSettingsProperty) {
        cdkBuilder.sharingSettings(sharingSettings)
    }

    /** @param spaceStorageSettings The storage settings for a private space. */
    public fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings)
    }

    /** @param spaceStorageSettings The storage settings for a private space. */
    public fun spaceStorageSettings(
        spaceStorageSettings: CfnDomain.DefaultSpaceStorageSettingsProperty
    ) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings)
    }

    /**
     * @param studioWebPortal Whether the user can access Studio. If this value is set to `DISABLED`
     *   , the user cannot access Studio, even if that is the default experience for the domain.
     */
    public fun studioWebPortal(studioWebPortal: String) {
        cdkBuilder.studioWebPortal(studioWebPortal)
    }

    public fun build(): CfnDomain.UserSettingsProperty {
        if (_customFileSystemConfigs.isNotEmpty())
            cdkBuilder.customFileSystemConfigs(_customFileSystemConfigs)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
