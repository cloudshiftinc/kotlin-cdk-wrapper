package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRepositoryProps {
  /**
   * If true, deleting the repository force deletes the contents of the repository.
   *
   * If false, the repository must be empty before attempting to delete it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
   */
  public fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The image scanning configuration for the repository.
   *
   * This determines whether images are scanned for known vulnerabilities after being pushed to the
   * repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
   */
  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  /**
   * The tag mutability setting for the repository.
   *
   * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
   * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
   * will be immutable which will prevent them from being overwritten.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagetagmutability)
   */
  public fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

  /**
   * Creates or updates a lifecycle policy.
   *
   * For information about lifecycle policy syntax, see [Lifecycle policy
   * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
   */
  public fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

  /**
   * The name to use for the repository.
   *
   * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
   * prepended with a namespace to group the repository into a category (such as
   * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
   * physical ID and uses that ID for the repository name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * The repository name must start with a letter and can only contain lowercase letters, numbers,
   * hyphens, underscores, and forward slashes.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
   */
  public fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * The JSON repository policy text to apply to the repository.
   *
   * For more information, see [Amazon ECR repository
   * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
   * in the *Amazon Elastic Container Registry User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
   */
  public fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRepositoryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    public fun emptyOnDelete(emptyOnDelete: Boolean)

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    public fun emptyOnDelete(emptyOnDelete: IResolvable)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7f36d752f56955edfe0025b1a9908ee8542425c0d1379177764700c8b832694")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty)

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49f0be97e9428f2e67799de6769d6bff0341ad295b3ac9d6fd3cdef8468577ec")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
     * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    public fun lifecyclePolicy(lifecyclePolicy: IResolvable)

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    public fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty)

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c62f429d64bc7f256441fc625717a8ef174982dc49aceb3d0513fa8af1589f8")
    public
        fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit)

    /**
     * @param repositoryName The name to use for the repository.
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository.
     * For more information, see [Amazon ECR repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     * in the *Amazon Elastic Container Registry User Guide* .
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRepositoryProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRepositoryProps.builder()

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository.
     * If false, the repository must be empty before attempting to delete it.
     */
    override fun emptyOnDelete(emptyOnDelete: IResolvable) {
      cdkBuilder.emptyOnDelete(emptyOnDelete.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnRepository.EncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration for the repository.
     * This determines how the contents of your repository are encrypted at rest.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7f36d752f56955edfe0025b1a9908ee8542425c0d1379177764700c8b832694")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnRepository.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnRepository.ImageScanningConfigurationProperty::unwrap))
    }

    /**
     * @param imageScanningConfiguration The image scanning configuration for the repository.
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49f0be97e9428f2e67799de6769d6bff0341ad295b3ac9d6fd3cdef8468577ec")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnRepository.ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * @param imageTagMutability The tag mutability setting for the repository.
     * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
     * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    override fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(IResolvable::unwrap))
    }

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    override fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(CfnRepository.LifecyclePolicyProperty::unwrap))
    }

    /**
     * @param lifecyclePolicy Creates or updates a lifecycle policy.
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c62f429d64bc7f256441fc625717a8ef174982dc49aceb3d0513fa8af1589f8")
    override
        fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty.Builder.() -> Unit):
        Unit = lifecyclePolicy(CfnRepository.LifecyclePolicyProperty(lifecyclePolicy))

    /**
     * @param repositoryName The name to use for the repository.
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository.
     * For more information, see [Amazon ECR repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     * in the *Amazon Elastic Container Registry User Guide* .
     */
    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepositoryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryProps,
  ) : CdkObject(cdkObject), CfnRepositoryProps {
    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
     */
    override fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     */
    override fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
     * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagetagmutability)
     */
    override fun imageTagMutability(): String? = unwrap(this).getImageTagMutability()

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     */
    override fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

    /**
     * The name to use for the repository.
     *
     * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
     * prepended with a namespace to group the repository into a category (such as
     * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the repository name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The repository name must start with a letter and can only contain lowercase letters, numbers,
     * hyphens, underscores, and forward slashes.
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
     */
    override fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see [Amazon ECR repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     * in the *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
     */
    override fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepositoryProps):
        CfnRepositoryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryProps):
        software.amazon.awscdk.services.ecr.CfnRepositoryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.CfnRepositoryProps
  }
}
