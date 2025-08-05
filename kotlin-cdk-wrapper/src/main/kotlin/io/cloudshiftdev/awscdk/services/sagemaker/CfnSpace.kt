@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a private space or a space used for real time collaboration in a domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnSpace cfnSpace = CfnSpace.Builder.create(this, "MyCfnSpace")
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
public open class CfnSpace(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSpaceProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnSpace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSpaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSpaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSpaceProps(props)
  )

  /**
   * The space's Amazon Resource Name (ARN).
   */
  public open fun attrSpaceArn(): String = unwrap(this).getAttrSpaceArn()

  /**
   * Returns the URL of the space.
   *
   * If the space is created with AWS IAM Identity Center (Successor to AWS Single Sign-On)
   * authentication, users can navigate to the URL after appending the respective redirect parameter
   * for the application type to be federated through AWS IAM Identity Center.
   *
   * The following application types are supported:
   *
   * * Studio Classic: `&amp;redirect=JupyterServer`
   * * JupyterLab: `&amp;redirect=JupyterLab`
   * * Code Editor, based on Code-OSS, Visual Studio Code - Open Source: `&amp;redirect=CodeEditor`
   */
  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  /**
   * The ID of the associated domain.
   */
  public open fun domainId(): String = unwrap(this).getDomainId()

  /**
   * The ID of the associated domain.
   */
  public open fun domainId(`value`: String) {
    unwrap(this).setDomainId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The collection of ownership settings for a space.
   */
  public open fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

  /**
   * The collection of ownership settings for a space.
   */
  public open fun ownershipSettings(`value`: IResolvable) {
    unwrap(this).setOwnershipSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The collection of ownership settings for a space.
   */
  public open fun ownershipSettings(`value`: OwnershipSettingsProperty) {
    unwrap(this).setOwnershipSettings(`value`.let(OwnershipSettingsProperty.Companion::unwrap))
  }

  /**
   * The collection of ownership settings for a space.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414955a62dc89caa13b05432a83ce71f310c3c4b25e469f78d8122ecaa62500f")
  public open fun ownershipSettings(`value`: OwnershipSettingsProperty.Builder.() -> Unit): Unit =
      ownershipSettings(OwnershipSettingsProperty(`value`))

  /**
   * The name of the space that appears in the Studio UI.
   */
  public open fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

  /**
   * The name of the space that appears in the Studio UI.
   */
  public open fun spaceDisplayName(`value`: String) {
    unwrap(this).setSpaceDisplayName(`value`)
  }

  /**
   * The name of the space.
   */
  public open fun spaceName(): String = unwrap(this).getSpaceName()

  /**
   * The name of the space.
   */
  public open fun spaceName(`value`: String) {
    unwrap(this).setSpaceName(`value`)
  }

  /**
   * A collection of space settings.
   */
  public open fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

  /**
   * A collection of space settings.
   */
  public open fun spaceSettings(`value`: IResolvable) {
    unwrap(this).setSpaceSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of space settings.
   */
  public open fun spaceSettings(`value`: SpaceSettingsProperty) {
    unwrap(this).setSpaceSettings(`value`.let(SpaceSettingsProperty.Companion::unwrap))
  }

  /**
   * A collection of space settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b47122cae913c7e6f89289aaa0478bf14ce71bff7d66d35fa5fe3045b9c67a6e")
  public open fun spaceSettings(`value`: SpaceSettingsProperty.Builder.() -> Unit): Unit =
      spaceSettings(SpaceSettingsProperty(`value`))

  /**
   * A collection of space sharing settings.
   */
  public open fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

  /**
   * A collection of space sharing settings.
   */
  public open fun spaceSharingSettings(`value`: IResolvable) {
    unwrap(this).setSpaceSharingSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of space sharing settings.
   */
  public open fun spaceSharingSettings(`value`: SpaceSharingSettingsProperty) {
    unwrap(this).setSpaceSharingSettings(`value`.let(SpaceSharingSettingsProperty.Companion::unwrap))
  }

  /**
   * A collection of space sharing settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2677ff81232dc5a8f9e767a944de20c22cfde07247c936eaa35f8a8fb04b06b")
  public open fun spaceSharingSettings(`value`: SpaceSharingSettingsProperty.Builder.() -> Unit):
      Unit = spaceSharingSettings(SpaceSharingSettingsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnSpace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the associated domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-domainid)
     * @param domainId The ID of the associated domain. 
     */
    public fun domainId(domainId: String)

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    public fun ownershipSettings(ownershipSettings: IResolvable)

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    public fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty)

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acff03d049c60e7437e3b8b96be6700c9699cbb5404ff8c2ee976cd2f854490a")
    public fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty.Builder.() -> Unit)

    /**
     * The name of the space that appears in the Studio UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacedisplayname)
     * @param spaceDisplayName The name of the space that appears in the Studio UI. 
     */
    public fun spaceDisplayName(spaceDisplayName: String)

    /**
     * The name of the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacename)
     * @param spaceName The name of the space. 
     */
    public fun spaceName(spaceName: String)

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    public fun spaceSettings(spaceSettings: IResolvable)

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    public fun spaceSettings(spaceSettings: SpaceSettingsProperty)

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6634b88a1ac01ba70589bef8fcb5e7beef54ea21ef0e569ec43440c5c2645d4e")
    public fun spaceSettings(spaceSettings: SpaceSettingsProperty.Builder.() -> Unit)

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    public fun spaceSharingSettings(spaceSharingSettings: IResolvable)

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    public fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty)

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08def4189b469d2edc8bfea2b451f8f7a9ad8bd03172f1f72dbbf334be9460a7")
    public
        fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnSpace.Builder =
        software.amazon.awscdk.services.sagemaker.CfnSpace.Builder.create(scope, id)

    /**
     * The ID of the associated domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-domainid)
     * @param domainId The ID of the associated domain. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    override fun ownershipSettings(ownershipSettings: IResolvable) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    override fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(OwnershipSettingsProperty.Companion::unwrap))
    }

    /**
     * The collection of ownership settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-ownershipsettings)
     * @param ownershipSettings The collection of ownership settings for a space. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("acff03d049c60e7437e3b8b96be6700c9699cbb5404ff8c2ee976cd2f854490a")
    override fun ownershipSettings(ownershipSettings: OwnershipSettingsProperty.Builder.() -> Unit):
        Unit = ownershipSettings(OwnershipSettingsProperty(ownershipSettings))

    /**
     * The name of the space that appears in the Studio UI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacedisplayname)
     * @param spaceDisplayName The name of the space that appears in the Studio UI. 
     */
    override fun spaceDisplayName(spaceDisplayName: String) {
      cdkBuilder.spaceDisplayName(spaceDisplayName)
    }

    /**
     * The name of the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacename)
     * @param spaceName The name of the space. 
     */
    override fun spaceName(spaceName: String) {
      cdkBuilder.spaceName(spaceName)
    }

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    override fun spaceSettings(spaceSettings: IResolvable) {
      cdkBuilder.spaceSettings(spaceSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    override fun spaceSettings(spaceSettings: SpaceSettingsProperty) {
      cdkBuilder.spaceSettings(spaceSettings.let(SpaceSettingsProperty.Companion::unwrap))
    }

    /**
     * A collection of space settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesettings)
     * @param spaceSettings A collection of space settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6634b88a1ac01ba70589bef8fcb5e7beef54ea21ef0e569ec43440c5c2645d4e")
    override fun spaceSettings(spaceSettings: SpaceSettingsProperty.Builder.() -> Unit): Unit =
        spaceSettings(SpaceSettingsProperty(spaceSettings))

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    override fun spaceSharingSettings(spaceSharingSettings: IResolvable) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    override fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(SpaceSharingSettingsProperty.Companion::unwrap))
    }

    /**
     * A collection of space sharing settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-spacesharingsettings)
     * @param spaceSharingSettings A collection of space sharing settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("08def4189b469d2edc8bfea2b451f8f7a9ad8bd03172f1f72dbbf334be9460a7")
    override
        fun spaceSharingSettings(spaceSharingSettings: SpaceSharingSettingsProperty.Builder.() -> Unit):
        Unit = spaceSharingSettings(SpaceSharingSettingsProperty(spaceSharingSettings))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-space.html#cfn-sagemaker-space-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnSpace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSpace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSpace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace): CfnSpace =
        CfnSpace(cdkObject)

    internal fun unwrap(wrapped: CfnSpace): software.amazon.awscdk.services.sagemaker.CfnSpace =
        wrapped.cdkObject as software.amazon.awscdk.services.sagemaker.CfnSpace
  }

  /**
   * A Git repository that SageMaker AI automatically displays to users for cloning in the
   * JupyterServer application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
   * .repositoryUrl("repositoryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-coderepository.html)
   */
  public interface CodeRepositoryProperty {
    /**
     * The URL of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-coderepository.html#cfn-sagemaker-space-coderepository-repositoryurl)
     */
    public fun repositoryUrl(): String

    /**
     * A builder for [CodeRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryUrl The URL of the Git repository. 
       */
      public fun repositoryUrl(repositoryUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty.builder()

      /**
       * @param repositoryUrl The URL of the Git repository. 
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty,
    ) : CdkObject(cdkObject),
        CodeRepositoryProperty {
      /**
       * The URL of the Git repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-coderepository.html#cfn-sagemaker-space-coderepository-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty):
          CodeRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeRepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.CodeRepositoryProperty
    }
  }

  /**
   * A file system, created by you, that you assign to a user profile or space for an Amazon
   * SageMaker AI Domain.
   *
   * Permitted users can access this file system in Amazon SageMaker AI Studio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomFileSystemProperty customFileSystemProperty = CustomFileSystemProperty.builder()
   * .efsFileSystem(EFSFileSystemProperty.builder()
   * .fileSystemId("fileSystemId")
   * .build())
   * .fSxLustreFileSystem(FSxLustreFileSystemProperty.builder()
   * .fileSystemId("fileSystemId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html)
   */
  public interface CustomFileSystemProperty {
    /**
     * A custom file system in Amazon EFS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html#cfn-sagemaker-space-customfilesystem-efsfilesystem)
     */
    public fun efsFileSystem(): Any? = unwrap(this).getEfsFileSystem()

    /**
     * A custom file system in Amazon FSx for Lustre.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html#cfn-sagemaker-space-customfilesystem-fsxlustrefilesystem)
     */
    public fun fSxLustreFileSystem(): Any? = unwrap(this).getFSxLustreFileSystem()

    /**
     * A builder for [CustomFileSystemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      public fun efsFileSystem(efsFileSystem: IResolvable)

      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      public fun efsFileSystem(efsFileSystem: EFSFileSystemProperty)

      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("725ca5e0d45e073f9dc82a5b9c4d49c124c28a0ae1d82214e51e13314304bc14")
      public fun efsFileSystem(efsFileSystem: EFSFileSystemProperty.Builder.() -> Unit)

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      public fun fSxLustreFileSystem(fSxLustreFileSystem: IResolvable)

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      public fun fSxLustreFileSystem(fSxLustreFileSystem: FSxLustreFileSystemProperty)

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736cc355198e7171f2fccd5629f76db1a7b63f01f1d0f3b4627e5b5d620934e4")
      public
          fun fSxLustreFileSystem(fSxLustreFileSystem: FSxLustreFileSystemProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty.builder()

      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      override fun efsFileSystem(efsFileSystem: IResolvable) {
        cdkBuilder.efsFileSystem(efsFileSystem.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      override fun efsFileSystem(efsFileSystem: EFSFileSystemProperty) {
        cdkBuilder.efsFileSystem(efsFileSystem.let(EFSFileSystemProperty.Companion::unwrap))
      }

      /**
       * @param efsFileSystem A custom file system in Amazon EFS.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("725ca5e0d45e073f9dc82a5b9c4d49c124c28a0ae1d82214e51e13314304bc14")
      override fun efsFileSystem(efsFileSystem: EFSFileSystemProperty.Builder.() -> Unit): Unit =
          efsFileSystem(EFSFileSystemProperty(efsFileSystem))

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      override fun fSxLustreFileSystem(fSxLustreFileSystem: IResolvable) {
        cdkBuilder.fSxLustreFileSystem(fSxLustreFileSystem.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      override fun fSxLustreFileSystem(fSxLustreFileSystem: FSxLustreFileSystemProperty) {
        cdkBuilder.fSxLustreFileSystem(fSxLustreFileSystem.let(FSxLustreFileSystemProperty.Companion::unwrap))
      }

      /**
       * @param fSxLustreFileSystem A custom file system in Amazon FSx for Lustre.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("736cc355198e7171f2fccd5629f76db1a7b63f01f1d0f3b4627e5b5d620934e4")
      override
          fun fSxLustreFileSystem(fSxLustreFileSystem: FSxLustreFileSystemProperty.Builder.() -> Unit):
          Unit = fSxLustreFileSystem(FSxLustreFileSystemProperty(fSxLustreFileSystem))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty,
    ) : CdkObject(cdkObject),
        CustomFileSystemProperty {
      /**
       * A custom file system in Amazon EFS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html#cfn-sagemaker-space-customfilesystem-efsfilesystem)
       */
      override fun efsFileSystem(): Any? = unwrap(this).getEfsFileSystem()

      /**
       * A custom file system in Amazon FSx for Lustre.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customfilesystem.html#cfn-sagemaker-space-customfilesystem-fsxlustrefilesystem)
       */
      override fun fSxLustreFileSystem(): Any? = unwrap(this).getFSxLustreFileSystem()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomFileSystemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty):
          CustomFileSystemProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomFileSystemProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomFileSystemProperty
    }
  }

  /**
   * A custom SageMaker AI image.
   *
   * For more information, see [Bring your own SageMaker AI
   * image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomImageProperty customImageProperty = CustomImageProperty.builder()
   * .appImageConfigName("appImageConfigName")
   * .imageName("imageName")
   * // the properties below are optional
   * .imageVersionNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html)
   */
  public interface CustomImageProperty {
    /**
     * The name of the AppImageConfig.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-appimageconfigname)
     */
    public fun appImageConfigName(): String

    /**
     * The name of the CustomImage.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-imagename)
     */
    public fun imageName(): String

    /**
     * The version number of the CustomImage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-imageversionnumber)
     */
    public fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()

    /**
     * A builder for [CustomImageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appImageConfigName The name of the AppImageConfig. 
       */
      public fun appImageConfigName(appImageConfigName: String)

      /**
       * @param imageName The name of the CustomImage. 
       * Must be unique to your account.
       */
      public fun imageName(imageName: String)

      /**
       * @param imageVersionNumber The version number of the CustomImage.
       */
      public fun imageVersionNumber(imageVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty.builder()

      /**
       * @param appImageConfigName The name of the AppImageConfig. 
       */
      override fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
      }

      /**
       * @param imageName The name of the CustomImage. 
       * Must be unique to your account.
       */
      override fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
      }

      /**
       * @param imageVersionNumber The version number of the CustomImage.
       */
      override fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty,
    ) : CdkObject(cdkObject),
        CustomImageProperty {
      /**
       * The name of the AppImageConfig.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-appimageconfigname)
       */
      override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

      /**
       * The name of the CustomImage.
       *
       * Must be unique to your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-imagename)
       */
      override fun imageName(): String = unwrap(this).getImageName()

      /**
       * The version number of the CustomImage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-customimage.html#cfn-sagemaker-space-customimage-imageversionnumber)
       */
      override fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty):
          CustomImageProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomImageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.CustomImageProperty
    }
  }

  /**
   * A file system, created by you in Amazon EFS, that you assign to a user profile or space for an
   * Amazon SageMaker AI Domain.
   *
   * Permitted users can access this file system in Amazon SageMaker AI Studio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EFSFileSystemProperty eFSFileSystemProperty = EFSFileSystemProperty.builder()
   * .fileSystemId("fileSystemId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-efsfilesystem.html)
   */
  public interface EFSFileSystemProperty {
    /**
     * The ID of your Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-efsfilesystem.html#cfn-sagemaker-space-efsfilesystem-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * A builder for [EFSFileSystemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      public fun fileSystemId(fileSystemId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty.builder()

      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty,
    ) : CdkObject(cdkObject),
        EFSFileSystemProperty {
      /**
       * The ID of your Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-efsfilesystem.html#cfn-sagemaker-space-efsfilesystem-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EFSFileSystemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty):
          EFSFileSystemProperty = CdkObjectWrappers.wrap(cdkObject) as? EFSFileSystemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.EFSFileSystemProperty
    }
  }

  /**
   * A collection of EBS storage settings that apply to both private and shared spaces.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EbsStorageSettingsProperty ebsStorageSettingsProperty = EbsStorageSettingsProperty.builder()
   * .ebsVolumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ebsstoragesettings.html)
   */
  public interface EbsStorageSettingsProperty {
    /**
     * The size of an EBS storage volume for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ebsstoragesettings.html#cfn-sagemaker-space-ebsstoragesettings-ebsvolumesizeingb)
     */
    public fun ebsVolumeSizeInGb(): Number

    /**
     * A builder for [EbsStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsVolumeSizeInGb The size of an EBS storage volume for a space. 
       */
      public fun ebsVolumeSizeInGb(ebsVolumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty.builder()

      /**
       * @param ebsVolumeSizeInGb The size of an EBS storage volume for a space. 
       */
      override fun ebsVolumeSizeInGb(ebsVolumeSizeInGb: Number) {
        cdkBuilder.ebsVolumeSizeInGb(ebsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty,
    ) : CdkObject(cdkObject),
        EbsStorageSettingsProperty {
      /**
       * The size of an EBS storage volume for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ebsstoragesettings.html#cfn-sagemaker-space-ebsstoragesettings-ebsvolumesizeingb)
       */
      override fun ebsVolumeSizeInGb(): Number = unwrap(this).getEbsVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty):
          EbsStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EbsStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.EbsStorageSettingsProperty
    }
  }

  /**
   * A custom file system in Amazon FSx for Lustre.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * FSxLustreFileSystemProperty fSxLustreFileSystemProperty = FSxLustreFileSystemProperty.builder()
   * .fileSystemId("fileSystemId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-fsxlustrefilesystem.html)
   */
  public interface FSxLustreFileSystemProperty {
    /**
     * Amazon FSx for Lustre file system ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-fsxlustrefilesystem.html#cfn-sagemaker-space-fsxlustrefilesystem-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * A builder for [FSxLustreFileSystemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId Amazon FSx for Lustre file system ID. 
       */
      public fun fileSystemId(fileSystemId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty.builder()

      /**
       * @param fileSystemId Amazon FSx for Lustre file system ID. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty,
    ) : CdkObject(cdkObject),
        FSxLustreFileSystemProperty {
      /**
       * Amazon FSx for Lustre file system ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-fsxlustrefilesystem.html#cfn-sagemaker-space-fsxlustrefilesystem-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FSxLustreFileSystemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty):
          FSxLustreFileSystemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FSxLustreFileSystemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FSxLustreFileSystemProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.FSxLustreFileSystemProperty
    }
  }

  /**
   * The JupyterServer app settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * JupyterServerAppSettingsProperty jupyterServerAppSettingsProperty =
   * JupyterServerAppSettingsProperty.builder()
   * .defaultResourceSpec(ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html)
   */
  public interface JupyterServerAppSettingsProperty {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker AI
     * image used by the JupyterServer app.
     *
     * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html#cfn-sagemaker-space-jupyterserverappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the
     * JupyterServerApp.
     *
     * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
     *
     *
     * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html#cfn-sagemaker-space-jupyterserverappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [JupyterServerAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc1e1750215a44aee76b455f21d67ef6ab019a86d8976d254c0ff18df7dcf342")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the JupyterServerApp.
       * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the JupyterServerApp.
       * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty.builder()

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the JupyterServer app.
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc1e1750215a44aee76b455f21d67ef6ab019a86d8976d254c0ff18df7dcf342")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the JupyterServerApp.
       * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the JupyterServerApp.
       * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty,
    ) : CdkObject(cdkObject),
        JupyterServerAppSettingsProperty {
      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker AI
       * image used by the JupyterServer app.
       *
       * If you use the `LifecycleConfigArns` parameter, then this parameter is also required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html#cfn-sagemaker-space-jupyterserverappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the
       * JupyterServerApp.
       *
       * If you use this parameter, the `DefaultResourceSpec` parameter is also required.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-jupyterserverappsettings.html#cfn-sagemaker-space-jupyterserverappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterServerAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JupyterServerAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.JupyterServerAppSettingsProperty
    }
  }

  /**
   * The KernelGateway app settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * KernelGatewayAppSettingsProperty kernelGatewayAppSettingsProperty =
   * KernelGatewayAppSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html)
   */
  public interface KernelGatewayAppSettingsProperty {
    /**
     * A list of custom SageMaker AI images that are configured to run as a KernelGateway app.
     *
     * The maximum number of custom images are as follows.
     *
     * * On a domain level: 200
     * * On a space level: 5
     * * On a user profile level: 5
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker AI
     * image used by the KernelGateway app.
     *
     *
     * The Amazon SageMaker AI Studio UI does not use the default instance type value set here. The
     * default instance type set here is used when Apps are created using the AWS CLI or AWS
     * CloudFormation and the instance type parameter value is not passed.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user
     * profile or domain.
     *
     *
     * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [KernelGatewayAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b722b7492eff2a37138d40822cae857b7cd89725c1db0e9ebb4795dee8b85261")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the the user profile or domain.
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the the user profile or domain.
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty.builder()

      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customImages A list of custom SageMaker AI images that are configured to run as a
       * KernelGateway app.
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker AI image used by the KernelGateway app.
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b722b7492eff2a37138d40822cae857b7cd89725c1db0e9ebb4795dee8b85261")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the the user profile or domain.
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Lifecycle Configurations
       * attached to the the user profile or domain.
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty,
    ) : CdkObject(cdkObject),
        KernelGatewayAppSettingsProperty {
      /**
       * A list of custom SageMaker AI images that are configured to run as a KernelGateway app.
       *
       * The maximum number of custom images are as follows.
       *
       * * On a domain level: 200
       * * On a space level: 5
       * * On a user profile level: 5
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker AI
       * image used by the KernelGateway app.
       *
       *
       * The Amazon SageMaker AI Studio UI does not use the default instance type value set here.
       * The default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user
       * profile or domain.
       *
       *
       * To remove a Lifecycle Config, you must set `LifecycleConfigArns` to an empty list.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-kernelgatewayappsettings.html#cfn-sagemaker-space-kernelgatewayappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KernelGatewayAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.KernelGatewayAppSettingsProperty
    }
  }

  /**
   * The collection of ownership settings for a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * OwnershipSettingsProperty ownershipSettingsProperty = OwnershipSettingsProperty.builder()
   * .ownerUserProfileName("ownerUserProfileName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ownershipsettings.html)
   */
  public interface OwnershipSettingsProperty {
    /**
     * The user profile who is the owner of the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ownershipsettings.html#cfn-sagemaker-space-ownershipsettings-owneruserprofilename)
     */
    public fun ownerUserProfileName(): String

    /**
     * A builder for [OwnershipSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ownerUserProfileName The user profile who is the owner of the space. 
       */
      public fun ownerUserProfileName(ownerUserProfileName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty.builder()

      /**
       * @param ownerUserProfileName The user profile who is the owner of the space. 
       */
      override fun ownerUserProfileName(ownerUserProfileName: String) {
        cdkBuilder.ownerUserProfileName(ownerUserProfileName)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty,
    ) : CdkObject(cdkObject),
        OwnershipSettingsProperty {
      /**
       * The user profile who is the owner of the space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-ownershipsettings.html#cfn-sagemaker-space-ownershipsettings-owneruserprofilename)
       */
      override fun ownerUserProfileName(): String = unwrap(this).getOwnerUserProfileName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnershipSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty):
          OwnershipSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OwnershipSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnershipSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.OwnershipSettingsProperty
    }
  }

  /**
   * Specifies the ARN's of a SageMaker AI image and SageMaker AI image version, and the instance
   * type that the version runs on.
   *
   *
   * When both `SageMakerImageVersionArn` and `SageMakerImageArn` are passed,
   * `SageMakerImageVersionArn` is used. Any updates to `SageMakerImageArn` will not take effect if
   * `SageMakerImageVersionArn` already exists in the `ResourceSpec` because `SageMakerImageVersionArn`
   * always takes precedence. To clear the value set for `SageMakerImageVersionArn` , pass `None` as
   * the value.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .lifecycleConfigArn("lifecycleConfigArn")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html)
   */
  public interface ResourceSpecProperty {
    /**
     * The instance type that the image version runs on.
     *
     *
     * *JupyterServer apps* only support the `system` value.
     *
     * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
     * apps also support all other values for available instance types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-lifecycleconfigarn)
     */
    public fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

    /**
     * The ARN of the SageMaker AI image that the image version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-sagemakerimagearn)
     */
    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    /**
     * The ARN of the image version created on the instance.
     *
     * To clear the value set for `SageMakerImageVersionArn` , pass `None` as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-sagemakerimageversionarn)
     */
    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    /**
     * A builder for [ResourceSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration
       * attached to the Resource.
       */
      public fun lifecycleConfigArn(lifecycleConfigArn: String)

      /**
       * @param sageMakerImageArn The ARN of the SageMaker AI image that the image version belongs
       * to.
       */
      public fun sageMakerImageArn(sageMakerImageArn: String)

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       * To clear the value set for `SageMakerImageVersionArn` , pass `None` as the value.
       */
      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty.builder()

      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration
       * attached to the Resource.
       */
      override fun lifecycleConfigArn(lifecycleConfigArn: String) {
        cdkBuilder.lifecycleConfigArn(lifecycleConfigArn)
      }

      /**
       * @param sageMakerImageArn The ARN of the SageMaker AI image that the image version belongs
       * to.
       */
      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       * To clear the value set for `SageMakerImageVersionArn` , pass `None` as the value.
       */
      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty,
    ) : CdkObject(cdkObject),
        ResourceSpecProperty {
      /**
       * The instance type that the image version runs on.
       *
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-lifecycleconfigarn)
       */
      override fun lifecycleConfigArn(): String? = unwrap(this).getLifecycleConfigArn()

      /**
       * The ARN of the SageMaker AI image that the image version belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-sagemakerimagearn)
       */
      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      /**
       * The ARN of the image version created on the instance.
       *
       * To clear the value set for `SageMakerImageVersionArn` , pass `None` as the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html#cfn-sagemaker-space-resourcespec-sagemakerimageversionarn)
       */
      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty):
          ResourceSpecProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceSpecProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.ResourceSpecProperty
    }
  }

  /**
   * Settings that are used to configure and manage the lifecycle of Amazon SageMaker Studio
   * applications in a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceAppLifecycleManagementProperty spaceAppLifecycleManagementProperty =
   * SpaceAppLifecycleManagementProperty.builder()
   * .idleSettings(SpaceIdleSettingsProperty.builder()
   * .idleTimeoutInMinutes(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceapplifecyclemanagement.html)
   */
  public interface SpaceAppLifecycleManagementProperty {
    /**
     * Settings related to idle shutdown of Studio applications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceapplifecyclemanagement.html#cfn-sagemaker-space-spaceapplifecyclemanagement-idlesettings)
     */
    public fun idleSettings(): Any? = unwrap(this).getIdleSettings()

    /**
     * A builder for [SpaceAppLifecycleManagementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      public fun idleSettings(idleSettings: IResolvable)

      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      public fun idleSettings(idleSettings: SpaceIdleSettingsProperty)

      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d54a7d2926688d762728494544840a99ea889157e195a31f9a2c117351220009")
      public fun idleSettings(idleSettings: SpaceIdleSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty.builder()

      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      override fun idleSettings(idleSettings: IResolvable) {
        cdkBuilder.idleSettings(idleSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      override fun idleSettings(idleSettings: SpaceIdleSettingsProperty) {
        cdkBuilder.idleSettings(idleSettings.let(SpaceIdleSettingsProperty.Companion::unwrap))
      }

      /**
       * @param idleSettings Settings related to idle shutdown of Studio applications.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d54a7d2926688d762728494544840a99ea889157e195a31f9a2c117351220009")
      override fun idleSettings(idleSettings: SpaceIdleSettingsProperty.Builder.() -> Unit): Unit =
          idleSettings(SpaceIdleSettingsProperty(idleSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty,
    ) : CdkObject(cdkObject),
        SpaceAppLifecycleManagementProperty {
      /**
       * Settings related to idle shutdown of Studio applications.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceapplifecyclemanagement.html#cfn-sagemaker-space-spaceapplifecyclemanagement-idlesettings)
       */
      override fun idleSettings(): Any? = unwrap(this).getIdleSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpaceAppLifecycleManagementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty):
          SpaceAppLifecycleManagementProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceAppLifecycleManagementProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceAppLifecycleManagementProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceAppLifecycleManagementProperty
    }
  }

  /**
   * The application settings for a Code Editor space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceCodeEditorAppSettingsProperty spaceCodeEditorAppSettingsProperty =
   * SpaceCodeEditorAppSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html)
   */
  public interface SpaceCodeEditorAppSettingsProperty {
    /**
     * Settings that are used to configure and manage the lifecycle of CodeEditor applications in a
     * space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html#cfn-sagemaker-space-spacecodeeditorappsettings-applifecyclemanagement)
     */
    public fun appLifecycleManagement(): Any? = unwrap(this).getAppLifecycleManagement()

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html#cfn-sagemaker-space-spacecodeeditorappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [SpaceCodeEditorAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      public fun appLifecycleManagement(appLifecycleManagement: IResolvable)

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      public fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty)

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("642495c09a97994a01af4a8e9e501b4af10ed75adea07f25ef529a19cee17da0")
      public
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty.Builder.() -> Unit)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65b5eb6b456a89a31e6a1c4f192aec82d615d1889ad6ceed9c477f7052f28caf")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty.builder()

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      override fun appLifecycleManagement(appLifecycleManagement: IResolvable) {
        cdkBuilder.appLifecycleManagement(appLifecycleManagement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      override
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty) {
        cdkBuilder.appLifecycleManagement(appLifecycleManagement.let(SpaceAppLifecycleManagementProperty.Companion::unwrap))
      }

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of CodeEditor applications in a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("642495c09a97994a01af4a8e9e501b4af10ed75adea07f25ef529a19cee17da0")
      override
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty.Builder.() -> Unit):
          Unit = appLifecycleManagement(SpaceAppLifecycleManagementProperty(appLifecycleManagement))

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65b5eb6b456a89a31e6a1c4f192aec82d615d1889ad6ceed9c477f7052f28caf")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceCodeEditorAppSettingsProperty {
      /**
       * Settings that are used to configure and manage the lifecycle of CodeEditor applications in
       * a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html#cfn-sagemaker-space-spacecodeeditorappsettings-applifecyclemanagement)
       */
      override fun appLifecycleManagement(): Any? = unwrap(this).getAppLifecycleManagement()

      /**
       * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
       * that the version runs on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html#cfn-sagemaker-space-spacecodeeditorappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpaceCodeEditorAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty):
          SpaceCodeEditorAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceCodeEditorAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceCodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceCodeEditorAppSettingsProperty
    }
  }

  /**
   * Settings related to idle shutdown of Studio applications in a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceIdleSettingsProperty spaceIdleSettingsProperty = SpaceIdleSettingsProperty.builder()
   * .idleTimeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceidlesettings.html)
   */
  public interface SpaceIdleSettingsProperty {
    /**
     * The time that SageMaker waits after the application becomes idle before shutting it down.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceidlesettings.html#cfn-sagemaker-space-spaceidlesettings-idletimeoutinminutes)
     */
    public fun idleTimeoutInMinutes(): Number? = unwrap(this).getIdleTimeoutInMinutes()

    /**
     * A builder for [SpaceIdleSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleTimeoutInMinutes The time that SageMaker waits after the application becomes
       * idle before shutting it down.
       */
      public fun idleTimeoutInMinutes(idleTimeoutInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty.builder()

      /**
       * @param idleTimeoutInMinutes The time that SageMaker waits after the application becomes
       * idle before shutting it down.
       */
      override fun idleTimeoutInMinutes(idleTimeoutInMinutes: Number) {
        cdkBuilder.idleTimeoutInMinutes(idleTimeoutInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceIdleSettingsProperty {
      /**
       * The time that SageMaker waits after the application becomes idle before shutting it down.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spaceidlesettings.html#cfn-sagemaker-space-spaceidlesettings-idletimeoutinminutes)
       */
      override fun idleTimeoutInMinutes(): Number? = unwrap(this).getIdleTimeoutInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceIdleSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty):
          SpaceIdleSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceIdleSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceIdleSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceIdleSettingsProperty
    }
  }

  /**
   * The settings for the JupyterLab application within a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceJupyterLabAppSettingsProperty spaceJupyterLabAppSettingsProperty =
   * SpaceJupyterLabAppSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html)
   */
  public interface SpaceJupyterLabAppSettingsProperty {
    /**
     * Settings that are used to configure and manage the lifecycle of JupyterLab applications in a
     * space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-applifecyclemanagement)
     */
    public fun appLifecycleManagement(): Any? = unwrap(this).getAppLifecycleManagement()

    /**
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the
     * JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-coderepositories)
     */
    public fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [SpaceJupyterLabAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      public fun appLifecycleManagement(appLifecycleManagement: IResolvable)

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      public fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty)

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6df281e20eb48194937b8f3563186eb6a29074a639a39995a8935b1f29703b")
      public
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty.Builder.() -> Unit)

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(codeRepositories: IResolvable)

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(codeRepositories: List<Any>)

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      public fun codeRepositories(vararg codeRepositories: Any)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e610d39a8b0aa40803e5cbf82f3480f352a013c3c69dabe189197d7d609a6cf")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty.builder()

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      override fun appLifecycleManagement(appLifecycleManagement: IResolvable) {
        cdkBuilder.appLifecycleManagement(appLifecycleManagement.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      override
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty) {
        cdkBuilder.appLifecycleManagement(appLifecycleManagement.let(SpaceAppLifecycleManagementProperty.Companion::unwrap))
      }

      /**
       * @param appLifecycleManagement Settings that are used to configure and manage the lifecycle
       * of JupyterLab applications in a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b6df281e20eb48194937b8f3563186eb6a29074a639a39995a8935b1f29703b")
      override
          fun appLifecycleManagement(appLifecycleManagement: SpaceAppLifecycleManagementProperty.Builder.() -> Unit):
          Unit = appLifecycleManagement(SpaceAppLifecycleManagementProperty(appLifecycleManagement))

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(codeRepositories: IResolvable) {
        cdkBuilder.codeRepositories(codeRepositories.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(codeRepositories: List<Any>) {
        cdkBuilder.codeRepositories(codeRepositories.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
       * users for cloning in the JupyterLab application.
       */
      override fun codeRepositories(vararg codeRepositories: Any): Unit =
          codeRepositories(codeRepositories.toList())

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
       * version, and the instance type that the version runs on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3e610d39a8b0aa40803e5cbf82f3480f352a013c3c69dabe189197d7d609a6cf")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceJupyterLabAppSettingsProperty {
      /**
       * Settings that are used to configure and manage the lifecycle of JupyterLab applications in
       * a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-applifecyclemanagement)
       */
      override fun appLifecycleManagement(): Any? = unwrap(this).getAppLifecycleManagement()

      /**
       * A list of Git repositories that SageMaker automatically displays to users for cloning in
       * the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-coderepositories)
       */
      override fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

      /**
       * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
       * that the version runs on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html#cfn-sagemaker-space-spacejupyterlabappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpaceJupyterLabAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty):
          SpaceJupyterLabAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceJupyterLabAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceJupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceJupyterLabAppSettingsProperty
    }
  }

  /**
   * A collection of space settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceSettingsProperty spaceSettingsProperty = SpaceSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html)
   */
  public interface SpaceSettingsProperty {
    /**
     * The type of app created within the space.
     *
     * If using the
     * [UpdateSpace](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_UpdateSpace.html)
     * API, you can't change the app type of your space by specifying a different value for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-apptype)
     */
    public fun appType(): String? = unwrap(this).getAppType()

    /**
     * The Code Editor application settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-codeeditorappsettings)
     */
    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    /**
     * A file system, created by you, that you assign to a space for an Amazon SageMaker AI Domain.
     *
     * Permitted users can access this file system in Amazon SageMaker AI Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-customfilesystems)
     */
    public fun customFileSystems(): Any? = unwrap(this).getCustomFileSystems()

    /**
     * The settings for the JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-jupyterlabappsettings)
     */
    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    /**
     * The JupyterServer app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-jupyterserverappsettings)
     */
    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    /**
     * The KernelGateway app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-kernelgatewayappsettings)
     */
    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    /**
     * A setting that enables or disables remote access for a SageMaker space.
     *
     * When enabled, this allows you to connect to the remote space from your local IDE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-remoteaccess)
     */
    public fun remoteAccess(): String? = unwrap(this).getRemoteAccess()

    /**
     * If you enable this option, SageMaker AI creates the following resources on your behalf when
     * you create the space:.
     *
     * * The user profile that possesses the space.
     * * The app that the space contains.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-spacemanagedresources)
     */
    public fun spaceManagedResources(): String? = unwrap(this).getSpaceManagedResources()

    /**
     * The storage settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-spacestoragesettings)
     */
    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    /**
     * A builder for [SpaceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appType The type of app created within the space.
       * If using the
       * [UpdateSpace](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_UpdateSpace.html)
       * API, you can't change the app type of your space by specifying a different value for this
       * field.
       */
      public fun appType(appType: String)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f918775596280a32b6b9fe283d250c4fe4e357bfbacd027c2dc1e466771fd38e")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      public fun customFileSystems(customFileSystems: IResolvable)

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      public fun customFileSystems(customFileSystems: List<Any>)

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      public fun customFileSystems(vararg customFileSystems: Any)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e7df97d51739f4eb6d7bfa218eeb377f9a60767f0d205be6bd6ffc66ccd37e1")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f7c6c76f44d64841bb5864ff13e770e9e0045acaca2391de9ccd8b43e4bcc3b")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aec0cb1505855775f7e5ed514c4faeca23d281b6af5443186f140f7e6b5bb1c")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param remoteAccess A setting that enables or disables remote access for a SageMaker space.
       * When enabled, this allows you to connect to the remote space from your local IDE.
       */
      public fun remoteAccess(remoteAccess: String)

      /**
       * @param spaceManagedResources If you enable this option, SageMaker AI creates the following
       * resources on your behalf when you create the space:.
       * * The user profile that possesses the space.
       * * The app that the space contains.
       */
      public fun spaceManagedResources(spaceManagedResources: String)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e918c17a2faf9653cd99fc52b83a57eea99102a611f1a0f4f0580518aa18211e")
      public
          fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty.builder()

      /**
       * @param appType The type of app created within the space.
       * If using the
       * [UpdateSpace](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_UpdateSpace.html)
       * API, you can't change the app type of your space by specifying a different value for this
       * field.
       */
      override fun appType(appType: String) {
        cdkBuilder.appType(appType)
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(SpaceCodeEditorAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f918775596280a32b6b9fe283d250c4fe4e357bfbacd027c2dc1e466771fd38e")
      override
          fun codeEditorAppSettings(codeEditorAppSettings: SpaceCodeEditorAppSettingsProperty.Builder.() -> Unit):
          Unit = codeEditorAppSettings(SpaceCodeEditorAppSettingsProperty(codeEditorAppSettings))

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      override fun customFileSystems(customFileSystems: IResolvable) {
        cdkBuilder.customFileSystems(customFileSystems.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      override fun customFileSystems(customFileSystems: List<Any>) {
        cdkBuilder.customFileSystems(customFileSystems.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customFileSystems A file system, created by you, that you assign to a space for an
       * Amazon SageMaker AI Domain.
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       */
      override fun customFileSystems(vararg customFileSystems: Any): Unit =
          customFileSystems(customFileSystems.toList())

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(SpaceJupyterLabAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e7df97d51739f4eb6d7bfa218eeb377f9a60767f0d205be6bd6ffc66ccd37e1")
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: SpaceJupyterLabAppSettingsProperty.Builder.() -> Unit):
          Unit = jupyterLabAppSettings(SpaceJupyterLabAppSettingsProperty(jupyterLabAppSettings))

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The JupyterServer app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f7c6c76f44d64841bb5864ff13e770e9e0045acaca2391de9ccd8b43e4bcc3b")
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit):
          Unit =
          jupyterServerAppSettings(JupyterServerAppSettingsProperty(jupyterServerAppSettings))

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      override fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(KernelGatewayAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The KernelGateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1aec0cb1505855775f7e5ed514c4faeca23d281b6af5443186f140f7e6b5bb1c")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      /**
       * @param remoteAccess A setting that enables or disables remote access for a SageMaker space.
       * When enabled, this allows you to connect to the remote space from your local IDE.
       */
      override fun remoteAccess(remoteAccess: String) {
        cdkBuilder.remoteAccess(remoteAccess)
      }

      /**
       * @param spaceManagedResources If you enable this option, SageMaker AI creates the following
       * resources on your behalf when you create the space:.
       * * The user profile that possesses the space.
       * * The app that the space contains.
       */
      override fun spaceManagedResources(spaceManagedResources: String) {
        cdkBuilder.spaceManagedResources(spaceManagedResources)
      }

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(SpaceStorageSettingsProperty.Companion::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e918c17a2faf9653cd99fc52b83a57eea99102a611f1a0f4f0580518aa18211e")
      override
          fun spaceStorageSettings(spaceStorageSettings: SpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(SpaceStorageSettingsProperty(spaceStorageSettings))

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceSettingsProperty {
      /**
       * The type of app created within the space.
       *
       * If using the
       * [UpdateSpace](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_UpdateSpace.html)
       * API, you can't change the app type of your space by specifying a different value for this
       * field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-apptype)
       */
      override fun appType(): String? = unwrap(this).getAppType()

      /**
       * The Code Editor application settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-codeeditorappsettings)
       */
      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      /**
       * A file system, created by you, that you assign to a space for an Amazon SageMaker AI
       * Domain.
       *
       * Permitted users can access this file system in Amazon SageMaker AI Studio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-customfilesystems)
       */
      override fun customFileSystems(): Any? = unwrap(this).getCustomFileSystems()

      /**
       * The settings for the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-jupyterlabappsettings)
       */
      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      /**
       * The JupyterServer app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-jupyterserverappsettings)
       */
      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      /**
       * The KernelGateway app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-kernelgatewayappsettings)
       */
      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      /**
       * A setting that enables or disables remote access for a SageMaker space.
       *
       * When enabled, this allows you to connect to the remote space from your local IDE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-remoteaccess)
       */
      override fun remoteAccess(): String? = unwrap(this).getRemoteAccess()

      /**
       * If you enable this option, SageMaker AI creates the following resources on your behalf when
       * you create the space:.
       *
       * * The user profile that possesses the space.
       * * The app that the space contains.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-spacemanagedresources)
       */
      override fun spaceManagedResources(): String? = unwrap(this).getSpaceManagedResources()

      /**
       * The storage settings for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesettings.html#cfn-sagemaker-space-spacesettings-spacestoragesettings)
       */
      override fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty):
          SpaceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? SpaceSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSettingsProperty
    }
  }

  /**
   * A collection of space sharing settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceSharingSettingsProperty spaceSharingSettingsProperty =
   * SpaceSharingSettingsProperty.builder()
   * .sharingType("sharingType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesharingsettings.html)
   */
  public interface SpaceSharingSettingsProperty {
    /**
     * Specifies the sharing type of the space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesharingsettings.html#cfn-sagemaker-space-spacesharingsettings-sharingtype)
     */
    public fun sharingType(): String

    /**
     * A builder for [SpaceSharingSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sharingType Specifies the sharing type of the space. 
       */
      public fun sharingType(sharingType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty.builder()

      /**
       * @param sharingType Specifies the sharing type of the space. 
       */
      override fun sharingType(sharingType: String) {
        cdkBuilder.sharingType(sharingType)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceSharingSettingsProperty {
      /**
       * Specifies the sharing type of the space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesharingsettings.html#cfn-sagemaker-space-spacesharingsettings-sharingtype)
       */
      override fun sharingType(): String = unwrap(this).getSharingType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceSharingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty):
          SpaceSharingSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceSharingSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceSharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceSharingSettingsProperty
    }
  }

  /**
   * The storage settings for a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SpaceStorageSettingsProperty spaceStorageSettingsProperty =
   * SpaceStorageSettingsProperty.builder()
   * .ebsStorageSettings(EbsStorageSettingsProperty.builder()
   * .ebsVolumeSizeInGb(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacestoragesettings.html)
   */
  public interface SpaceStorageSettingsProperty {
    /**
     * A collection of EBS storage settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacestoragesettings.html#cfn-sagemaker-space-spacestoragesettings-ebsstoragesettings)
     */
    public fun ebsStorageSettings(): Any? = unwrap(this).getEbsStorageSettings()

    /**
     * A builder for [SpaceStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      public fun ebsStorageSettings(ebsStorageSettings: IResolvable)

      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      public fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty)

      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("685af989ba2409bea91c1c7183d1e017811b8406dc2cb03fc45796cc3adf4da3")
      public
          fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty.builder()

      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      override fun ebsStorageSettings(ebsStorageSettings: IResolvable) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      override fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty) {
        cdkBuilder.ebsStorageSettings(ebsStorageSettings.let(EbsStorageSettingsProperty.Companion::unwrap))
      }

      /**
       * @param ebsStorageSettings A collection of EBS storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("685af989ba2409bea91c1c7183d1e017811b8406dc2cb03fc45796cc3adf4da3")
      override
          fun ebsStorageSettings(ebsStorageSettings: EbsStorageSettingsProperty.Builder.() -> Unit):
          Unit = ebsStorageSettings(EbsStorageSettingsProperty(ebsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty,
    ) : CdkObject(cdkObject),
        SpaceStorageSettingsProperty {
      /**
       * A collection of EBS storage settings for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacestoragesettings.html#cfn-sagemaker-space-spacestoragesettings-ebsstoragesettings)
       */
      override fun ebsStorageSettings(): Any? = unwrap(this).getEbsStorageSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpaceStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty):
          SpaceStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpaceStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnSpace.SpaceStorageSettingsProperty
    }
  }
}
