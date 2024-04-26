@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

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
 * Properties for defining a `CfnRepositoryCreationTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnRepositoryCreationTemplateProps cfnRepositoryCreationTemplateProps =
 * CfnRepositoryCreationTemplateProps.builder()
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
public interface CfnRepositoryCreationTemplateProps {
  /**
   * A list of enumerable Strings representing the repository creation scenarios that the template
   * will apply towards.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
   */
  public fun appliedFor(): List<String>

  /**
   * The description of the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The image tag mutability setting for the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
   */
  public fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  /**
   * The JSON lifecycle policy text to apply to the repository.
   *
   * For information about lifecycle policy syntax, see
   * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
   */
  public fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  /**
   * The prefix use to match the repository name and apply the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
   */
  public fun prefix(): String

  /**
   * The JSON repository policy text to apply to the repository.
   *
   * For more information, see
   * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
   */
  public fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

  /**
   * The tags attached to the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * A builder for [CfnRepositoryCreationTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    public fun appliedFor(appliedFor: List<String>)

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    public fun appliedFor(vararg appliedFor: String)

    /**
     * @param description The description of the template.
     */
    public fun description(description: String)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd019c1895592a4d64cf2c324d1c534de99fb7971c879d08793a0cc2a51e8c13")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageTagMutability The image tag mutability setting for the repository.
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * @param lifecyclePolicy The JSON lifecycle policy text to apply to the repository.
     * For information about lifecycle policy syntax, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
     */
    public fun lifecyclePolicy(lifecyclePolicy: String)

    /**
     * @param prefix The prefix use to match the repository name and apply the template. 
     */
    public fun prefix(prefix: String)

    /**
     * @param repositoryPolicy The JSON repository policy text to apply to the repository.
     * For more information, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
     */
    public fun repositoryPolicy(repositoryPolicy: String)

    /**
     * @param resourceTags The tags attached to the resource.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags The tags attached to the resource.
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags The tags attached to the resource.
     */
    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps.builder()

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    override fun appliedFor(appliedFor: List<String>) {
      cdkBuilder.appliedFor(appliedFor)
    }

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that the template will apply towards. 
     */
    override fun appliedFor(vararg appliedFor: String): Unit = appliedFor(appliedFor.toList())

    /**
     * @param description The description of the template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnRepositoryCreationTemplate.EncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository. This
     * determines how the contents of your repository are encrypted at rest.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd019c1895592a4d64cf2c324d1c534de99fb7971c879d08793a0cc2a51e8c13")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnRepositoryCreationTemplate.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param imageTagMutability The image tag mutability setting for the repository.
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * @param lifecyclePolicy The JSON lifecycle policy text to apply to the repository.
     * For information about lifecycle policy syntax, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
     */
    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * @param prefix The prefix use to match the repository name and apply the template. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param repositoryPolicy The JSON repository policy text to apply to the repository.
     * For more information, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
     */
    override fun repositoryPolicy(repositoryPolicy: String) {
      cdkBuilder.repositoryPolicy(repositoryPolicy)
    }

    /**
     * @param resourceTags The tags attached to the resource.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * @param resourceTags The tags attached to the resource.
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param resourceTags The tags attached to the resource.
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps,
  ) : CdkObject(cdkObject), CfnRepositoryCreationTemplateProps {
    /**
     * A list of enumerable Strings representing the repository creation scenarios that the template
     * will apply towards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     */
    override fun appliedFor(): List<String> = unwrap(this).getAppliedFor()

    /**
     * The description of the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The image tag mutability setting for the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     */
    override fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

    /**
     * The JSON lifecycle policy text to apply to the repository.
     *
     * For information about lifecycle policy syntax, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     */
    override fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

    /**
     * The prefix use to match the repository name and apply the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     */
    override fun prefix(): String = unwrap(this).getPrefix()

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see
     * https://docs.aws.amazon.com/AmazonECR/latest/userguide/RepositoryPolicyExamples.html
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     */
    override fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

    /**
     * The tags attached to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryCreationTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps):
        CfnRepositoryCreationTemplateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRepositoryCreationTemplateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryCreationTemplateProps):
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps
  }
}
