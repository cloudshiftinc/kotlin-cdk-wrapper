@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECR::Repository` resource specifies an Amazon Elastic Container Registry (Amazon ECR)
 * repository, where users can push and pull Docker images, Open Container Initiative (OCI) images, and
 * OCI compatible artifacts.
 *
 * For more information, see [Amazon ECR private
 * repositories](https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html) in the
 * *Amazon ECR User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * Object repositoryPolicyText;
 * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
 * .emptyOnDelete(false)
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionType("encryptionType")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
 * .scanOnPush(false)
 * .build())
 * .imageTagMutability("imageTagMutability")
 * .lifecyclePolicy(LifecyclePolicyProperty.builder()
 * .lifecyclePolicyText("lifecyclePolicyText")
 * .registryId("registryId")
 * .build())
 * .repositoryName("repositoryName")
 * .repositoryPolicyText(repositoryPolicyText)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
 */
public open class CfnRepository(
  cdkObject: software.amazon.awscdk.services.ecr.CfnRepository,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ecr.CfnRepository(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnRepository(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRepositoryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRepositoryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRepositoryProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) for the specified `AWS::ECR::Repository` resource.
   *
   * For example, `arn:aws:ecr: *eu-west-1* : *123456789012* :repository/ *test-repository*` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the URI for the specified `AWS::ECR::Repository` resource.
   *
   * For example, `*123456789012* .dkr.ecr. *us-west-2* .amazonaws.com/repository` .
   */
  public open fun attrRepositoryUri(): String = unwrap(this).getAttrRepositoryUri()

  /**
   * If true, deleting the repository force deletes the contents of the repository.
   */
  public open fun emptyOnDelete(): Any? = unwrap(this).getEmptyOnDelete()

  /**
   * If true, deleting the repository force deletes the contents of the repository.
   */
  public open fun emptyOnDelete(`value`: Boolean) {
    unwrap(this).setEmptyOnDelete(`value`)
  }

  /**
   * If true, deleting the repository force deletes the contents of the repository.
   */
  public open fun emptyOnDelete(`value`: IResolvable) {
    unwrap(this).setEmptyOnDelete(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption configuration for the repository.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * The encryption configuration for the repository.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption configuration for the repository.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The encryption configuration for the repository.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("39dd363c70038da85126a1d4a9fcf4d613001f9fb07226e7c1a9e30677cb03ed")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * The image scanning configuration for the repository.
   */
  public open fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  /**
   * The image scanning configuration for the repository.
   */
  public open fun imageScanningConfiguration(`value`: IResolvable) {
    unwrap(this).setImageScanningConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The image scanning configuration for the repository.
   */
  public open fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty) {
    unwrap(this).setImageScanningConfiguration(`value`.let(ImageScanningConfigurationProperty.Companion::unwrap))
  }

  /**
   * The image scanning configuration for the repository.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37192333b8b8d5db2630c4f244dd47d6fa572217f709b461057b2f1a075bc8f9")
  public open
      fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty.Builder.() -> Unit):
      Unit = imageScanningConfiguration(ImageScanningConfigurationProperty(`value`))

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
   * Creates or updates a lifecycle policy.
   */
  public open fun lifecyclePolicy(): Any? = unwrap(this).getLifecyclePolicy()

  /**
   * Creates or updates a lifecycle policy.
   */
  public open fun lifecyclePolicy(`value`: IResolvable) {
    unwrap(this).setLifecyclePolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Creates or updates a lifecycle policy.
   */
  public open fun lifecyclePolicy(`value`: LifecyclePolicyProperty) {
    unwrap(this).setLifecyclePolicy(`value`.let(LifecyclePolicyProperty.Companion::unwrap))
  }

  /**
   * Creates or updates a lifecycle policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c9dbfb2bffec0c4bf33cc86e51887501840be1674a262e5948ee9e2a0f5b6076")
  public open fun lifecyclePolicy(`value`: LifecyclePolicyProperty.Builder.() -> Unit): Unit =
      lifecyclePolicy(LifecyclePolicyProperty(`value`))

  /**
   * The name to use for the repository.
   */
  public open fun repositoryName(): String? = unwrap(this).getRepositoryName()

  /**
   * The name to use for the repository.
   */
  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  /**
   * The JSON repository policy text to apply to the repository.
   */
  public open fun repositoryPolicyText(): Any? = unwrap(this).getRepositoryPolicyText()

  /**
   * The JSON repository policy text to apply to the repository.
   */
  public open fun repositoryPolicyText(`value`: Any) {
    unwrap(this).setRepositoryPolicyText(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRepository].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    public fun emptyOnDelete(emptyOnDelete: Boolean)

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    public fun emptyOnDelete(emptyOnDelete: IResolvable)

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f046f772f75aad2be55954f3bcf4f694ce2bca4c76ae59c5fa5f4e279125e61")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty)

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7ac0672aa0b91e56a9eb254121c32b1a4ecb95b1da632ff7ed429a394df2743")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
     * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagetagmutability)
     * @param imageTagMutability The tag mutability setting for the repository. 
     */
    public fun imageTagMutability(imageTagMutability: String)

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    public fun lifecyclePolicy(lifecyclePolicy: IResolvable)

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty)

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6ad27a65aea65dbb4d8f833113f05c5dc1799ae2056ee03563388b4b0003725")
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty.Builder.() -> Unit)

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
     * @param repositoryName The name to use for the repository. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see [Amazon ECR repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     * in the *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository. 
     */
    public fun repositoryPolicyText(repositoryPolicyText: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnRepository.Builder =
        software.amazon.awscdk.services.ecr.CfnRepository.Builder.create(scope, id)

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    override fun emptyOnDelete(emptyOnDelete: Boolean) {
      cdkBuilder.emptyOnDelete(emptyOnDelete)
    }

    /**
     * If true, deleting the repository force deletes the contents of the repository.
     *
     * If false, the repository must be empty before attempting to delete it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-emptyondelete)
     * @param emptyOnDelete If true, deleting the repository force deletes the contents of the
     * repository. 
     */
    override fun emptyOnDelete(emptyOnDelete: IResolvable) {
      cdkBuilder.emptyOnDelete(emptyOnDelete.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The encryption configuration for the repository.
     *
     * This determines how the contents of your repository are encrypted at rest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
     * @param encryptionConfiguration The encryption configuration for the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f046f772f75aad2be55954f3bcf4f694ce2bca4c76ae59c5fa5f4e279125e61")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(ImageScanningConfigurationProperty.Companion::unwrap))
    }

    /**
     * The image scanning configuration for the repository.
     *
     * This determines whether images are scanned for known vulnerabilities after being pushed to
     * the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
     * @param imageScanningConfiguration The image scanning configuration for the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7ac0672aa0b91e56a9eb254121c32b1a4ecb95b1da632ff7ed429a394df2743")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * The tag mutability setting for the repository.
     *
     * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
     * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
     * will be immutable which will prevent them from being overwritten.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagetagmutability)
     * @param imageTagMutability The tag mutability setting for the repository. 
     */
    override fun imageTagMutability(imageTagMutability: String) {
      cdkBuilder.imageTagMutability(imageTagMutability)
    }

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    override fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicyProperty.Companion::unwrap))
    }

    /**
     * Creates or updates a lifecycle policy.
     *
     * For information about lifecycle policy syntax, see [Lifecycle policy
     * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
     * @param lifecyclePolicy Creates or updates a lifecycle policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6ad27a65aea65dbb4d8f833113f05c5dc1799ae2056ee03563388b4b0003725")
    override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicyProperty.Builder.() -> Unit): Unit
        = lifecyclePolicy(LifecyclePolicyProperty(lifecyclePolicy))

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
     * @param repositoryName The name to use for the repository. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * The JSON repository policy text to apply to the repository.
     *
     * For more information, see [Amazon ECR repository
     * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
     * in the *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
     * @param repositoryPolicyText The JSON repository policy text to apply to the repository. 
     */
    override fun repositoryPolicyText(repositoryPolicyText: Any) {
      cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecr.CfnRepository = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnRepository.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository): CfnRepository =
        CfnRepository(cdkObject)

    internal fun unwrap(wrapped: CfnRepository): software.amazon.awscdk.services.ecr.CfnRepository =
        wrapped.cdkObject as software.amazon.awscdk.services.ecr.CfnRepository
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html#cfn-ecr-repository-encryptionconfiguration-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * If you use the `KMS` encryption type, specify the AWS KMS key to use for encryption.
     *
     * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in the
     * same Region as the repository. If no key is specified, the default AWS managed AWS KMS key for
     * Amazon ECR will be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html#cfn-ecr-repository-encryptionconfiguration-kmskey)
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
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty.builder()

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
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html#cfn-ecr-repository-encryptionconfiguration-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      /**
       * If you use the `KMS` encryption type, specify the AWS KMS key to use for encryption.
       *
       * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in
       * the same Region as the repository. If no key is specified, the default AWS managed AWS KMS key
       * for Amazon ECR will be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html#cfn-ecr-repository-encryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty
    }
  }

  /**
   * The image scanning configuration for a repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
   * ImageScanningConfigurationProperty.builder()
   * .scanOnPush(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-imagescanningconfiguration.html)
   */
  public interface ImageScanningConfigurationProperty {
    /**
     * The setting that determines whether images are scanned after being pushed to a repository.
     *
     * If set to `true` , images will be scanned after being pushed. If this parameter is not
     * specified, it will default to `false` and images will not be scanned unless a scan is manually
     * started.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-imagescanningconfiguration.html#cfn-ecr-repository-imagescanningconfiguration-scanonpush)
     */
    public fun scanOnPush(): Any? = unwrap(this).getScanOnPush()

    /**
     * A builder for [ImageScanningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scanOnPush The setting that determines whether images are scanned after being pushed
       * to a repository.
       * If set to `true` , images will be scanned after being pushed. If this parameter is not
       * specified, it will default to `false` and images will not be scanned unless a scan is manually
       * started.
       */
      public fun scanOnPush(scanOnPush: Boolean)

      /**
       * @param scanOnPush The setting that determines whether images are scanned after being pushed
       * to a repository.
       * If set to `true` , images will be scanned after being pushed. If this parameter is not
       * specified, it will default to `false` and images will not be scanned unless a scan is manually
       * started.
       */
      public fun scanOnPush(scanOnPush: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty.builder()

      /**
       * @param scanOnPush The setting that determines whether images are scanned after being pushed
       * to a repository.
       * If set to `true` , images will be scanned after being pushed. If this parameter is not
       * specified, it will default to `false` and images will not be scanned unless a scan is manually
       * started.
       */
      override fun scanOnPush(scanOnPush: Boolean) {
        cdkBuilder.scanOnPush(scanOnPush)
      }

      /**
       * @param scanOnPush The setting that determines whether images are scanned after being pushed
       * to a repository.
       * If set to `true` , images will be scanned after being pushed. If this parameter is not
       * specified, it will default to `false` and images will not be scanned unless a scan is manually
       * started.
       */
      override fun scanOnPush(scanOnPush: IResolvable) {
        cdkBuilder.scanOnPush(scanOnPush.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty,
    ) : CdkObject(cdkObject),
        ImageScanningConfigurationProperty {
      /**
       * The setting that determines whether images are scanned after being pushed to a repository.
       *
       * If set to `true` , images will be scanned after being pushed. If this parameter is not
       * specified, it will default to `false` and images will not be scanned unless a scan is manually
       * started.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-imagescanningconfiguration.html#cfn-ecr-repository-imagescanningconfiguration-scanonpush)
       */
      override fun scanOnPush(): Any? = unwrap(this).getScanOnPush()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageScanningConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty
    }
  }

  /**
   * The `LifecyclePolicy` property type specifies a lifecycle policy.
   *
   * For information about lifecycle policy syntax, see [Lifecycle policy
   * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) in the
   * *Amazon ECR User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * LifecyclePolicyProperty lifecyclePolicyProperty = LifecyclePolicyProperty.builder()
   * .lifecyclePolicyText("lifecyclePolicyText")
   * .registryId("registryId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html)
   */
  public interface LifecyclePolicyProperty {
    /**
     * The JSON repository policy text to apply to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
     */
    public fun lifecyclePolicyText(): String? = unwrap(this).getLifecyclePolicyText()

    /**
     * The AWS account ID associated with the registry that contains the repository.
     *
     * If you do not specify a registry, the default registry is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
     */
    public fun registryId(): String? = unwrap(this).getRegistryId()

    /**
     * A builder for [LifecyclePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lifecyclePolicyText The JSON repository policy text to apply to the repository.
       */
      public fun lifecyclePolicyText(lifecyclePolicyText: String)

      /**
       * @param registryId The AWS account ID associated with the registry that contains the
       * repository.
       * If you do not specify a registry, the default registry is assumed.
       */
      public fun registryId(registryId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder =
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.builder()

      /**
       * @param lifecyclePolicyText The JSON repository policy text to apply to the repository.
       */
      override fun lifecyclePolicyText(lifecyclePolicyText: String) {
        cdkBuilder.lifecyclePolicyText(lifecyclePolicyText)
      }

      /**
       * @param registryId The AWS account ID associated with the registry that contains the
       * repository.
       * If you do not specify a registry, the default registry is assumed.
       */
      override fun registryId(registryId: String) {
        cdkBuilder.registryId(registryId)
      }

      public fun build(): software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty,
    ) : CdkObject(cdkObject),
        LifecyclePolicyProperty {
      /**
       * The JSON repository policy text to apply to the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext)
       */
      override fun lifecyclePolicyText(): String? = unwrap(this).getLifecyclePolicyText()

      /**
       * The AWS account ID associated with the registry that contains the repository.
       *
       * If you do not specify a registry, the default registry is assumed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid)
       */
      override fun registryId(): String? = unwrap(this).getRegistryId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecyclePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty):
          LifecyclePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? LifecyclePolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecyclePolicyProperty):
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty
    }
  }
}
