@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSpace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
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
 * .appLifecycleManagement(SpaceAppLifecycleManagementProperty.builder()
 * .idleSettings(SpaceIdleSettingsProperty.builder()
 * .idleTimeoutInMinutes(123)
 * .build())
 * .build())
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .customFileSystems(List.of(CustomFileSystemProperty.builder()
 * .efsFileSystem(EFSFileSystemProperty.builder()
 * .fileSystemId("fileSystemId")
 * .build())
 * .fSxLustreFileSystem(FSxLustreFileSystemProperty.builder()
 * .fileSystemId("fileSystemId")
 * .build())
 * .build()))
 * .jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty.builder()
 * .appLifecycleManagement(SpaceAppLifecycleManagementProperty.builder()
 * .idleSettings(SpaceIdleSettingsProperty.builder()
 * .idleTimeoutInMinutes(123)
 * .build())
 * .build())
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build())
 * .jupyterServerAppSettings(JupyterServerAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
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
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build())
 * .remoteAccess("remoteAccess")
 * .spaceManagedResources("spaceManagedResources")
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
public interface CfnSpaceProps {
  /**
   * The ID of the associated domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-domainid)
   */
  public fun domainId(): String

  /**
   * The collection of ownership settings for a space.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
   */
  public fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

  /**
   * The name of the space that appears in the Studio UI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacedisplayname)
   */
  public fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

  /**
   * The name of the space.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacename)
   */
  public fun spaceName(): String

  /**
   * A collection of space settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
   */
  public fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

  /**
   * A collection of space sharing settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
   */
  public fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSpaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainId The ID of the associated domain. 
     */
    public fun domainId(domainId: String)

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    public fun ownershipSettings(ownershipSettings: IResolvable)

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    public fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty)

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa2c12b0082df7e05745cd27d7c9fc6507a3eb201c0f055bd6764419379e319")
    public
        fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty.Builder.() -> Unit)

    /**
     * @param spaceDisplayName The name of the space that appears in the Studio UI.
     */
    public fun spaceDisplayName(spaceDisplayName: String)

    /**
     * @param spaceName The name of the space. 
     */
    public fun spaceName(spaceName: String)

    /**
     * @param spaceSettings A collection of space settings.
     */
    public fun spaceSettings(spaceSettings: IResolvable)

    /**
     * @param spaceSettings A collection of space settings.
     */
    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty)

    /**
     * @param spaceSettings A collection of space settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b528233f1f2ceb5c272d6151b164f4b92ec5f026267911de65c2d50b7e4583")
    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty.Builder.() -> Unit)

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    public fun spaceSharingSettings(spaceSharingSettings: IResolvable)

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    public fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty)

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01896c2fe6975306b642e7ad6d402c0c570b44022d117ad86d226d4067f16f33")
    public
        fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnSpaceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnSpaceProps.builder()

    /**
     * @param domainId The ID of the associated domain. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    override fun ownershipSettings(ownershipSettings: IResolvable) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    override fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(CfnSpace.OwnershipSettingsProperty.Companion::unwrap))
    }

    /**
     * @param ownershipSettings The collection of ownership settings for a space.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa2c12b0082df7e05745cd27d7c9fc6507a3eb201c0f055bd6764419379e319")
    override
        fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty.Builder.() -> Unit):
        Unit = ownershipSettings(CfnSpace.OwnershipSettingsProperty(ownershipSettings))

    /**
     * @param spaceDisplayName The name of the space that appears in the Studio UI.
     */
    override fun spaceDisplayName(spaceDisplayName: String) {
      cdkBuilder.spaceDisplayName(spaceDisplayName)
    }

    /**
     * @param spaceName The name of the space. 
     */
    override fun spaceName(spaceName: String) {
      cdkBuilder.spaceName(spaceName)
    }

    /**
     * @param spaceSettings A collection of space settings.
     */
    override fun spaceSettings(spaceSettings: IResolvable) {
      cdkBuilder.spaceSettings(spaceSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param spaceSettings A collection of space settings.
     */
    override fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty) {
      cdkBuilder.spaceSettings(spaceSettings.let(CfnSpace.SpaceSettingsProperty.Companion::unwrap))
    }

    /**
     * @param spaceSettings A collection of space settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b528233f1f2ceb5c272d6151b164f4b92ec5f026267911de65c2d50b7e4583")
    override fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty.Builder.() -> Unit):
        Unit = spaceSettings(CfnSpace.SpaceSettingsProperty(spaceSettings))

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    override fun spaceSharingSettings(spaceSharingSettings: IResolvable) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    override fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(CfnSpace.SpaceSharingSettingsProperty.Companion::unwrap))
    }

    /**
     * @param spaceSharingSettings A collection of space sharing settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01896c2fe6975306b642e7ad6d402c0c570b44022d117ad86d226d4067f16f33")
    override
        fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty.Builder.() -> Unit):
        Unit = spaceSharingSettings(CfnSpace.SpaceSharingSettingsProperty(spaceSharingSettings))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpaceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpaceProps,
  ) : CdkObject(cdkObject),
      CfnSpaceProps {
    /**
     * The ID of the associated domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-domainid)
     */
    override fun domainId(): String = unwrap(this).getDomainId()

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     */
    override fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

    /**
     * The name of the space that appears in the Studio UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacedisplayname)
     */
    override fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

    /**
     * The name of the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacename)
     */
    override fun spaceName(): String = unwrap(this).getSpaceName()

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     */
    override fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     */
    override fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSpaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpaceProps):
        CfnSpaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSpaceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSpaceProps):
        software.amazon.awscdk.services.sagemaker.CfnSpaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnSpaceProps
  }
}
