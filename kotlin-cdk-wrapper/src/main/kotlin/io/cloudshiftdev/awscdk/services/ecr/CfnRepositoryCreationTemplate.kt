@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * The details of the repository creation template associated with the request.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnRepositoryCreationTemplate cfnRepositoryCreationTemplate =
 * CfnRepositoryCreationTemplate.Builder.create(this, "MyCfnRepositoryCreationTemplate")
 * .appliedFor(List.of("appliedFor"))
 * .prefix("prefix")
 * // the properties below are optional
 * .customRoleArn("customRoleArn")
 * .description("description")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionType("encryptionType")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .imageTagMutability("imageTagMutability")
 * .lifecyclePolicy("lifecyclePolicy")
 * .repositoryPolicy("repositoryPolicy")
 * .resourceTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html)
 */
public open class CfnRepositoryCreationTemplate(
  cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryCreationTemplateProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRepositoryCreationTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryCreationTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRepositoryCreationTemplateProps(props)
  )

  /**
   * A list of enumerable Strings representing the repository creation scenarios that this template
   * will apply towards.
   */
  public open fun appliedFor(): List<String> = unwrap(this).getAppliedFor()

  /**
   * A list of enumerable Strings representing the repository creation scenarios that this template
   * will apply towards.
   */
  public open fun appliedFor(`value`: List<String>) {
    unwrap(this).setAppliedFor(`value`)
  }

  /**
   * A list of enumerable Strings representing the repository creation scenarios that this template
   * will apply towards.
   */
  public open fun appliedFor(vararg `value`: String): Unit = appliedFor(`value`.toList())

  /**
   * The date and time, in JavaScript date format, when the repository creation template was
   * created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The date and time, in JavaScript date format, when the repository creation template was last
   * updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The ARN of the role to be assumed by Amazon ECR.
   */
  public open fun customRoleArn(): String? = unwrap(this).getCustomRoleArn()

  /**
   * The ARN of the role to be assumed by Amazon ECR.
   */
  public open fun customRoleArn(`value`: String) {
    unwrap(this).setCustomRoleArn(`value`)
  }

  /**
   * The description associated with the repository creation template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description associated with the repository creation template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The encryption configuration associated with the repository creation template.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The encryption configuration associated with the repository creation template.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption configuration associated with the repository creation template.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The encryption configuration associated with the repository creation template.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0615e622a0ea6b7667d6f0352968d9c0b77e1f2d4905736dec3072d9ba5ce92e")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * The tag mutability setting for the repository.
   */
  public open fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  /**
   * The tag mutability setting for the repository.
   */
  public open fun imageTagMutability(`value`: String) {
    unwrap(this).setImageTagMutability(`value`)
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
   * The lifecycle policy to use for repositories created using the template.
   */
  public open fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  /**
   * The lifecycle policy to use for repositories created using the template.
   */
  public open fun lifecyclePolicy(`value`: String) {
    unwrap(this).setLifecyclePolicy(`value`)
  }

  /**
   * The repository namespace prefix associated with the repository creation template.
   */
  public open fun prefix(): String = unwrap(this).getPrefix()

  /**
   * The repository namespace prefix associated with the repository creation template.
   */
  public open fun prefix(`value`: String) {
    unwrap(this).setPrefix(`value`)
  }

  /**
   * he repository policy to apply to repositories created using the template.
   */
  public open fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

  /**
   * he repository policy to apply to repositories created using the template.
   */
  public open fun repositoryPolicy(`value`: String) {
    unwrap(this).setRepositoryPolicy(`value`)
  }

  /**
   * The metadata to apply to the repository to help you categorize and organize.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The metadata to apply to the repository to help you categorize and organize.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The metadata to apply to the repository to help you categorize and organize.
   */
  public open fun resourceTags(`value`: List<Any>) {
    unwrap(this).setResourceTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The metadata to apply to the repository to help you categorize and organize.
   */
  public open fun resourceTags(vararg `value`: Any): Unit = resourceTags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRepositoryCreationTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of enumerable Strings representing the repository creation scenarios that this
     * template will apply towards.
     *
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     */
    public fun appliedFor(appliedFor: List<String>)

    /**
     * A list of enumerable Strings representing the repository creation scenarios that this
     * template will apply towards.
     *
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     */
    public fun appliedFor(vararg appliedFor: String)

    /**
     * The ARN of the role to be assumed by Amazon ECR.
     *
     * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this
     * field isn't specified, Amazon ECR will use the service-linked role for the repository creation
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-customrolearn)
     * @param customRoleArn The ARN of the role to be assumed by Amazon ECR. 
     */
    public fun customRoleArn(customRoleArn: String)

    /**
     * The description associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     * @param description The description associated with the repository creation template. 
     */
    public fun description(description: String)

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bfe268586d293bebc28c5576956fc7f90e2692aa08fc8ec8cde003fcd52e83")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     * @param imageTagMutability The tag mutability setting for the repository. 
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * The lifecycle policy to use for repositories created using the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     * @param lifecyclePolicy The lifecycle policy to use for repositories created using the
     * template. 
     */
    public fun lifecyclePolicy(lifecyclePolicy: String)

    /**
     * The repository namespace prefix associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     * @param prefix The repository namespace prefix associated with the repository creation
     * template. 
     */
    public fun prefix(prefix: String)

    /**
     * he repository policy to apply to repositories created using the template.
     *
     * A repository policy is a permissions policy associated with a repository to control access
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     * @param repositoryPolicy he repository policy to apply to repositories created using the
     * template. 
     */
    public fun repositoryPolicy(repositoryPolicy: String)

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.Builder =
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.Builder.create(scope, id)

    /**
     * A list of enumerable Strings representing the repository creation scenarios that this
     * template will apply towards.
     *
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     */
    override fun appliedFor(appliedFor: List<String>) {
      cdkBuilder.appliedFor(appliedFor)
    }

    /**
     * A list of enumerable Strings representing the repository creation scenarios that this
     * template will apply towards.
     *
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     */
    override fun appliedFor(vararg appliedFor: String): Unit = appliedFor(appliedFor.toList())

    /**
     * The ARN of the role to be assumed by Amazon ECR.
     *
     * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this
     * field isn't specified, Amazon ECR will use the service-linked role for the repository creation
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-customrolearn)
     * @param customRoleArn The ARN of the role to be assumed by Amazon ECR. 
     */
    override fun customRoleArn(customRoleArn: String) {
      cdkBuilder.customRoleArn(customRoleArn)
    }

    /**
     * The description associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     * @param description The description associated with the repository creation template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bfe268586d293bebc28c5576956fc7f90e2692aa08fc8ec8cde003fcd52e83")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     * @param imageTagMutability The tag mutability setting for the repository. 
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * The lifecycle policy to use for repositories created using the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     * @param lifecyclePolicy The lifecycle policy to use for repositories created using the
     * template. 
     */
    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * The repository namespace prefix associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     * @param prefix The repository namespace prefix associated with the repository creation
     * template. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * he repository policy to apply to repositories created using the template.
     *
     * A repository policy is a permissions policy associated with a repository to control access
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     * @param repositoryPolicy he repository policy to apply to repositories created using the
     * template. 
     */
    override fun repositoryPolicy(repositoryPolicy: String) {
      cdkBuilder.repositoryPolicy(repositoryPolicy)
    }

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize. 
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepositoryCreationTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepositoryCreationTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate):
        CfnRepositoryCreationTemplate = CfnRepositoryCreationTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryCreationTemplate):
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate
  }

  /**
   * The encryption configuration for the repository. This determines how the contents of your
   * repository are encrypted at rest.
   *
   * By default, when no encryption configuration is set or the `AES256` encryption type is used,
   * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts your
   * data at rest using an AES256 encryption algorithm. This does not require any action on your part.
   *
   * For more control over the encryption of the contents of your repository, you can use
   * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service (
   * AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
   * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
   * *Amazon Elastic Container Registry User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .encryptionType("encryptionType")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repositorycreationtemplate-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The encryption type to use.
     *
     * If you use the `KMS` encryption type, the contents of the repository will be encrypted using
     * server-side encryption with AWS Key Management Service key stored in AWS KMS . When you use AWS
     * KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for Amazon ECR,
     * or specify your own AWS KMS key, which you already created.
     *
     * If you use the `KMS_DSSE` encryption type, the contents of the repository will be encrypted
     * with two layers of encryption using server-side encryption with the AWS KMS Management Service
     * key stored in AWS KMS . Similar to the `KMS` encryption type, you can either use the default AWS
     * managed AWS KMS key for Amazon ECR, or specify your own AWS KMS key, which you've already
     * created.
     *
     * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
     * S3-managed encryption keys which encrypts the images in the repository using an AES256
     * encryption algorithm.
     *
     * For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repositorycreationtemplate-encryptionconfiguration.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * If you use the `KMS` encryption type, specify the AWS KMS key to use for encryption.
     *
     * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in the
     * same Region as the repository. If no key is specified, the default AWS managed AWS KMS key for
     * Amazon ECR will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repositorycreationtemplate-encryptionconfiguration.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration-kmskey)
     */
    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionType The encryption type to use. 
       * If you use the `KMS` encryption type, the contents of the repository will be encrypted
       * using server-side encryption with AWS Key Management Service key stored in AWS KMS . When you
       * use AWS KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for
       * Amazon ECR, or specify your own AWS KMS key, which you already created.
       *
       * If you use the `KMS_DSSE` encryption type, the contents of the repository will be encrypted
       * with two layers of encryption using server-side encryption with the AWS KMS Management Service
       * key stored in AWS KMS . Similar to the `KMS` encryption type, you can either use the default
       * AWS managed AWS KMS key for Amazon ECR, or specify your own AWS KMS key, which you've already
       * created.
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES256
       * encryption algorithm.
       *
       * For more information, see [Amazon ECR encryption at
       * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
       * *Amazon Elastic Container Registry User Guide* .
       */
      public fun encryptionType(encryptionType: String)

      /**
       * @param kmsKey If you use the `KMS` encryption type, specify the AWS KMS key to use for
       * encryption.
       * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in
       * the same Region as the repository. If no key is specified, the default AWS managed AWS KMS key
       * for Amazon ECR will be used.
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.builder()

      /**
       * @param encryptionType The encryption type to use. 
       * If you use the `KMS` encryption type, the contents of the repository will be encrypted
       * using server-side encryption with AWS Key Management Service key stored in AWS KMS . When you
       * use AWS KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for
       * Amazon ECR, or specify your own AWS KMS key, which you already created.
       *
       * If you use the `KMS_DSSE` encryption type, the contents of the repository will be encrypted
       * with two layers of encryption using server-side encryption with the AWS KMS Management Service
       * key stored in AWS KMS . Similar to the `KMS` encryption type, you can either use the default
       * AWS managed AWS KMS key for Amazon ECR, or specify your own AWS KMS key, which you've already
       * created.
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES256
       * encryption algorithm.
       *
       * For more information, see [Amazon ECR encryption at
       * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
       * *Amazon Elastic Container Registry User Guide* .
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      /**
       * @param kmsKey If you use the `KMS` encryption type, specify the AWS KMS key to use for
       * encryption.
       * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in
       * the same Region as the repository. If no key is specified, the default AWS managed AWS KMS key
       * for Amazon ECR will be used.
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        EncryptionConfigurationProperty {
      /**
       * The encryption type to use.
       *
       * If you use the `KMS` encryption type, the contents of the repository will be encrypted
       * using server-side encryption with AWS Key Management Service key stored in AWS KMS . When you
       * use AWS KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for
       * Amazon ECR, or specify your own AWS KMS key, which you already created.
       *
       * If you use the `KMS_DSSE` encryption type, the contents of the repository will be encrypted
       * with two layers of encryption using server-side encryption with the AWS KMS Management Service
       * key stored in AWS KMS . Similar to the `KMS` encryption type, you can either use the default
       * AWS managed AWS KMS key for Amazon ECR, or specify your own AWS KMS key, which you've already
       * created.
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES256
       * encryption algorithm.
       *
       * For more information, see [Amazon ECR encryption at
       * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
       * *Amazon Elastic Container Registry User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repositorycreationtemplate-encryptionconfiguration.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      /**
       * If you use the `KMS` encryption type, specify the AWS KMS key to use for encryption.
       *
       * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in
       * the same Region as the repository. If no key is specified, the default AWS managed AWS KMS key
       * for Amazon ECR will be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repositorycreationtemplate-encryptionconfiguration.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplate.EncryptionConfigurationProperty
    }
  }
}
