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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.amazon.awscdk.services.sagemaker.CfnSpaceProps

/**
 * Properties for defining a `CfnSpace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnSpaceProps cfnSpaceProps = CfnSpaceProps.builder()
 * .domainId("domainId")
 * .spaceName("spaceName")
 * // the properties below are optional
 * .ownershipSettings(OwnershipSettingsProperty.builder()
 * .ownerUserProfileName("ownerUserProfileName")
 * .build())
 * .spaceDisplayName("spaceDisplayName")
 * .spaceSettings(SpaceSettingsProperty.builder()
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
 * .build())
 * .spaceSharingSettings(SpaceSharingSettingsProperty.builder()
 * .sharingType("sharingType")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html)
 */
@CdkDslMarker
public class CfnSpacePropsDsl {
    private val cdkBuilder: CfnSpaceProps.Builder = CfnSpaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param domainId The ID of the associated domain. */
    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    /** @param ownershipSettings The collection of ownership settings for a space. */
    public fun ownershipSettings(ownershipSettings: IResolvable) {
        cdkBuilder.ownershipSettings(ownershipSettings)
    }

    /** @param ownershipSettings The collection of ownership settings for a space. */
    public fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty) {
        cdkBuilder.ownershipSettings(ownershipSettings)
    }

    /** @param spaceDisplayName The name of the space that appears in the Studio UI. */
    public fun spaceDisplayName(spaceDisplayName: String) {
        cdkBuilder.spaceDisplayName(spaceDisplayName)
    }

    /** @param spaceName The name of the space. */
    public fun spaceName(spaceName: String) {
        cdkBuilder.spaceName(spaceName)
    }

    /** @param spaceSettings A collection of space settings. */
    public fun spaceSettings(spaceSettings: IResolvable) {
        cdkBuilder.spaceSettings(spaceSettings)
    }

    /** @param spaceSettings A collection of space settings. */
    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty) {
        cdkBuilder.spaceSettings(spaceSettings)
    }

    /** @param spaceSharingSettings A collection of space sharing settings. */
    public fun spaceSharingSettings(spaceSharingSettings: IResolvable) {
        cdkBuilder.spaceSharingSettings(spaceSharingSettings)
    }

    /** @param spaceSharingSettings A collection of space sharing settings. */
    public fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty) {
        cdkBuilder.spaceSharingSettings(spaceSharingSettings)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSpaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
