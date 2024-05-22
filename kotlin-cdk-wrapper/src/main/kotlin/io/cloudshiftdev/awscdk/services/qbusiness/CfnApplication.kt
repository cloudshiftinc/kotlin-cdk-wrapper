@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q Business application.
 *
 *
 * There are new tiers for Amazon Q Business. Not all features in Amazon Q Business Pro are also
 * available in Amazon Q Business Lite. For information on what's included in Amazon Q Business Lite
 * and what's included in Amazon Q Business Pro, see [Amazon Q Business
 * tiers](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/tiers.html#user-sub-tiers) . You must
 * use the Amazon Q Business console to assign subscription tiers to users.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .displayName("displayName")
 * // the properties below are optional
 * .attachmentsConfiguration(AttachmentsConfigurationProperty.builder()
 * .attachmentsControlMode("attachmentsControlMode")
 * .build())
 * .description("description")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * Configuration information for the file upload during chat feature.
   */
  public open fun attachmentsConfiguration(): Any? = unwrap(this).getAttachmentsConfiguration()

  /**
   * Configuration information for the file upload during chat feature.
   */
  public open fun attachmentsConfiguration(`value`: IResolvable) {
    unwrap(this).setAttachmentsConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration information for the file upload during chat feature.
   */
  public open fun attachmentsConfiguration(`value`: AttachmentsConfigurationProperty) {
    unwrap(this).setAttachmentsConfiguration(`value`.let(AttachmentsConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration information for the file upload during chat feature.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15aa78d44bc3c78832a41e80730f4a2d3b6834b823b7556fcad660a170314190")
  public open
      fun attachmentsConfiguration(`value`: AttachmentsConfigurationProperty.Builder.() -> Unit):
      Unit = attachmentsConfiguration(AttachmentsConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the Amazon Q Business application.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * The identifier for the Amazon Q Business application.
   */
  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  /**
   * The Unix timestamp when the Amazon Q Business application was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon
   * Q Business application.
   */
  public open fun attrIdentityCenterApplicationArn(): String =
      unwrap(this).getAttrIdentityCenterApplicationArn()

  /**
   * The status of the Amazon Q Business application.
   *
   * The application is ready to use when the status is `ACTIVE` .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Unix timestamp when the Amazon Q Business application was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description for the Amazon Q Business application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the Amazon Q Business application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the Amazon Q Business application.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the Amazon Q Business application.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("243e720f80b1d275992cfe36234150694e42406a3507c37ba3fc0d22a92679d9")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
   * for—or connecting to—your Amazon Q Business application.
   */
  public open fun identityCenterInstanceArn(): String? = unwrap(this).getIdentityCenterInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
   * for—or connecting to—your Amazon Q Business application.
   */
  public open fun identityCenterInstanceArn(`value`: String) {
    unwrap(this).setIdentityCenterInstanceArn(`value`)
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
   * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch
   * logs and metrics.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon CloudWatch
   * logs and metrics.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business application.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business application.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize your Amazon Q Business application.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    public fun attachmentsConfiguration(attachmentsConfiguration: IResolvable)

    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    public fun attachmentsConfiguration(attachmentsConfiguration: AttachmentsConfigurationProperty)

    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76d3e55c3a81ef8356d1e1311fe80b80d2b93a375ea96af0e0918fdafd9c8b0")
    public
        fun attachmentsConfiguration(attachmentsConfiguration: AttachmentsConfigurationProperty.Builder.() -> Unit)

    /**
     * A description for the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-description)
     * @param description A description for the Amazon Q Business application. 
     */
    public fun description(description: String)

    /**
     * The name of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-displayname)
     * @param displayName The name of the Amazon Q Business application. 
     */
    public fun displayName(displayName: String)

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7532e7479f98c4d9c61e749161a682697696dbbe1cac6f86e91e8b260d51ade")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
     * for—or connecting to—your Amazon Q Business application.
     *
     * *Required* : `Yes`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitycenterinstancearn)
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application. 
     */
    public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon
     * CloudWatch logs and metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business application.
     *
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business application.
     *
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnApplication.Builder =
        software.amazon.awscdk.services.qbusiness.CfnApplication.Builder.create(scope, id)

    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    override fun attachmentsConfiguration(attachmentsConfiguration: IResolvable) {
      cdkBuilder.attachmentsConfiguration(attachmentsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    override
        fun attachmentsConfiguration(attachmentsConfiguration: AttachmentsConfigurationProperty) {
      cdkBuilder.attachmentsConfiguration(attachmentsConfiguration.let(AttachmentsConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration information for the file upload during chat feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-attachmentsconfiguration)
     * @param attachmentsConfiguration Configuration information for the file upload during chat
     * feature. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d76d3e55c3a81ef8356d1e1311fe80b80d2b93a375ea96af0e0918fdafd9c8b0")
    override
        fun attachmentsConfiguration(attachmentsConfiguration: AttachmentsConfigurationProperty.Builder.() -> Unit):
        Unit = attachmentsConfiguration(AttachmentsConfigurationProperty(attachmentsConfiguration))

    /**
     * A description for the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-description)
     * @param description A description for the Amazon Q Business application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the Amazon Q Business application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-displayname)
     * @param displayName The name of the Amazon Q Business application. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-encryptionconfiguration)
     * @param encryptionConfiguration Provides the identifier of the AWS KMS key used to encrypt
     * data indexed by Amazon Q Business. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7532e7479f98c4d9c61e749161a682697696dbbe1cac6f86e91e8b260d51ade")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance you are either creating
     * for—or connecting to—your Amazon Q Business application.
     *
     * *Required* : `Yes`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-identitycenterinstancearn)
     * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
     * instance you are either creating for—or connecting to—your Amazon Q Business application. 
     */
    override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
      cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permissions to access your Amazon
     * CloudWatch logs and metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permissions to access your
     * Amazon CloudWatch logs and metrics. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business application.
     *
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize your Amazon Q Business application.
     *
     * You can also use tags to help control access to the application. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-application.html#cfn-qbusiness-application-tags)
     * @param tags A list of key-value pairs that identify or categorize your Amazon Q Business
     * application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.qbusiness.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnApplication
  }

  /**
   * Configuration information for the file upload during chat feature.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * AttachmentsConfigurationProperty attachmentsConfigurationProperty =
   * AttachmentsConfigurationProperty.builder()
   * .attachmentsControlMode("attachmentsControlMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-attachmentsconfiguration.html)
   */
  public interface AttachmentsConfigurationProperty {
    /**
     * Status information about whether file upload functionality is activated or deactivated for
     * your end user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-attachmentsconfiguration.html#cfn-qbusiness-application-attachmentsconfiguration-attachmentscontrolmode)
     */
    public fun attachmentsControlMode(): String

    /**
     * A builder for [AttachmentsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentsControlMode Status information about whether file upload functionality is
       * activated or deactivated for your end user. 
       */
      public fun attachmentsControlMode(attachmentsControlMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty.builder()

      /**
       * @param attachmentsControlMode Status information about whether file upload functionality is
       * activated or deactivated for your end user. 
       */
      override fun attachmentsControlMode(attachmentsControlMode: String) {
        cdkBuilder.attachmentsControlMode(attachmentsControlMode)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty,
    ) : CdkObject(cdkObject), AttachmentsConfigurationProperty {
      /**
       * Status information about whether file upload functionality is activated or deactivated for
       * your end user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-attachmentsconfiguration.html#cfn-qbusiness-application-attachmentsconfiguration-attachmentscontrolmode)
       */
      override fun attachmentsControlMode(): String = unwrap(this).getAttachmentsControlMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttachmentsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty):
          AttachmentsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AttachmentsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttachmentsConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnApplication.AttachmentsConfigurationProperty
    }
  }

  /**
   * Provides the identifier of the AWS KMS key used to encrypt data indexed by Amazon Q Business.
   *
   * Amazon Q Business doesn't support asymmetric keys.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The identifier of the AWS KMS key.
     *
     * Amazon Q Business doesn't support asymmetric keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-encryptionconfiguration.html#cfn-qbusiness-application-encryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The identifier of the AWS KMS key.
       * Amazon Q Business doesn't support asymmetric keys.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyId The identifier of the AWS KMS key.
       * Amazon Q Business doesn't support asymmetric keys.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The identifier of the AWS KMS key.
       *
       * Amazon Q Business doesn't support asymmetric keys.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-application-encryptionconfiguration.html#cfn-qbusiness-application-encryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnApplication.EncryptionConfigurationProperty
    }
  }
}
