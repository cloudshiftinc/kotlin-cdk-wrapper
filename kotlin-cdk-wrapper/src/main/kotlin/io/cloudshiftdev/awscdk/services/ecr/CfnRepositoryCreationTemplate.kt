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
 * AWS::ECR::RepositoryCreationTemplate is used to create repository with configuration from a
 * pre-defined template.
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
) : CfnResource(cdkObject), IInspectable {
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
   * A list of enumerable Strings representing the repository creation scenarios that the template
   * will apply towards.
   */
  public open fun appliedFor(): List<String> = unwrap(this).getAppliedFor()

  /**
   * A list of enumerable Strings representing the repository creation scenarios that the template
   * will apply towards.
   */
  public open fun appliedFor(`value`: List<String>) {
    unwrap(this).setAppliedFor(`value`)
  }

  /**
   * A list of enumerable Strings representing the repository creation scenarios that the template
   * will apply towards.
   */
  public open fun appliedFor(vararg `value`: String): Unit = appliedFor(`value`.toList())

  /**
   * Create timestamp of the template.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Update timestamp of the template.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The description of the template.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the template.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0615e622a0ea6b7667d6f0352968d9c0b77e1f2d4905736dec3072d9ba5ce92e")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * The image tag mutability setting for the repository.
   */
  public open fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  /**
   * The image tag mutability setting for the repository.
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
   * The JSON lifecycle policy text to apply to the repository.
   */
  public open fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  /**
   * The JSON lifecycle policy text to apply to the repository.
   */
  public open fun lifecyclePolicy(`value`: String) {
    unwrap(this).setLifecyclePolicy(`value`)
  }

  /**
   * The prefix use to match the repository name and apply the template.
   */
  public open fun prefix(): String = unwrap(this).getPrefix()

  /**
   * The prefix use to match the repository name and apply the template.
   */
  public open fun prefix(`value`: String) {
    unwrap(this).setPrefix(`value`)
  }

  /**
   * The JSON repository policy text to apply to the repository.
   */
  public open fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

  /**
   * The JSON repository policy text to apply to the repository.
   */
  public open fun repositoryPolicy(`value`: String) {
    unwrap(this).setRepositoryPolicy(`value`)
  }

  /**
   * The tags attached to the resource.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The tags attached to the resource.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The tags attached to the resource.
   */
  public open fun resourceTags(`value`: List<Any>) {
    unwrap(this).setResourceTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The tags attached to the resource.
   */
  public open fun resourceTags(vararg `value`: Any): Unit = resourceTags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRepositoryCreationTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of enumerable Strings representing the repository creation scenarios that the template
     * will apply towards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    public fun appliedFor(appliedFor: List<String>)

    /**
     * A list of enumerable Strings representing the repository creation scenarios that the template
     * will apply towards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    public fun appliedFor(vararg appliedFor: String)

    /**
     * The description of the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     * @param description The description of the template. 
     */
    public fun description(description: String)

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bfe268586d293bebc28c5576956fc7f90e2692aa08fc8ec8cde003fcd52e83")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The image tag mutability setting for the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     * @param imageTagMutability The image tag mutability setting for the repository. 
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * The JSON lifecycle policy text to apply to the repository.
     *
     * For information about lifecycle policy syntax, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     * @param lifecyclePolicy The JSON lifecycle policy text to apply to the repository. 
     */
    public fun lifecyclePolicy(lifecyclePolicy: String)

    /**
     * The prefix use to match the repository name and apply the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     * @param prefix The prefix use to match the repository name and apply the template. 
     */
    public fun prefix(prefix: String)

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     * @param repositoryPolicy The JSON repository policy text to apply to the repository. 
     */
    public fun repositoryPolicy(repositoryPolicy: String)

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
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
     * A list of enumerable Strings representing the repository creation scenarios that the template
     * will apply towards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    override fun appliedFor(appliedFor: List<String>) {
      cdkBuilder.appliedFor(appliedFor)
    }

    /**
     * A list of enumerable Strings representing the repository creation scenarios that the template
     * will apply towards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    override fun appliedFor(vararg appliedFor: String): Unit = appliedFor(appliedFor.toList())

    /**
     * The description of the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     * @param description The description of the template. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The encryption configuration for the repository. This determines how the contents of your
     * repository are encrypted at rest.
     *
     * By default, when no encryption configuration is set or the `AES256` encryption type is used,
     * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts
     * your data at rest using an AES-256 encryption algorithm. This does not require any action on
     * your part.
     *
     * For more control over the encryption of the contents of your repository, you can use
     * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service
     * ( AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
     * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
     * *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bfe268586d293bebc28c5576956fc7f90e2692aa08fc8ec8cde003fcd52e83")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The image tag mutability setting for the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     * @param imageTagMutability The image tag mutability setting for the repository. 
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * The JSON lifecycle policy text to apply to the repository.
     *
     * For information about lifecycle policy syntax, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     * @param lifecyclePolicy The JSON lifecycle policy text to apply to the repository. 
     */
    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * The prefix use to match the repository name and apply the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     * @param prefix The prefix use to match the repository name and apply the template. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     * @param repositoryPolicy The JSON repository policy text to apply to the repository. 
     */
    override fun repositoryPolicy(repositoryPolicy: String) {
      cdkBuilder.repositoryPolicy(repositoryPolicy)
    }

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     * @param resourceTags The tags attached to the resource. 
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
   * data at rest using an AES-256 encryption algorithm. This does not require any action on your part.
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
     * or specify your own AWS KMS key, which you already created. For more information, see
     * [Protecting data using server-side encryption with an AWS KMS key stored in AWS Key Management
     * Service (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in
     * the *Amazon Simple Storage Service Console Developer Guide* .
     *
     * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
     * S3-managed encryption keys which encrypts the images in the repository using an AES-256
     * encryption algorithm. For more information, see [Protecting data using server-side encryption
     * with Amazon S3-managed encryption keys
     * (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html) in the
     * *Amazon Simple Storage Service Console Developer Guide* .
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
       * Amazon ECR, or specify your own AWS KMS key, which you already created. For more information,
       * see [Protecting data using server-side encryption with an AWS KMS key stored in AWS Key
       * Management Service
       * (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the
       * *Amazon Simple Storage Service Console Developer Guide* .
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES-256
       * encryption algorithm. For more information, see [Protecting data using server-side encryption
       * with Amazon S3-managed encryption keys
       * (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html) in
       * the *Amazon Simple Storage Service Console Developer Guide* .
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
       * Amazon ECR, or specify your own AWS KMS key, which you already created. For more information,
       * see [Protecting data using server-side encryption with an AWS KMS key stored in AWS Key
       * Management Service
       * (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the
       * *Amazon Simple Storage Service Console Developer Guide* .
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES-256
       * encryption algorithm. For more information, see [Protecting data using server-side encryption
       * with Amazon S3-managed encryption keys
       * (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html) in
       * the *Amazon Simple Storage Service Console Developer Guide* .
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
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The encryption type to use.
       *
       * If you use the `KMS` encryption type, the contents of the repository will be encrypted
       * using server-side encryption with AWS Key Management Service key stored in AWS KMS . When you
       * use AWS KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for
       * Amazon ECR, or specify your own AWS KMS key, which you already created. For more information,
       * see [Protecting data using server-side encryption with an AWS KMS key stored in AWS Key
       * Management Service
       * (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the
       * *Amazon Simple Storage Service Console Developer Guide* .
       *
       * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
       * S3-managed encryption keys which encrypts the images in the repository using an AES-256
       * encryption algorithm. For more information, see [Protecting data using server-side encryption
       * with Amazon S3-managed encryption keys
       * (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html) in
       * the *Amazon Simple Storage Service Console Developer Guide* .
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
