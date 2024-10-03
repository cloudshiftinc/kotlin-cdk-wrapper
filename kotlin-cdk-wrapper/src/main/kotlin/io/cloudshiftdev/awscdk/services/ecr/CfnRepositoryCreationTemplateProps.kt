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
public interface CfnRepositoryCreationTemplateProps {
  /**
   * A list of enumerable Strings representing the repository creation scenarios that this template
   * will apply towards.
   *
   * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
   */
  public fun appliedFor(): List<String>

  /**
   * The ARN of the role to be assumed by Amazon ECR.
   *
   * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this field
   * isn't specified, Amazon ECR will use the service-linked role for the repository creation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-customrolearn)
   */
  public fun customRoleArn(): String? = unwrap(this).getCustomRoleArn()

  /**
   * The description associated with the repository creation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The encryption configuration associated with the repository creation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The tag mutability setting for the repository.
   *
   * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
   * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository will
   * be immutable which will prevent them from being overwritten.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
   */
  public fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  /**
   * The lifecycle policy to use for repositories created using the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
   */
  public fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  /**
   * The repository namespace prefix associated with the repository creation template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
   */
  public fun prefix(): String

  /**
   * he repository policy to apply to repositories created using the template.
   *
   * A repository policy is a permissions policy associated with a repository to control access
   * permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
   */
  public fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

  /**
   * The metadata to apply to the repository to help you categorize and organize.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
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
     * that this template will apply towards. 
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     */
    public fun appliedFor(appliedFor: List<String>)

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     */
    public fun appliedFor(vararg appliedFor: String)

    /**
     * @param customRoleArn The ARN of the role to be assumed by Amazon ECR.
     * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this
     * field isn't specified, Amazon ECR will use the service-linked role for the repository creation
     * template.
     */
    public fun customRoleArn(customRoleArn: String)

    /**
     * @param description The description associated with the repository creation template.
     */
    public fun description(description: String)

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd019c1895592a4d64cf2c324d1c534de99fb7971c879d08793a0cc2a51e8c13")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * @param lifecyclePolicy The lifecycle policy to use for repositories created using the
     * template.
     */
    public fun lifecyclePolicy(lifecyclePolicy: String)

    /**
     * @param prefix The repository namespace prefix associated with the repository creation
     * template. 
     */
    public fun prefix(prefix: String)

    /**
     * @param repositoryPolicy he repository policy to apply to repositories created using the
     * template.
     * A repository policy is a permissions policy associated with a repository to control access
     * permissions.
     */
    public fun repositoryPolicy(repositoryPolicy: String)

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun resourceTags(resourceTags: List<Any>)

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun resourceTags(vararg resourceTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps.builder()

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     */
    override fun appliedFor(appliedFor: List<String>) {
      cdkBuilder.appliedFor(appliedFor)
    }

    /**
     * @param appliedFor A list of enumerable Strings representing the repository creation scenarios
     * that this template will apply towards. 
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     */
    override fun appliedFor(vararg appliedFor: String): Unit = appliedFor(appliedFor.toList())

    /**
     * @param customRoleArn The ARN of the role to be assumed by Amazon ECR.
     * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this
     * field isn't specified, Amazon ECR will use the service-linked role for the repository creation
     * template.
     */
    override fun customRoleArn(customRoleArn: String) {
      cdkBuilder.customRoleArn(customRoleArn)
    }

    /**
     * @param description The description associated with the repository creation template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with the repository
     * creation template.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd019c1895592a4d64cf2c324d1c534de99fb7971c879d08793a0cc2a51e8c13")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepositoryCreationTemplate.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnRepositoryCreationTemplate.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * @param lifecyclePolicy The lifecycle policy to use for repositories created using the
     * template.
     */
    override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * @param prefix The repository namespace prefix associated with the repository creation
     * template. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param repositoryPolicy he repository policy to apply to repositories created using the
     * template.
     * A repository policy is a permissions policy associated with a repository to control access
     * permissions.
     */
    override fun repositoryPolicy(repositoryPolicy: String) {
      cdkBuilder.repositoryPolicy(repositoryPolicy)
    }

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun resourceTags(resourceTags: List<Any>) {
      cdkBuilder.resourceTags(resourceTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param resourceTags The metadata to apply to the repository to help you categorize and
     * organize.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun resourceTags(vararg resourceTags: Any): Unit = resourceTags(resourceTags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryCreationTemplateProps,
  ) : CdkObject(cdkObject),
      CfnRepositoryCreationTemplateProps {
    /**
     * A list of enumerable Strings representing the repository creation scenarios that this
     * template will apply towards.
     *
     * The two supported scenarios are PULL_THROUGH_CACHE and REPLICATION
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-appliedfor)
     */
    override fun appliedFor(): List<String> = unwrap(this).getAppliedFor()

    /**
     * The ARN of the role to be assumed by Amazon ECR.
     *
     * Amazon ECR will assume your supplied role when the customRoleArn is specified. When this
     * field isn't specified, Amazon ECR will use the service-linked role for the repository creation
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-customrolearn)
     */
    override fun customRoleArn(): String? = unwrap(this).getCustomRoleArn()

    /**
     * The description associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The encryption configuration associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
     * image tags to be overwritten. If IMMUTABLE is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-imagetagmutability)
     */
    override fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

    /**
     * The lifecycle policy to use for repositories created using the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-lifecyclepolicy)
     */
    override fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

    /**
     * The repository namespace prefix associated with the repository creation template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-prefix)
     */
    override fun prefix(): String = unwrap(this).getPrefix()

    /**
     * he repository policy to apply to repositories created using the template.
     *
     * A repository policy is a permissions policy associated with a repository to control access
     * permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repositorycreationtemplate.html#cfn-ecr-repositorycreationtemplate-repositorypolicy)
     */
    override fun repositoryPolicy(): String? = unwrap(this).getRepositoryPolicy()

    /**
     * The metadata to apply to the repository to help you categorize and organize.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
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
