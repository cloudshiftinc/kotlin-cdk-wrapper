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
 * Creates a user profile.
 *
 * A user profile represents a single user within a domain, and is the main way to reference a
 * "person" for the purposes of sharing, reporting, and other user-oriented features. This entity is
 * created when a user onboards to Amazon SageMaker Studio. If an administrator invites a person by
 * email or imports them from IAM Identity Center , a user profile is automatically created. A user
 * profile is the primary holder of settings for an individual user and has a reference to the user's
 * private Amazon Elastic File System (EFS) home directory.
 *
 *
 * If you're using IAM Identity Center authentication, a user in IAM Identity Center , or a group in
 * IAM Identity Center containing that user, must be assigned to the Amazon SageMaker Studio
 * application from the IAM Identity Center Console to create a user profile. For more information
 * about application assignment, see [Assign user
 * access](https://docs.aws.amazon.com/singlesignon/latest/userguide/assignuserstoapp.html) . After
 * assignment is complete, a user profile can be created for that user in IAM Identity Center with AWS
 * CloudFormation.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnUserProfile cfnUserProfile = CfnUserProfile.Builder.create(this, "MyCfnUserProfile")
 * .domainId("domainId")
 * .userProfileName("userProfileName")
 * // the properties below are optional
 * .singleSignOnUserIdentifier("singleSignOnUserIdentifier")
 * .singleSignOnUserValue("singleSignOnUserValue")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userSettings(UserSettingsProperty.builder()
 * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
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
 * .executionRole("executionRole")
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
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html)
 */
public open class CfnUserProfile(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnUserProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserProfileProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the user profile, such as
   * `arn:aws:sagemaker:region:account-id:user-profile/domain-id/user-profile-name` .
   */
  public open fun attrUserProfileArn(): String = unwrap(this).getAttrUserProfileArn()

  /**
   * The domain ID.
   */
  public open fun domainId(): String = unwrap(this).getDomainId()

  /**
   * The domain ID.
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
   * A specifier for the type of value specified in SingleSignOnUserValue.
   */
  public open fun singleSignOnUserIdentifier(): String? =
      unwrap(this).getSingleSignOnUserIdentifier()

  /**
   * A specifier for the type of value specified in SingleSignOnUserValue.
   */
  public open fun singleSignOnUserIdentifier(`value`: String) {
    unwrap(this).setSingleSignOnUserIdentifier(`value`)
  }

  /**
   * The username of the associated AWS Single Sign-On User for this UserProfile.
   */
  public open fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

  /**
   * The username of the associated AWS Single Sign-On User for this UserProfile.
   */
  public open fun singleSignOnUserValue(`value`: String) {
    unwrap(this).setSingleSignOnUserValue(`value`)
  }

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
   * The user profile name.
   */
  public open fun userProfileName(): String = unwrap(this).getUserProfileName()

  /**
   * The user profile name.
   */
  public open fun userProfileName(`value`: String) {
    unwrap(this).setUserProfileName(`value`)
  }

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  public open fun userSettings(): Any? = unwrap(this).getUserSettings()

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  public open fun userSettings(`value`: IResolvable) {
    unwrap(this).setUserSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  public open fun userSettings(`value`: UserSettingsProperty) {
    unwrap(this).setUserSettings(`value`.let(UserSettingsProperty.Companion::unwrap))
  }

  /**
   * A collection of settings that apply to users of Amazon SageMaker Studio.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e8d6a7f3fb9323beb3c4cb4336eadc679ac6fc49d98c71b25e7912f05f10ab8f")
  public open fun userSettings(`value`: UserSettingsProperty.Builder.() -> Unit): Unit =
      userSettings(UserSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnUserProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-domainid)
     * @param domainId The domain ID. 
     */
    public fun domainId(domainId: String)

    /**
     * A specifier for the type of value specified in SingleSignOnUserValue.
     *
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuseridentifier)
     * @param singleSignOnUserIdentifier A specifier for the type of value specified in
     * SingleSignOnUserValue. 
     */
    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String)

    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile.
     *
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center
     * , this field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuservalue)
     * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
     * UserProfile. 
     */
    public fun singleSignOnUserValue(singleSignOnUserValue: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-userprofilename)
     * @param userProfileName The user profile name. 
     */
    public fun userProfileName(userProfileName: String)

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    public fun userSettings(userSettings: IResolvable)

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    public fun userSettings(userSettings: UserSettingsProperty)

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfebc0f1d980b1a58c42c26303f24f582df8cbdf303ffff2bb6f966e8af743d9")
    public fun userSettings(userSettings: UserSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder =
        software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder.create(scope, id)

    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-domainid)
     * @param domainId The domain ID. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * A specifier for the type of value specified in SingleSignOnUserValue.
     *
     * Currently, the only supported value is "UserName". If the Domain's AuthMode is IAM Identity
     * Center , this field is required. If the Domain's AuthMode is not IAM Identity Center , this
     * field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuseridentifier)
     * @param singleSignOnUserIdentifier A specifier for the type of value specified in
     * SingleSignOnUserValue. 
     */
    override fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
      cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile.
     *
     * If the Domain's AuthMode is IAM Identity Center , this field is required, and must match a
     * valid username of a user in your directory. If the Domain's AuthMode is not IAM Identity Center
     * , this field cannot be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-singlesignonuservalue)
     * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this
     * UserProfile. 
     */
    override fun singleSignOnUserValue(singleSignOnUserValue: String) {
      cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * Tags that you specify for the User Profile are also added to all apps that the User Profile
     * launches.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-userprofilename)
     * @param userProfileName The user profile name. 
     */
    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    override fun userSettings(userSettings: UserSettingsProperty) {
      cdkBuilder.userSettings(userSettings.let(UserSettingsProperty.Companion::unwrap))
    }

    /**
     * A collection of settings that apply to users of Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-userprofile.html#cfn-sagemaker-userprofile-usersettings)
     * @param userSettings A collection of settings that apply to users of Amazon SageMaker Studio. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfebc0f1d980b1a58c42c26303f24f582df8cbdf303ffff2bb6f966e8af743d9")
    override fun userSettings(userSettings: UserSettingsProperty.Builder.() -> Unit): Unit =
        userSettings(UserSettingsProperty(userSettings))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnUserProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnUserProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile):
        CfnUserProfile = CfnUserProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfile):
        software.amazon.awscdk.services.sagemaker.CfnUserProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnUserProfile
  }

  /**
   * The Code Editor application settings.
   *
   * For more information about Code Editor, see [Get started with Code Editor in Amazon
   * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/code-editor.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CodeEditorAppSettingsProperty codeEditorAppSettingsProperty =
   * CodeEditorAppSettingsProperty.builder()
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
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html)
   */
  public interface CodeEditorAppSettingsProperty {
    /**
     * A list of custom SageMaker images that are configured to run as a Code Editor app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the Code Editor app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the Code Editor application lifecycle configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [CodeEditorAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ccae4dc01b9d84bac327bbdfa7d3db21daf105efcb02977fb8ce18b222af80d")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty.builder()

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a Code
       * Editor app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the Code Editor app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ccae4dc01b9d84bac327bbdfa7d3db21daf105efcb02977fb8ce18b222af80d")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
       * lifecycle configuration.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty,
    ) : CdkObject(cdkObject), CodeEditorAppSettingsProperty {
      /**
       * A list of custom SageMaker images that are configured to run as a Code Editor app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the Code Editor app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the Code Editor application lifecycle configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html#cfn-sagemaker-userprofile-codeeditorappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeEditorAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty):
          CodeEditorAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CodeEditorAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeEditorAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeEditorAppSettingsProperty
    }
  }

  /**
   * A Git repository that SageMaker automatically displays to users for cloning in the
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-coderepository.html)
   */
  public interface CodeRepositoryProperty {
    /**
     * The URL of the Git repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-coderepository.html#cfn-sagemaker-userprofile-coderepository-repositoryurl)
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
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty.builder()

      /**
       * @param repositoryUrl The URL of the Git repository. 
       */
      override fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty,
    ) : CdkObject(cdkObject), CodeRepositoryProperty {
      /**
       * The URL of the Git repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-coderepository.html#cfn-sagemaker-userprofile-coderepository-repositoryurl)
       */
      override fun repositoryUrl(): String = unwrap(this).getRepositoryUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CodeRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty):
          CodeRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as? CodeRepositoryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CodeRepositoryProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CodeRepositoryProperty
    }
  }

  /**
   * The settings for assigning a custom file system to a user profile or space for an Amazon
   * SageMaker Domain.
   *
   * Permitted users can access this file system in Amazon SageMaker Studio.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomFileSystemConfigProperty customFileSystemConfigProperty =
   * CustomFileSystemConfigProperty.builder()
   * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .fileSystemPath("fileSystemPath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customfilesystemconfig.html)
   */
  public interface CustomFileSystemConfigProperty {
    /**
     * The settings for a custom Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customfilesystemconfig.html#cfn-sagemaker-userprofile-customfilesystemconfig-efsfilesystemconfig)
     */
    public fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()

    /**
     * A builder for [CustomFileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      public fun efsFileSystemConfig(efsFileSystemConfig: IResolvable)

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      public fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty)

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32bba1122425d0b2900bd6169c3662001a98f9fbf51fd7db107ffd697088db00")
      public
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty.builder()

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      override fun efsFileSystemConfig(efsFileSystemConfig: IResolvable) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      override fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig.let(EFSFileSystemConfigProperty.Companion::unwrap))
      }

      /**
       * @param efsFileSystemConfig The settings for a custom Amazon EFS file system.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32bba1122425d0b2900bd6169c3662001a98f9fbf51fd7db107ffd697088db00")
      override
          fun efsFileSystemConfig(efsFileSystemConfig: EFSFileSystemConfigProperty.Builder.() -> Unit):
          Unit = efsFileSystemConfig(EFSFileSystemConfigProperty(efsFileSystemConfig))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty,
    ) : CdkObject(cdkObject), CustomFileSystemConfigProperty {
      /**
       * The settings for a custom Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customfilesystemconfig.html#cfn-sagemaker-userprofile-customfilesystemconfig-efsfilesystemconfig)
       */
      override fun efsFileSystemConfig(): Any? = unwrap(this).getEfsFileSystemConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty):
          CustomFileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomFileSystemConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomFileSystemConfigProperty
    }
  }

  /**
   * A custom SageMaker image.
   *
   * For more information, see [Bring your own SageMaker
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html)
   */
  public interface CustomImageProperty {
    /**
     * The name of the AppImageConfig.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-appimageconfigname)
     */
    public fun appImageConfigName(): String

    /**
     * The name of the CustomImage.
     *
     * Must be unique to your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-imagename)
     */
    public fun imageName(): String

    /**
     * The version number of the CustomImage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-imageversionnumber)
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
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty.builder()

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

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty,
    ) : CdkObject(cdkObject), CustomImageProperty {
      /**
       * The name of the AppImageConfig.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-appimageconfigname)
       */
      override fun appImageConfigName(): String = unwrap(this).getAppImageConfigName()

      /**
       * The name of the CustomImage.
       *
       * Must be unique to your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-imagename)
       */
      override fun imageName(): String = unwrap(this).getImageName()

      /**
       * The version number of the CustomImage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html#cfn-sagemaker-userprofile-customimage-imageversionnumber)
       */
      override fun imageVersionNumber(): Number? = unwrap(this).getImageVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomImageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty):
          CustomImageProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomImageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomImageProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomImageProperty
    }
  }

  /**
   * Details about the POSIX identity that is used for file system operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * CustomPosixUserConfigProperty customPosixUserConfigProperty =
   * CustomPosixUserConfigProperty.builder()
   * .gid(123)
   * .uid(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html)
   */
  public interface CustomPosixUserConfigProperty {
    /**
     * The POSIX group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html#cfn-sagemaker-userprofile-customposixuserconfig-gid)
     */
    public fun gid(): Number

    /**
     * The POSIX user ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html#cfn-sagemaker-userprofile-customposixuserconfig-uid)
     */
    public fun uid(): Number

    /**
     * A builder for [CustomPosixUserConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gid The POSIX group ID. 
       */
      public fun gid(gid: Number)

      /**
       * @param uid The POSIX user ID. 
       */
      public fun uid(uid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty.builder()

      /**
       * @param gid The POSIX group ID. 
       */
      override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      /**
       * @param uid The POSIX user ID. 
       */
      override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty,
    ) : CdkObject(cdkObject), CustomPosixUserConfigProperty {
      /**
       * The POSIX group ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html#cfn-sagemaker-userprofile-customposixuserconfig-gid)
       */
      override fun gid(): Number = unwrap(this).getGid()

      /**
       * The POSIX user ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customposixuserconfig.html#cfn-sagemaker-userprofile-customposixuserconfig-uid)
       */
      override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomPosixUserConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty):
          CustomPosixUserConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomPosixUserConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPosixUserConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.CustomPosixUserConfigProperty
    }
  }

  /**
   * A collection of default EBS storage settings that apply to spaces created within a domain or
   * user profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DefaultEbsStorageSettingsProperty defaultEbsStorageSettingsProperty =
   * DefaultEbsStorageSettingsProperty.builder()
   * .defaultEbsVolumeSizeInGb(123)
   * .maximumEbsVolumeSizeInGb(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html)
   */
  public interface DefaultEbsStorageSettingsProperty {
    /**
     * The default size of the EBS storage volume for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html#cfn-sagemaker-userprofile-defaultebsstoragesettings-defaultebsvolumesizeingb)
     */
    public fun defaultEbsVolumeSizeInGb(): Number

    /**
     * The maximum size of the EBS storage volume for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html#cfn-sagemaker-userprofile-defaultebsstoragesettings-maximumebsvolumesizeingb)
     */
    public fun maximumEbsVolumeSizeInGb(): Number

    /**
     * A builder for [DefaultEbsStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultEbsVolumeSizeInGb The default size of the EBS storage volume for a space. 
       */
      public fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number)

      /**
       * @param maximumEbsVolumeSizeInGb The maximum size of the EBS storage volume for a space. 
       */
      public fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty.builder()

      /**
       * @param defaultEbsVolumeSizeInGb The default size of the EBS storage volume for a space. 
       */
      override fun defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb: Number) {
        cdkBuilder.defaultEbsVolumeSizeInGb(defaultEbsVolumeSizeInGb)
      }

      /**
       * @param maximumEbsVolumeSizeInGb The maximum size of the EBS storage volume for a space. 
       */
      override fun maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb: Number) {
        cdkBuilder.maximumEbsVolumeSizeInGb(maximumEbsVolumeSizeInGb)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty,
    ) : CdkObject(cdkObject), DefaultEbsStorageSettingsProperty {
      /**
       * The default size of the EBS storage volume for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html#cfn-sagemaker-userprofile-defaultebsstoragesettings-defaultebsvolumesizeingb)
       */
      override fun defaultEbsVolumeSizeInGb(): Number = unwrap(this).getDefaultEbsVolumeSizeInGb()

      /**
       * The maximum size of the EBS storage volume for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultebsstoragesettings.html#cfn-sagemaker-userprofile-defaultebsstoragesettings-maximumebsvolumesizeingb)
       */
      override fun maximumEbsVolumeSizeInGb(): Number = unwrap(this).getMaximumEbsVolumeSizeInGb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultEbsStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty):
          DefaultEbsStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultEbsStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultEbsStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultEbsStorageSettingsProperty
    }
  }

  /**
   * The default storage settings for a space.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * DefaultSpaceStorageSettingsProperty defaultSpaceStorageSettingsProperty =
   * DefaultSpaceStorageSettingsProperty.builder()
   * .defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty.builder()
   * .defaultEbsVolumeSizeInGb(123)
   * .maximumEbsVolumeSizeInGb(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultspacestoragesettings.html)
   */
  public interface DefaultSpaceStorageSettingsProperty {
    /**
     * The default EBS storage settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultspacestoragesettings.html#cfn-sagemaker-userprofile-defaultspacestoragesettings-defaultebsstoragesettings)
     */
    public fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()

    /**
     * A builder for [DefaultSpaceStorageSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      public fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable)

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty)

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f67e23f19df36440b0e4a62615f0e09ef5d1f0dcbf47dd16dbb51a8adef7c11")
      public
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty.builder()

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      override fun defaultEbsStorageSettings(defaultEbsStorageSettings: IResolvable) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty) {
        cdkBuilder.defaultEbsStorageSettings(defaultEbsStorageSettings.let(DefaultEbsStorageSettingsProperty.Companion::unwrap))
      }

      /**
       * @param defaultEbsStorageSettings The default EBS storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f67e23f19df36440b0e4a62615f0e09ef5d1f0dcbf47dd16dbb51a8adef7c11")
      override
          fun defaultEbsStorageSettings(defaultEbsStorageSettings: DefaultEbsStorageSettingsProperty.Builder.() -> Unit):
          Unit =
          defaultEbsStorageSettings(DefaultEbsStorageSettingsProperty(defaultEbsStorageSettings))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty,
    ) : CdkObject(cdkObject), DefaultSpaceStorageSettingsProperty {
      /**
       * The default EBS storage settings for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-defaultspacestoragesettings.html#cfn-sagemaker-userprofile-defaultspacestoragesettings-defaultebsstoragesettings)
       */
      override fun defaultEbsStorageSettings(): Any? = unwrap(this).getDefaultEbsStorageSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultSpaceStorageSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty):
          DefaultSpaceStorageSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultSpaceStorageSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultSpaceStorageSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.DefaultSpaceStorageSettingsProperty
    }
  }

  /**
   * The settings for assigning a custom Amazon EFS file system to a user profile or space for an
   * Amazon SageMaker Domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EFSFileSystemConfigProperty eFSFileSystemConfigProperty = EFSFileSystemConfigProperty.builder()
   * .fileSystemId("fileSystemId")
   * // the properties below are optional
   * .fileSystemPath("fileSystemPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html)
   */
  public interface EFSFileSystemConfigProperty {
    /**
     * The ID of your Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html#cfn-sagemaker-userprofile-efsfilesystemconfig-filesystemid)
     */
    public fun fileSystemId(): String

    /**
     * The path to the file system directory that is accessible in Amazon SageMaker Studio.
     *
     * Permitted users can access only this directory and below.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html#cfn-sagemaker-userprofile-efsfilesystemconfig-filesystempath)
     */
    public fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()

    /**
     * A builder for [EFSFileSystemConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param fileSystemPath The path to the file system directory that is accessible in Amazon
       * SageMaker Studio.
       * Permitted users can access only this directory and below.
       */
      public fun fileSystemPath(fileSystemPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty.builder()

      /**
       * @param fileSystemId The ID of your Amazon EFS file system. 
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param fileSystemPath The path to the file system directory that is accessible in Amazon
       * SageMaker Studio.
       * Permitted users can access only this directory and below.
       */
      override fun fileSystemPath(fileSystemPath: String) {
        cdkBuilder.fileSystemPath(fileSystemPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty,
    ) : CdkObject(cdkObject), EFSFileSystemConfigProperty {
      /**
       * The ID of your Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html#cfn-sagemaker-userprofile-efsfilesystemconfig-filesystemid)
       */
      override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      /**
       * The path to the file system directory that is accessible in Amazon SageMaker Studio.
       *
       * Permitted users can access only this directory and below.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-efsfilesystemconfig.html#cfn-sagemaker-userprofile-efsfilesystemconfig-filesystempath)
       */
      override fun fileSystemPath(): String? = unwrap(this).getFileSystemPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EFSFileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty):
          EFSFileSystemConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EFSFileSystemConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EFSFileSystemConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.EFSFileSystemConfigProperty
    }
  }

  /**
   * The settings for the JupyterLab application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * JupyterLabAppSettingsProperty jupyterLabAppSettingsProperty =
   * JupyterLabAppSettingsProperty.builder()
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
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html)
   */
  public interface JupyterLabAppSettingsProperty {
    /**
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the
     * JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-coderepositories)
     */
    public fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

    /**
     * A list of custom SageMaker images that are configured to run as a JupyterLab app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the JupyterLab app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * The Amazon Resource Name (ARN) of the lifecycle configurations attached to the user profile
     * or domain.
     *
     * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-lifecycleconfigarns)
     */
    public fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
        emptyList()

    /**
     * A builder for [JupyterLabAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1250315fe231fa1c610a5c0d1bb3f73fa487abe3189623bd9dca3f6a6994813f")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(lifecycleConfigArns: List<String>)

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      public fun lifecycleConfigArns(vararg lifecycleConfigArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty.builder()

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
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * JupyterLab app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterLab app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1250315fe231fa1c610a5c0d1bb3f73fa487abe3189623bd9dca3f6a6994813f")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(lifecycleConfigArns: List<String>) {
        cdkBuilder.lifecycleConfigArns(lifecycleConfigArns)
      }

      /**
       * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
       * attached to the user profile or domain.
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       */
      override fun lifecycleConfigArns(vararg lifecycleConfigArns: String): Unit =
          lifecycleConfigArns(lifecycleConfigArns.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty,
    ) : CdkObject(cdkObject), JupyterLabAppSettingsProperty {
      /**
       * A list of Git repositories that SageMaker automatically displays to users for cloning in
       * the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-coderepositories)
       */
      override fun codeRepositories(): Any? = unwrap(this).getCodeRepositories()

      /**
       * A list of custom SageMaker images that are configured to run as a JupyterLab app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the JupyterLab app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

      /**
       * The Amazon Resource Name (ARN) of the lifecycle configurations attached to the user profile
       * or domain.
       *
       * To remove a lifecycle config, you must set `LifecycleConfigArns` to an empty list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html#cfn-sagemaker-userprofile-jupyterlabappsettings-lifecycleconfigarns)
       */
      override fun lifecycleConfigArns(): List<String> = unwrap(this).getLifecycleConfigArns() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterLabAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty):
          JupyterLabAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JupyterLabAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterLabAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterLabAppSettingsProperty
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
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterserverappsettings.html)
   */
  public interface JupyterServerAppSettingsProperty {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the JupyterServer app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterserverappsettings.html#cfn-sagemaker-userprofile-jupyterserverappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [JupyterServerAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d3d4d19541e54e09bc7bb368f2f97abc698620b1132fbc08d27f1001b95348")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty.builder()

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the JupyterServer app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9d3d4d19541e54e09bc7bb368f2f97abc698620b1132fbc08d27f1001b95348")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty,
    ) : CdkObject(cdkObject), JupyterServerAppSettingsProperty {
      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the JupyterServer app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterserverappsettings.html#cfn-sagemaker-userprofile-jupyterserverappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JupyterServerAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty):
          JupyterServerAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JupyterServerAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JupyterServerAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty
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
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html)
   */
  public interface KernelGatewayAppSettingsProperty {
    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html#cfn-sagemaker-userprofile-kernelgatewayappsettings-customimages)
     */
    public fun customImages(): Any? = unwrap(this).getCustomImages()

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
     * used by the KernelGateway app.
     *
     *
     * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
     * default instance type set here is used when Apps are created using the AWS CLI or AWS
     * CloudFormation and the instance type parameter value is not passed.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html#cfn-sagemaker-userprofile-kernelgatewayappsettings-defaultresourcespec)
     */
    public fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()

    /**
     * A builder for [KernelGatewayAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(customImages: IResolvable)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(customImages: List<Any>)

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      public fun customImages(vararg customImages: Any)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: IResolvable)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty)

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022649f98f5cda55073bad04f6fc522085ccdef224b56a15e01a99347bff0a30")
      public fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty.builder()

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(customImages: List<Any>) {
        cdkBuilder.customImages(customImages.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customImages A list of custom SageMaker images that are configured to run as a
       * KernelGateway app.
       */
      override fun customImages(vararg customImages: Any): Unit =
          customImages(customImages.toList())

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      override fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec.let(ResourceSpecProperty.Companion::unwrap))
      }

      /**
       * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
       * the default SageMaker image used by the KernelGateway app.
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("022649f98f5cda55073bad04f6fc522085ccdef224b56a15e01a99347bff0a30")
      override
          fun defaultResourceSpec(defaultResourceSpec: ResourceSpecProperty.Builder.() -> Unit):
          Unit = defaultResourceSpec(ResourceSpecProperty(defaultResourceSpec))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty,
    ) : CdkObject(cdkObject), KernelGatewayAppSettingsProperty {
      /**
       * A list of custom SageMaker images that are configured to run as a KernelGateway app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html#cfn-sagemaker-userprofile-kernelgatewayappsettings-customimages)
       */
      override fun customImages(): Any? = unwrap(this).getCustomImages()

      /**
       * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image
       * used by the KernelGateway app.
       *
       *
       * The Amazon SageMaker Studio UI does not use the default instance type value set here. The
       * default instance type set here is used when Apps are created using the AWS CLI or AWS
       * CloudFormation and the instance type parameter value is not passed.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-kernelgatewayappsettings.html#cfn-sagemaker-userprofile-kernelgatewayappsettings-defaultresourcespec)
       */
      override fun defaultResourceSpec(): Any? = unwrap(this).getDefaultResourceSpec()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KernelGatewayAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty):
          KernelGatewayAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KernelGatewayAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KernelGatewayAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty
    }
  }

  /**
   * A collection of settings that configure user interaction with the `RStudioServerPro` app.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * RStudioServerProAppSettingsProperty rStudioServerProAppSettingsProperty =
   * RStudioServerProAppSettingsProperty.builder()
   * .accessStatus("accessStatus")
   * .userGroup("userGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html)
   */
  public interface RStudioServerProAppSettingsProperty {
    /**
     * Indicates whether the current user has access to the `RStudioServerPro` app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html#cfn-sagemaker-userprofile-rstudioserverproappsettings-accessstatus)
     */
    public fun accessStatus(): String? = unwrap(this).getAccessStatus()

    /**
     * The level of permissions that the user has within the `RStudioServerPro` app.
     *
     * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
     * Administrative Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html#cfn-sagemaker-userprofile-rstudioserverproappsettings-usergroup)
     */
    public fun userGroup(): String? = unwrap(this).getUserGroup()

    /**
     * A builder for [RStudioServerProAppSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
       * app.
       */
      public fun accessStatus(accessStatus: String)

      /**
       * @param userGroup The level of permissions that the user has within the `RStudioServerPro`
       * app.
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       */
      public fun userGroup(userGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty.builder()

      /**
       * @param accessStatus Indicates whether the current user has access to the `RStudioServerPro`
       * app.
       */
      override fun accessStatus(accessStatus: String) {
        cdkBuilder.accessStatus(accessStatus)
      }

      /**
       * @param userGroup The level of permissions that the user has within the `RStudioServerPro`
       * app.
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       */
      override fun userGroup(userGroup: String) {
        cdkBuilder.userGroup(userGroup)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty,
    ) : CdkObject(cdkObject), RStudioServerProAppSettingsProperty {
      /**
       * Indicates whether the current user has access to the `RStudioServerPro` app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html#cfn-sagemaker-userprofile-rstudioserverproappsettings-accessstatus)
       */
      override fun accessStatus(): String? = unwrap(this).getAccessStatus()

      /**
       * The level of permissions that the user has within the `RStudioServerPro` app.
       *
       * This value defaults to `User`. The `Admin` value allows the user access to the RStudio
       * Administrative Dashboard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-rstudioserverproappsettings.html#cfn-sagemaker-userprofile-rstudioserverproappsettings-usergroup)
       */
      override fun userGroup(): String? = unwrap(this).getUserGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RStudioServerProAppSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty):
          RStudioServerProAppSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RStudioServerProAppSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RStudioServerProAppSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.RStudioServerProAppSettingsProperty
    }
  }

  /**
   * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type
   * that the version runs on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
   * .instanceType("instanceType")
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-sagemakerimagearn)
     */
    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    /**
     * The ARN of the image version created on the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-sagemakerimageversionarn)
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
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      public fun sageMakerImageArn(sageMakerImageArn: String)

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty.builder()

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
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty,
    ) : CdkObject(cdkObject), ResourceSpecProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The ARN of the SageMaker image that the image version belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-sagemakerimagearn)
       */
      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      /**
       * The ARN of the image version created on the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-resourcespec.html#cfn-sagemaker-userprofile-resourcespec-sagemakerimageversionarn)
       */
      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty):
          ResourceSpecProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceSpecProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty
    }
  }

  /**
   * Specifies options when sharing an Amazon SageMaker Studio notebook.
   *
   * These settings are specified as part of `DefaultUserSettings` when the
   * [CreateDomain](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateDomain.html)
   * API is called, and as part of `UserSettings` when the
   * [CreateUserProfile](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateUserProfile.html)
   * API is called.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * SharingSettingsProperty sharingSettingsProperty = SharingSettingsProperty.builder()
   * .notebookOutputOption("notebookOutputOption")
   * .s3KmsKeyId("s3KmsKeyId")
   * .s3OutputPath("s3OutputPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html)
   */
  public interface SharingSettingsProperty {
    /**
     * Whether to include the notebook cell output when sharing the notebook.
     *
     * The default is `Disabled` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-notebookoutputoption)
     */
    public fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

    /**
     * When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service (KMS) encryption
     * key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-s3kmskeyid)
     */
    public fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

    /**
     * When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to store the shared
     * notebook snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-s3outputpath)
     */
    public fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()

    /**
     * A builder for [SharingSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notebookOutputOption Whether to include the notebook cell output when sharing the
       * notebook.
       * The default is `Disabled` .
       */
      public fun notebookOutputOption(notebookOutputOption: String)

      /**
       * @param s3KmsKeyId When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service
       * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       */
      public fun s3KmsKeyId(s3KmsKeyId: String)

      /**
       * @param s3OutputPath When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to
       * store the shared notebook snapshots.
       */
      public fun s3OutputPath(s3OutputPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty.builder()

      /**
       * @param notebookOutputOption Whether to include the notebook cell output when sharing the
       * notebook.
       * The default is `Disabled` .
       */
      override fun notebookOutputOption(notebookOutputOption: String) {
        cdkBuilder.notebookOutputOption(notebookOutputOption)
      }

      /**
       * @param s3KmsKeyId When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service
       * (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       */
      override fun s3KmsKeyId(s3KmsKeyId: String) {
        cdkBuilder.s3KmsKeyId(s3KmsKeyId)
      }

      /**
       * @param s3OutputPath When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to
       * store the shared notebook snapshots.
       */
      override fun s3OutputPath(s3OutputPath: String) {
        cdkBuilder.s3OutputPath(s3OutputPath)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty,
    ) : CdkObject(cdkObject), SharingSettingsProperty {
      /**
       * Whether to include the notebook cell output when sharing the notebook.
       *
       * The default is `Disabled` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-notebookoutputoption)
       */
      override fun notebookOutputOption(): String? = unwrap(this).getNotebookOutputOption()

      /**
       * When `NotebookOutputOption` is `Allowed` , the AWS Key Management Service (KMS) encryption
       * key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-s3kmskeyid)
       */
      override fun s3KmsKeyId(): String? = unwrap(this).getS3KmsKeyId()

      /**
       * When `NotebookOutputOption` is `Allowed` , the Amazon S3 bucket used to store the shared
       * notebook snapshots.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-sharingsettings.html#cfn-sagemaker-userprofile-sharingsettings-s3outputpath)
       */
      override fun s3OutputPath(): String? = unwrap(this).getS3OutputPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SharingSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty):
          SharingSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? SharingSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharingSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty
    }
  }

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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * UserSettingsProperty userSettingsProperty = UserSettingsProperty.builder()
   * .codeEditorAppSettings(CodeEditorAppSettingsProperty.builder()
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
   * .executionRole("executionRole")
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
   * .sageMakerImageArn("sageMakerImageArn")
   * .sageMakerImageVersionArn("sageMakerImageVersionArn")
   * .build())
   * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html)
   */
  public interface UserSettingsProperty {
    /**
     * The Code Editor application settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-codeeditorappsettings)
     */
    public fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

    /**
     * The settings for assigning a custom file system to a user profile.
     *
     * Permitted users can access this file system in Amazon SageMaker Studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-customfilesystemconfigs)
     */
    public fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

    /**
     * Details about the POSIX identity that is used for file system operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-customposixuserconfig)
     */
    public fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

    /**
     * The default experience that the user is directed to when accessing the domain. The supported
     * values are:.
     *
     * * `studio::` : Indicates that Studio is the default experience. This value can only be passed
     * if `StudioWebPortal` is set to `ENABLED` .
     * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-defaultlandinguri)
     */
    public fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

    /**
     * The execution role for the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-executionrole)
     */
    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    /**
     * The settings for the JupyterLab application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-jupyterlabappsettings)
     */
    public fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

    /**
     * The Jupyter server's app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-jupyterserverappsettings)
     */
    public fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

    /**
     * The kernel gateway app settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-kernelgatewayappsettings)
     */
    public fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

    /**
     * A collection of settings that configure user interaction with the `RStudioServerPro` app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-rstudioserverproappsettings)
     */
    public fun rStudioServerProAppSettings(): Any? = unwrap(this).getRStudioServerProAppSettings()

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for
     * communication.
     *
     * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
     * `PublicInternetOnly` .
     *
     * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
     * specified as part of the `DefaultUserSettings` for the domain.
     *
     * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
     * Therefore, the number of security groups that you can specify is one less than the maximum
     * number shown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Specifies options for sharing Amazon SageMaker Studio notebooks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-sharingsettings)
     */
    public fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

    /**
     * The storage settings for a space.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-spacestoragesettings)
     */
    public fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

    /**
     * Whether the user can access Studio.
     *
     * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
     * default experience for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-studiowebportal)
     */
    public fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()

    /**
     * A builder for [UserSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: IResolvable)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      public fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty)

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9bc4f2e8d04580013219292e00c55cc1fe609c1a01053af70fcee7898ca1a2")
      public
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(customFileSystemConfigs: IResolvable)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(customFileSystemConfigs: List<Any>)

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      public fun customFileSystemConfigs(vararg customFileSystemConfigs: Any)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      public fun customPosixUserConfig(customPosixUserConfig: IResolvable)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      public fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty)

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e0e792ac82240420b45380ef62898e35a25c9cafb375b23c659d4c33d809266")
      public
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit)

      /**
       * @param defaultLandingUri The default experience that the user is directed to when accessing
       * the domain. The supported values are:.
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       */
      public fun defaultLandingUri(defaultLandingUri: String)

      /**
       * @param executionRole The execution role for the user.
       */
      public fun executionRole(executionRole: String)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      public fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty)

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ebda19c4b4e31cf15587de0f09e9a34ab4bc94e697875e03abe3171057e5fe6")
      public
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty)

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2629b47b11212a6f882c30117dbc578ac1caea003d01e7a4faf4b5347488d0a4")
      public
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty)

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a767e77c5688ecb8852b78080098c2fa600ebc21ee3f373de53fb4d94f5e630e")
      public
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty)

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe17757e26a97bb7fb822a64a0272e2f53e50f24d9b95af39c2da14767184022")
      public
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit)

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      public fun sharingSettings(sharingSettings: IResolvable)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      public fun sharingSettings(sharingSettings: SharingSettingsProperty)

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041646d4ca819762daa2e604bf5173280d6a4a5ac08a172dba6a4d4a589d8f15")
      public fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: IResolvable)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      public fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty)

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52e04b39a0bbef7c03ae0431e80cfabcc922dc10d762b41ce484dc0006a1d40b")
      public
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit)

      /**
       * @param studioWebPortal Whether the user can access Studio.
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       */
      public fun studioWebPortal(studioWebPortal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty.builder()

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override fun codeEditorAppSettings(codeEditorAppSettings: IResolvable) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      override fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty) {
        cdkBuilder.codeEditorAppSettings(codeEditorAppSettings.let(CodeEditorAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param codeEditorAppSettings The Code Editor application settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9bc4f2e8d04580013219292e00c55cc1fe609c1a01053af70fcee7898ca1a2")
      override
          fun codeEditorAppSettings(codeEditorAppSettings: CodeEditorAppSettingsProperty.Builder.() -> Unit):
          Unit = codeEditorAppSettings(CodeEditorAppSettingsProperty(codeEditorAppSettings))

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(customFileSystemConfigs: IResolvable) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(customFileSystemConfigs: List<Any>) {
        cdkBuilder.customFileSystemConfigs(customFileSystemConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param customFileSystemConfigs The settings for assigning a custom file system to a user
       * profile.
       * Permitted users can access this file system in Amazon SageMaker Studio.
       */
      override fun customFileSystemConfigs(vararg customFileSystemConfigs: Any): Unit =
          customFileSystemConfigs(customFileSystemConfigs.toList())

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      override fun customPosixUserConfig(customPosixUserConfig: IResolvable) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      override fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty) {
        cdkBuilder.customPosixUserConfig(customPosixUserConfig.let(CustomPosixUserConfigProperty.Companion::unwrap))
      }

      /**
       * @param customPosixUserConfig Details about the POSIX identity that is used for file system
       * operations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e0e792ac82240420b45380ef62898e35a25c9cafb375b23c659d4c33d809266")
      override
          fun customPosixUserConfig(customPosixUserConfig: CustomPosixUserConfigProperty.Builder.() -> Unit):
          Unit = customPosixUserConfig(CustomPosixUserConfigProperty(customPosixUserConfig))

      /**
       * @param defaultLandingUri The default experience that the user is directed to when accessing
       * the domain. The supported values are:.
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       */
      override fun defaultLandingUri(defaultLandingUri: String) {
        cdkBuilder.defaultLandingUri(defaultLandingUri)
      }

      /**
       * @param executionRole The execution role for the user.
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override fun jupyterLabAppSettings(jupyterLabAppSettings: IResolvable) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      override fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty) {
        cdkBuilder.jupyterLabAppSettings(jupyterLabAppSettings.let(JupyterLabAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param jupyterLabAppSettings The settings for the JupyterLab application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ebda19c4b4e31cf15587de0f09e9a34ab4bc94e697875e03abe3171057e5fe6")
      override
          fun jupyterLabAppSettings(jupyterLabAppSettings: JupyterLabAppSettingsProperty.Builder.() -> Unit):
          Unit = jupyterLabAppSettings(JupyterLabAppSettingsProperty(jupyterLabAppSettings))

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      override fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings.let(JupyterServerAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param jupyterServerAppSettings The Jupyter server's app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2629b47b11212a6f882c30117dbc578ac1caea003d01e7a4faf4b5347488d0a4")
      override
          fun jupyterServerAppSettings(jupyterServerAppSettings: JupyterServerAppSettingsProperty.Builder.() -> Unit):
          Unit =
          jupyterServerAppSettings(JupyterServerAppSettingsProperty(jupyterServerAppSettings))

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      override fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings.let(KernelGatewayAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param kernelGatewayAppSettings The kernel gateway app settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a767e77c5688ecb8852b78080098c2fa600ebc21ee3f373de53fb4d94f5e630e")
      override
          fun kernelGatewayAppSettings(kernelGatewayAppSettings: KernelGatewayAppSettingsProperty.Builder.() -> Unit):
          Unit =
          kernelGatewayAppSettings(KernelGatewayAppSettingsProperty(kernelGatewayAppSettings))

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      override fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings.let(RStudioServerProAppSettingsProperty.Companion::unwrap))
      }

      /**
       * @param rStudioServerProAppSettings A collection of settings that configure user interaction
       * with the `RStudioServerPro` app.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe17757e26a97bb7fb822a64a0272e2f53e50f24d9b95af39c2da14767184022")
      override
          fun rStudioServerProAppSettings(rStudioServerProAppSettings: RStudioServerProAppSettingsProperty.Builder.() -> Unit):
          Unit =
          rStudioServerProAppSettings(RStudioServerProAppSettingsProperty(rStudioServerProAppSettings))

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
       * the domain uses for communication.
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      override fun sharingSettings(sharingSettings: IResolvable) {
        cdkBuilder.sharingSettings(sharingSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      override fun sharingSettings(sharingSettings: SharingSettingsProperty) {
        cdkBuilder.sharingSettings(sharingSettings.let(SharingSettingsProperty.Companion::unwrap))
      }

      /**
       * @param sharingSettings Specifies options for sharing Amazon SageMaker Studio notebooks.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("041646d4ca819762daa2e604bf5173280d6a4a5ac08a172dba6a4d4a589d8f15")
      override fun sharingSettings(sharingSettings: SharingSettingsProperty.Builder.() -> Unit):
          Unit = sharingSettings(SharingSettingsProperty(sharingSettings))

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: IResolvable) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      override fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty) {
        cdkBuilder.spaceStorageSettings(spaceStorageSettings.let(DefaultSpaceStorageSettingsProperty.Companion::unwrap))
      }

      /**
       * @param spaceStorageSettings The storage settings for a space.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52e04b39a0bbef7c03ae0431e80cfabcc922dc10d762b41ce484dc0006a1d40b")
      override
          fun spaceStorageSettings(spaceStorageSettings: DefaultSpaceStorageSettingsProperty.Builder.() -> Unit):
          Unit = spaceStorageSettings(DefaultSpaceStorageSettingsProperty(spaceStorageSettings))

      /**
       * @param studioWebPortal Whether the user can access Studio.
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       */
      override fun studioWebPortal(studioWebPortal: String) {
        cdkBuilder.studioWebPortal(studioWebPortal)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty,
    ) : CdkObject(cdkObject), UserSettingsProperty {
      /**
       * The Code Editor application settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-codeeditorappsettings)
       */
      override fun codeEditorAppSettings(): Any? = unwrap(this).getCodeEditorAppSettings()

      /**
       * The settings for assigning a custom file system to a user profile.
       *
       * Permitted users can access this file system in Amazon SageMaker Studio.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-customfilesystemconfigs)
       */
      override fun customFileSystemConfigs(): Any? = unwrap(this).getCustomFileSystemConfigs()

      /**
       * Details about the POSIX identity that is used for file system operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-customposixuserconfig)
       */
      override fun customPosixUserConfig(): Any? = unwrap(this).getCustomPosixUserConfig()

      /**
       * The default experience that the user is directed to when accessing the domain. The
       * supported values are:.
       *
       * * `studio::` : Indicates that Studio is the default experience. This value can only be
       * passed if `StudioWebPortal` is set to `ENABLED` .
       * * `app:JupyterServer:` : Indicates that Studio Classic is the default experience.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-defaultlandinguri)
       */
      override fun defaultLandingUri(): String? = unwrap(this).getDefaultLandingUri()

      /**
       * The execution role for the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-executionrole)
       */
      override fun executionRole(): String? = unwrap(this).getExecutionRole()

      /**
       * The settings for the JupyterLab application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-jupyterlabappsettings)
       */
      override fun jupyterLabAppSettings(): Any? = unwrap(this).getJupyterLabAppSettings()

      /**
       * The Jupyter server's app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-jupyterserverappsettings)
       */
      override fun jupyterServerAppSettings(): Any? = unwrap(this).getJupyterServerAppSettings()

      /**
       * The kernel gateway app settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-kernelgatewayappsettings)
       */
      override fun kernelGatewayAppSettings(): Any? = unwrap(this).getKernelGatewayAppSettings()

      /**
       * A collection of settings that configure user interaction with the `RStudioServerPro` app.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-rstudioserverproappsettings)
       */
      override fun rStudioServerProAppSettings(): Any? =
          unwrap(this).getRStudioServerProAppSettings()

      /**
       * The security groups for the Amazon Virtual Private Cloud (VPC) that the domain uses for
       * communication.
       *
       * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to
       * `PublicInternetOnly` .
       *
       * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` ,
       * unless specified as part of the `DefaultUserSettings` for the domain.
       *
       * Amazon SageMaker adds a security group to allow NFS traffic from Amazon SageMaker Studio.
       * Therefore, the number of security groups that you can specify is one less than the maximum
       * number shown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Specifies options for sharing Amazon SageMaker Studio notebooks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-sharingsettings)
       */
      override fun sharingSettings(): Any? = unwrap(this).getSharingSettings()

      /**
       * The storage settings for a space.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-spacestoragesettings)
       */
      override fun spaceStorageSettings(): Any? = unwrap(this).getSpaceStorageSettings()

      /**
       * Whether the user can access Studio.
       *
       * If this value is set to `DISABLED` , the user cannot access Studio, even if that is the
       * default experience for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-usersettings.html#cfn-sagemaker-userprofile-usersettings-studiowebportal)
       */
      override fun studioWebPortal(): String? = unwrap(this).getStudioWebPortal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty):
          UserSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? UserSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingsProperty):
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty
    }
  }
}
