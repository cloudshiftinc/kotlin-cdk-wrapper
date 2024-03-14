package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) of the image.
   *
   * For example, `arn:aws:imagebuilder:us-west-2:123456789012:image/mybasicrecipe/2019.12.03/1` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the AMI ID of the Amazon EC2 AMI in the Region in which you are using Image Builder.
   *
   * Values are returned only for AMIs, and not for container images.
   */
  public open fun attrImageId(): String = unwrap(this).getAttrImageId()

  /**
   * Returns the URI for a container image created in the context Region.
   *
   * Values are returned only for container images, and not for AMIs.
   */
  public open fun attrImageUri(): String = unwrap(this).getAttrImageUri()

  /**
   * Returns the name of the image.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
   * and tested.
   */
  public open fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  /**
   * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
   * and tested.
   */
  public open fun containerRecipeArn(`value`: String) {
    unwrap(this).setContainerRecipeArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
   * the outputs of your pipeline.
   */
  public open fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
   * the outputs of your pipeline.
   */
  public open fun distributionConfigurationArn(`value`: String) {
    unwrap(this).setDistributionConfigurationArn(`value`)
  }

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   */
  public open fun enhancedImageMetadataEnabled(): Any? =
      unwrap(this).getEnhancedImageMetadataEnabled()

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   */
  public open fun enhancedImageMetadataEnabled(`value`: Boolean) {
    unwrap(this).setEnhancedImageMetadataEnabled(`value`)
  }

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   */
  public open fun enhancedImageMetadataEnabled(`value`: IResolvable) {
    unwrap(this).setEnhancedImageMetadataEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to perform workflow actions.
   */
  public open fun executionRole(): String? = unwrap(this).getExecutionRole()

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to perform workflow actions.
   */
  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
   * tested, and assessed.
   */
  public open fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  /**
   * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
   * tested, and assessed.
   */
  public open fun imageRecipeArn(`value`: String) {
    unwrap(this).setImageRecipeArn(`value`)
  }

  /**
   * Contains settings for vulnerability scans.
   */
  public open fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  /**
   * Contains settings for vulnerability scans.
   */
  public open fun imageScanningConfiguration(`value`: IResolvable) {
    unwrap(this).setImageScanningConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains settings for vulnerability scans.
   */
  public open fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty) {
    unwrap(this).setImageScanningConfiguration(`value`.let(ImageScanningConfigurationProperty::unwrap))
  }

  /**
   * Contains settings for vulnerability scans.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49c41172dfac75d33b363efc8e73d281e84c30b5574fae2c4f73d3205e79801e")
  public open
      fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty.Builder.() -> Unit):
      Unit = imageScanningConfiguration(ImageScanningConfigurationProperty(`value`))

  /**
   * The image tests configuration of the image.
   */
  public open fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  /**
   * The image tests configuration of the image.
   */
  public open fun imageTestsConfiguration(`value`: IResolvable) {
    unwrap(this).setImageTestsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The image tests configuration of the image.
   */
  public open fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty) {
    unwrap(this).setImageTestsConfiguration(`value`.let(ImageTestsConfigurationProperty::unwrap))
  }

  /**
   * The image tests configuration of the image.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37aad46d28eae7e77976ac8dce0989e35a0f8f27d1fcb12181b299cb0ecbbc04")
  public open
      fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty.Builder.() -> Unit): Unit
      = imageTestsConfiguration(ImageTestsConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment
   * in which your image will be built and tested.
   */
  public open fun infrastructureConfigurationArn(): String =
      unwrap(this).getInfrastructureConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment
   * in which your image will be built and tested.
   */
  public open fun infrastructureConfigurationArn(`value`: String) {
    unwrap(this).setInfrastructureConfigurationArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the image.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags of the image.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * Contains an array of workflow configuration objects.
   */
  public open fun workflows(): Any? = unwrap(this).getWorkflows()

  /**
   * Contains an array of workflow configuration objects.
   */
  public open fun workflows(`value`: IResolvable) {
    unwrap(this).setWorkflows(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains an array of workflow configuration objects.
   */
  public open fun workflows(__idx_ac66f0: List<Any>) {
    unwrap(this).setWorkflows(__idx_ac66f0)
  }

  /**
   * Contains an array of workflow configuration objects.
   */
  public open fun workflows(vararg __idx_ac66f0: Any): Unit = workflows(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
     * and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-containerrecipearn)
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that defines
     * how images are configured and tested. 
     */
    public fun containerRecipeArn(containerRecipeArn: String)

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
     * the outputs of your pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn)
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration that defines and configures the outputs of your pipeline. 
     */
    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list. 
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean)

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list. 
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to perform workflow actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions. 
     */
    public fun executionRole(executionRole: String)

    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
     * tested, and assessed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn)
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed. 
     */
    public fun imageRecipeArn(imageRecipeArn: String)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ae17270e9cae59300d22e1dd362e82effd3ce24b1844ced919034e09b79aa7")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty)

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7232d3bbdd55fc33682975b8926c2f718b84b7a7d6c04a08c3c7ba49be24769")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the
     * environment in which your image will be built and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn)
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration that defines the environment in which your image will be built and tested. 
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    /**
     * The tags of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags)
     * @param tags The tags of the image. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    public fun workflows(workflows: IResolvable)

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    public fun workflows(workflows: List<Any>)

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImage.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImage.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
     * and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-containerrecipearn)
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that defines
     * how images are configured and tested. 
     */
    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
     * the outputs of your pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn)
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration that defines and configures the outputs of your pipeline. 
     */
    override fun distributionConfigurationArn(distributionConfigurationArn: String) {
      cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list. 
     */
    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list. 
     */
    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.let(IResolvable::unwrap))
    }

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to perform workflow actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
     * tested, and assessed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn)
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed. 
     */
    override fun imageRecipeArn(imageRecipeArn: String) {
      cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(ImageScanningConfigurationProperty::unwrap))
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ae17270e9cae59300d22e1dd362e82effd3ce24b1844ced919034e09b79aa7")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(ImageTestsConfigurationProperty::unwrap))
    }

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     * @param imageTestsConfiguration The image tests configuration of the image. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7232d3bbdd55fc33682975b8926c2f718b84b7a7d6c04a08c3c7ba49be24769")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit = imageTestsConfiguration(ImageTestsConfigurationProperty(imageTestsConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the
     * environment in which your image will be built and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn)
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration that defines the environment in which your image will be built and tested. 
     */
    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /**
     * The tags of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags)
     * @param tags The tags of the image. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    override fun workflows(workflows: IResolvable) {
      cdkBuilder.workflows(workflows.let(IResolvable::unwrap))
    }

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    override fun workflows(workflows: List<Any>) {
      cdkBuilder.workflows(workflows)
    }

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     * @param workflows Contains an array of workflow configuration objects. 
     */
    override fun workflows(vararg workflows: Any): Unit = workflows(workflows.toList())

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage): CfnImage =
        CfnImage(cdkObject)

    internal fun unwrap(wrapped: CfnImage): software.amazon.awscdk.services.imagebuilder.CfnImage =
        wrapped.cdkObject
  }

  public interface ImageScanningConfigurationProperty {
    /**
     * Contains Amazon ECR settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html#cfn-imagebuilder-image-imagescanningconfiguration-ecrconfiguration)
     */
    public fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

    /**
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans
     * that Amazon Inspector runs against the build instance when you create a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html#cfn-imagebuilder-image-imagescanningconfiguration-imagescanningenabled)
     */
    public fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()

    /**
     * A builder for [ImageScanningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      public fun ecrConfiguration(ecrConfiguration: IResolvable)

      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty)

      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91dea047b81973fc82ef0372c3292754cedee37b3f91296710018e95394d6713")
      public fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit)

      /**
       * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
       * of the vulnerability scans that Amazon Inspector runs against the build instance when you
       * create a new image.
       */
      public fun imageScanningEnabled(imageScanningEnabled: Boolean)

      /**
       * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
       * of the vulnerability scans that Amazon Inspector runs against the build instance when you
       * create a new image.
       */
      public fun imageScanningEnabled(imageScanningEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty.builder()

      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      override fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration.let(EcrConfigurationProperty::unwrap))
      }

      /**
       * @param ecrConfiguration Contains Amazon ECR settings for vulnerability scans.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91dea047b81973fc82ef0372c3292754cedee37b3f91296710018e95394d6713")
      override fun ecrConfiguration(ecrConfiguration: EcrConfigurationProperty.Builder.() -> Unit):
          Unit = ecrConfiguration(EcrConfigurationProperty(ecrConfiguration))

      /**
       * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
       * of the vulnerability scans that Amazon Inspector runs against the build instance when you
       * create a new image.
       */
      override fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
      }

      /**
       * @param imageScanningEnabled A setting that indicates whether Image Builder keeps a snapshot
       * of the vulnerability scans that Amazon Inspector runs against the build instance when you
       * create a new image.
       */
      override fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty,
    ) : CdkObject(cdkObject), ImageScanningConfigurationProperty {
      /**
       * Contains Amazon ECR settings for vulnerability scans.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html#cfn-imagebuilder-image-imagescanningconfiguration-ecrconfiguration)
       */
      override fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

      /**
       * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans
       * that Amazon Inspector runs against the build instance when you create a new image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html#cfn-imagebuilder-image-imagescanningconfiguration-imagescanningenabled)
       */
      override fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageScanningConfigurationProperty
    }
  }

  public interface WorkflowParameterProperty {
    /**
     * The name of the workflow parameter to set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowparameter.html#cfn-imagebuilder-image-workflowparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Sets the value for the named workflow parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowparameter.html#cfn-imagebuilder-image-workflowparameter-value)
     */
    public fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()

    /**
     * A builder for [WorkflowParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the workflow parameter to set.
       */
      public fun name(name: String)

      /**
       * @param value Sets the value for the named workflow parameter.
       */
      public fun `value`(`value`: List<String>)

      /**
       * @param value Sets the value for the named workflow parameter.
       */
      public fun `value`(vararg `value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty.builder()

      /**
       * @param name The name of the workflow parameter to set.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value Sets the value for the named workflow parameter.
       */
      override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param value Sets the value for the named workflow parameter.
       */
      override fun `value`(vararg `value`: String): Unit = `value`(`value`.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty,
    ) : CdkObject(cdkObject), WorkflowParameterProperty {
      /**
       * The name of the workflow parameter to set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowparameter.html#cfn-imagebuilder-image-workflowparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Sets the value for the named workflow parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowparameter.html#cfn-imagebuilder-image-workflowparameter-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty):
          WorkflowParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowParameterProperty
    }
  }

  public interface EcrConfigurationProperty {
    /**
     * Tags for Image Builder to apply to the output container image that &amp;INS;
     *
     * scans. Tags can help you identify and manage your scanned images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-ecrconfiguration.html#cfn-imagebuilder-image-ecrconfiguration-containertags)
     */
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    /**
     * The name of the container repository that Amazon Inspector scans to identify findings for
     * your container images.
     *
     * The name includes the path for the repository location. If you don’t provide this
     * information, Image Builder creates a repository in your account named
     * `image-builder-image-scanning-repository` for vulnerability scans of your output container
     * images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-ecrconfiguration.html#cfn-imagebuilder-image-ecrconfiguration-repositoryname)
     */
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * A builder for [EcrConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerTags Tags for Image Builder to apply to the output container image that
       * &amp;INS;.
       * scans. Tags can help you identify and manage your scanned images.
       */
      public fun containerTags(containerTags: List<String>)

      /**
       * @param containerTags Tags for Image Builder to apply to the output container image that
       * &amp;INS;.
       * scans. Tags can help you identify and manage your scanned images.
       */
      public fun containerTags(vararg containerTags: String)

      /**
       * @param repositoryName The name of the container repository that Amazon Inspector scans to
       * identify findings for your container images.
       * The name includes the path for the repository location. If you don’t provide this
       * information, Image Builder creates a repository in your account named
       * `image-builder-image-scanning-repository` for vulnerability scans of your output container
       * images.
       */
      public fun repositoryName(repositoryName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty.builder()

      /**
       * @param containerTags Tags for Image Builder to apply to the output container image that
       * &amp;INS;.
       * scans. Tags can help you identify and manage your scanned images.
       */
      override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      /**
       * @param containerTags Tags for Image Builder to apply to the output container image that
       * &amp;INS;.
       * scans. Tags can help you identify and manage your scanned images.
       */
      override fun containerTags(vararg containerTags: String): Unit =
          containerTags(containerTags.toList())

      /**
       * @param repositoryName The name of the container repository that Amazon Inspector scans to
       * identify findings for your container images.
       * The name includes the path for the repository location. If you don’t provide this
       * information, Image Builder creates a repository in your account named
       * `image-builder-image-scanning-repository` for vulnerability scans of your output container
       * images.
       */
      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty,
    ) : CdkObject(cdkObject), EcrConfigurationProperty {
      /**
       * Tags for Image Builder to apply to the output container image that &amp;INS;
       *
       * scans. Tags can help you identify and manage your scanned images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-ecrconfiguration.html#cfn-imagebuilder-image-ecrconfiguration-containertags)
       */
      override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

      /**
       * The name of the container repository that Amazon Inspector scans to identify findings for
       * your container images.
       *
       * The name includes the path for the repository location. If you don’t provide this
       * information, Image Builder creates a repository in your account named
       * `image-builder-image-scanning-repository` for vulnerability scans of your output container
       * images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-ecrconfiguration.html#cfn-imagebuilder-image-ecrconfiguration-repositoryname)
       */
      override fun repositoryName(): String? = unwrap(this).getRepositoryName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcrConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty):
          EcrConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImage.EcrConfigurationProperty
    }
  }

  public interface WorkflowConfigurationProperty {
    /**
     * The action to take if the workflow fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-onfailure)
     */
    public fun onFailure(): String? = unwrap(this).getOnFailure()

    /**
     * Test workflows are defined within named runtime groups called parallel groups.
     *
     * The parallel group is the named group that contains this test workflow. Test workflows within
     * a parallel group can run at the same time. Image Builder starts up to five test workflows in the
     * group at the same time, and starts additional workflows as others complete, until all workflows
     * in the group have completed. This field only applies for test workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-parallelgroup)
     */
    public fun parallelGroup(): String? = unwrap(this).getParallelGroup()

    /**
     * Contains parameter values for each of the parameters that the workflow document defined for
     * the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The Amazon Resource Name (ARN) of the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-workflowarn)
     */
    public fun workflowArn(): String? = unwrap(this).getWorkflowArn()

    /**
     * A builder for [WorkflowConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onFailure The action to take if the workflow fails.
       */
      public fun onFailure(onFailure: String)

      /**
       * @param parallelGroup Test workflows are defined within named runtime groups called parallel
       * groups.
       * The parallel group is the named group that contains this test workflow. Test workflows
       * within a parallel group can run at the same time. Image Builder starts up to five test
       * workflows in the group at the same time, and starts additional workflows as others complete,
       * until all workflows in the group have completed. This field only applies for test workflows.
       */
      public fun parallelGroup(parallelGroup: String)

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      public fun parameters(vararg parameters: Any)

      /**
       * @param workflowArn The Amazon Resource Name (ARN) of the workflow resource.
       */
      public fun workflowArn(workflowArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty.builder()

      /**
       * @param onFailure The action to take if the workflow fails.
       */
      override fun onFailure(onFailure: String) {
        cdkBuilder.onFailure(onFailure)
      }

      /**
       * @param parallelGroup Test workflows are defined within named runtime groups called parallel
       * groups.
       * The parallel group is the named group that contains this test workflow. Test workflows
       * within a parallel group can run at the same time. Image Builder starts up to five test
       * workflows in the group at the same time, and starts additional workflows as others complete,
       * until all workflows in the group have completed. This field only applies for test workflows.
       */
      override fun parallelGroup(parallelGroup: String) {
        cdkBuilder.parallelGroup(parallelGroup)
      }

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param parameters Contains parameter values for each of the parameters that the workflow
       * document defined for the workflow resource.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      /**
       * @param workflowArn The Amazon Resource Name (ARN) of the workflow resource.
       */
      override fun workflowArn(workflowArn: String) {
        cdkBuilder.workflowArn(workflowArn)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty,
    ) : CdkObject(cdkObject), WorkflowConfigurationProperty {
      /**
       * The action to take if the workflow fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-onfailure)
       */
      override fun onFailure(): String? = unwrap(this).getOnFailure()

      /**
       * Test workflows are defined within named runtime groups called parallel groups.
       *
       * The parallel group is the named group that contains this test workflow. Test workflows
       * within a parallel group can run at the same time. Image Builder starts up to five test
       * workflows in the group at the same time, and starts additional workflows as others complete,
       * until all workflows in the group have completed. This field only applies for test workflows.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-parallelgroup)
       */
      override fun parallelGroup(): String? = unwrap(this).getParallelGroup()

      /**
       * Contains parameter values for each of the parameters that the workflow document defined for
       * the workflow resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The Amazon Resource Name (ARN) of the workflow resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-workflowconfiguration.html#cfn-imagebuilder-image-workflowconfiguration-workflowarn)
       */
      override fun workflowArn(): String? = unwrap(this).getWorkflowArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty):
          WorkflowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImage.WorkflowConfigurationProperty
    }
  }

  public interface ImageTestsConfigurationProperty {
    /**
     * Determines if tests should run after building the image.
     *
     * Image Builder defaults to enable tests to run following the image build, before image
     * distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html#cfn-imagebuilder-image-imagetestsconfiguration-imagetestsenabled)
     */
    public fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

    /**
     * The maximum time in minutes that tests are permitted to run.
     *
     *
     * The timeoutMinutes attribute is not currently active. This value is ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html#cfn-imagebuilder-image-imagetestsconfiguration-timeoutminutes)
     */
    public fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()

    /**
     * A builder for [ImageTestsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageTestsEnabled Determines if tests should run after building the image.
       * Image Builder defaults to enable tests to run following the image build, before image
       * distribution.
       */
      public fun imageTestsEnabled(imageTestsEnabled: Boolean)

      /**
       * @param imageTestsEnabled Determines if tests should run after building the image.
       * Image Builder defaults to enable tests to run following the image build, before image
       * distribution.
       */
      public fun imageTestsEnabled(imageTestsEnabled: IResolvable)

      /**
       * @param timeoutMinutes The maximum time in minutes that tests are permitted to run.
       *
       * The timeoutMinutes attribute is not currently active. This value is ignored.
       */
      public fun timeoutMinutes(timeoutMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty.builder()

      /**
       * @param imageTestsEnabled Determines if tests should run after building the image.
       * Image Builder defaults to enable tests to run following the image build, before image
       * distribution.
       */
      override fun imageTestsEnabled(imageTestsEnabled: Boolean) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled)
      }

      /**
       * @param imageTestsEnabled Determines if tests should run after building the image.
       * Image Builder defaults to enable tests to run following the image build, before image
       * distribution.
       */
      override fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param timeoutMinutes The maximum time in minutes that tests are permitted to run.
       *
       * The timeoutMinutes attribute is not currently active. This value is ignored.
       */
      override fun timeoutMinutes(timeoutMinutes: Number) {
        cdkBuilder.timeoutMinutes(timeoutMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty,
    ) : CdkObject(cdkObject), ImageTestsConfigurationProperty {
      /**
       * Determines if tests should run after building the image.
       *
       * Image Builder defaults to enable tests to run following the image build, before image
       * distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html#cfn-imagebuilder-image-imagetestsconfiguration-imagetestsenabled)
       */
      override fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

      /**
       * The maximum time in minutes that tests are permitted to run.
       *
       *
       * The timeoutMinutes attribute is not currently active. This value is ignored.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html#cfn-imagebuilder-image-imagetestsconfiguration-timeoutminutes)
       */
      override fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ImageTestsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty):
          ImageTestsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageTestsConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnImage.ImageTestsConfigurationProperty
    }
  }
}
