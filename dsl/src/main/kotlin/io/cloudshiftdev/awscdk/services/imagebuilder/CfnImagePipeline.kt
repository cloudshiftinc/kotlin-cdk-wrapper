package io.cloudshiftdev.awscdk.services.imagebuilder

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

public open class CfnImagePipeline internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) of the image pipeline.
   *
   * For example, `arn:aws:imagebuilder:us-west-2:123456789012:image-pipeline/mywindows2016pipeline`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of the image pipeline.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
   */
  public open fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  /**
   * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
   */
  public open fun containerRecipeArn(`value`: String) {
    unwrap(this).setContainerRecipeArn(`value`)
  }

  /**
   * The description of this image pipeline.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of this image pipeline.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
   * pipeline.
   */
  public open fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
   * pipeline.
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
   * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
   */
  public open fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  /**
   * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
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
  @JvmName("d1dc9480574129aeb5d80a0e2644b4b55f20d7cd6c68c602eec5d23d30c3a3f2")
  public open
      fun imageScanningConfiguration(`value`: ImageScanningConfigurationProperty.Builder.() -> Unit):
      Unit = imageScanningConfiguration(ImageScanningConfigurationProperty(`value`))

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   */
  public open fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   */
  public open fun imageTestsConfiguration(`value`: IResolvable) {
    unwrap(this).setImageTestsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   */
  public open fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty) {
    unwrap(this).setImageTestsConfiguration(`value`.let(ImageTestsConfigurationProperty::unwrap))
  }

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73ee540abca0bb1ad2253bdcae1b1edad10620b129dd0026bab7f13eaee7fdc5")
  public open
      fun imageTestsConfiguration(`value`: ImageTestsConfigurationProperty.Builder.() -> Unit): Unit
      = imageTestsConfiguration(ImageTestsConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
   * pipeline.
   */
  public open fun infrastructureConfigurationArn(): String =
      unwrap(this).getInfrastructureConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
   * pipeline.
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
   * The name of the image pipeline.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the image pipeline.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schedule of the image pipeline.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The schedule of the image pipeline.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  /**
   * The schedule of the image pipeline.
   */
  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  /**
   * The schedule of the image pipeline.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45c64fb42d4a83f601dde9d46e4b6909ac486cf84150a1ac3cecf0ef045a1624")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  /**
   * The status of the image pipeline.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * The status of the image pipeline.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of this image pipeline.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags of this image pipeline.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * Contains the workflows that run for the image pipeline.
   */
  public open fun workflows(): Any? = unwrap(this).getWorkflows()

  /**
   * Contains the workflows that run for the image pipeline.
   */
  public open fun workflows(`value`: IResolvable) {
    unwrap(this).setWorkflows(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains the workflows that run for the image pipeline.
   */
  public open fun workflows(__idx_ac66f0: List<Any>) {
    unwrap(this).setWorkflows(__idx_ac66f0)
  }

  /**
   * Contains the workflows that run for the image pipeline.
   */
  public open fun workflows(vararg __idx_ac66f0: Any): Unit = workflows(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnImagePipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-containerrecipearn)
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     * for this pipeline. 
     */
    public fun containerRecipeArn(containerRecipeArn: String)

    /**
     * The description of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description)
     * @param description The description of this image pipeline. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn)
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration associated with this image pipeline. 
     */
    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list. 
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to perform workflow actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions. 
     */
    public fun executionRole(executionRole: String)

    /**
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn)
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline. 
     */
    public fun imageRecipeArn(imageRecipeArn: String)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty)

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11442dfdc4183acd29e5f0fccdd4e704774642ac47dfbfec821b7c2dfd34783f")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty)

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f06bc5e0172e4692aaf1f8e8fb4491d0621c4914b86ffb88b48fbaeed88d373")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn)
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration associated with this image pipeline. 
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    /**
     * The name of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name)
     * @param name The name of the image pipeline. 
     */
    public fun name(name: String)

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    public fun schedule(schedule: ScheduleProperty)

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("550c02478abf4b076ba196d92ce7c38ea5f12a9dc60f9c8ff990319790c07569")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    /**
     * The status of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status)
     * @param status The status of the image pipeline. 
     */
    public fun status(status: String)

    /**
     * The tags of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags)
     * @param tags The tags of this image pipeline. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    public fun workflows(workflows: IResolvable)

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    public fun workflows(workflows: List<Any>)

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-containerrecipearn)
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     * for this pipeline. 
     */
    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * The description of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description)
     * @param description The description of this image pipeline. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn)
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration associated with this image pipeline. 
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn)
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline. 
     */
    override fun imageRecipeArn(imageRecipeArn: String) {
      cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(ImageScanningConfigurationProperty::unwrap))
    }

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     * @param imageScanningConfiguration Contains settings for vulnerability scans. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11442dfdc4183acd29e5f0fccdd4e704774642ac47dfbfec821b7c2dfd34783f")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(ImageTestsConfigurationProperty::unwrap))
    }

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f06bc5e0172e4692aaf1f8e8fb4491d0621c4914b86ffb88b48fbaeed88d373")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit = imageTestsConfiguration(ImageTestsConfigurationProperty(imageTestsConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn)
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration associated with this image pipeline. 
     */
    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /**
     * The name of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name)
     * @param name The name of the image pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     * @param schedule The schedule of the image pipeline. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("550c02478abf4b076ba196d92ce7c38ea5f12a9dc60f9c8ff990319790c07569")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    /**
     * The status of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status)
     * @param status The status of the image pipeline. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags)
     * @param tags The tags of this image pipeline. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    override fun workflows(workflows: IResolvable) {
      cdkBuilder.workflows(workflows.let(IResolvable::unwrap))
    }

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    override fun workflows(workflows: List<Any>) {
      cdkBuilder.workflows(workflows)
    }

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     * @param workflows Contains the workflows that run for the image pipeline. 
     */
    override fun workflows(vararg workflows: Any): Unit = workflows(workflows.toList())

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImagePipeline =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImagePipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImagePipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline):
        CfnImagePipeline = CfnImagePipeline(cdkObject)

    internal fun unwrap(wrapped: CfnImagePipeline):
        software.amazon.awscdk.services.imagebuilder.CfnImagePipeline = wrapped.cdkObject
  }

  public interface WorkflowParameterProperty {
    /**
     * The name of the workflow parameter to set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html#cfn-imagebuilder-imagepipeline-workflowparameter-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Sets the value for the named workflow parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html#cfn-imagebuilder-imagepipeline-workflowparameter-value)
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty,
    ) : WorkflowParameterProperty {
      /**
       * The name of the workflow parameter to set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html#cfn-imagebuilder-imagepipeline-workflowparameter-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Sets the value for the named workflow parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowparameter.html#cfn-imagebuilder-imagepipeline-workflowparameter-value)
       */
      override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty):
          WorkflowParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WorkflowConfigurationProperty {
    /**
     * The action to take if the workflow fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-onfailure)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-parallelgroup)
     */
    public fun parallelGroup(): String? = unwrap(this).getParallelGroup()

    /**
     * Contains parameter values for each of the parameters that the workflow document defined for
     * the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The Amazon Resource Name (ARN) of the workflow resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-workflowarn)
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty,
    ) : WorkflowConfigurationProperty {
      /**
       * The action to take if the workflow fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-onfailure)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-parallelgroup)
       */
      override fun parallelGroup(): String? = unwrap(this).getParallelGroup()

      /**
       * Contains parameter values for each of the parameters that the workflow document defined for
       * the workflow resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The Amazon Resource Name (ARN) of the workflow resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-workflowconfiguration.html#cfn-imagebuilder-imagepipeline-workflowconfiguration-workflowarn)
       */
      override fun workflowArn(): String? = unwrap(this).getWorkflowArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty):
          WorkflowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.WorkflowConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ImageTestsConfigurationProperty {
    /**
     * Defines if tests should be executed when building this image.
     *
     * For example, `true` or `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled)
     */
    public fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

    /**
     * The maximum time in minutes that tests are permitted to run.
     *
     *
     * The timeoutMinutes attribute is not currently active. This value is ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes)
     */
    public fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()

    /**
     * A builder for [ImageTestsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageTestsEnabled Defines if tests should be executed when building this image.
       * For example, `true` or `false` .
       */
      public fun imageTestsEnabled(imageTestsEnabled: Boolean)

      /**
       * @param imageTestsEnabled Defines if tests should be executed when building this image.
       * For example, `true` or `false` .
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty.builder()

      /**
       * @param imageTestsEnabled Defines if tests should be executed when building this image.
       * For example, `true` or `false` .
       */
      override fun imageTestsEnabled(imageTestsEnabled: Boolean) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled)
      }

      /**
       * @param imageTestsEnabled Defines if tests should be executed when building this image.
       * For example, `true` or `false` .
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty,
    ) : ImageTestsConfigurationProperty {
      /**
       * Defines if tests should be executed when building this image.
       *
       * For example, `true` or `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled)
       */
      override fun imageTestsEnabled(): Any? = unwrap(this).getImageTestsEnabled()

      /**
       * The maximum time in minutes that tests are permitted to run.
       *
       *
       * The timeoutMinutes attribute is not currently active. This value is ignored.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes)
       */
      override fun timeoutMinutes(): Number? = unwrap(this).getTimeoutMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageTestsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty):
          ImageTestsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageTestsConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageTestsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EcrConfigurationProperty {
    /**
     * Tags for Image Builder to apply to the output container image that &amp;INS;
     *
     * scans. Tags can help you identify and manage your scanned images.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-ecrconfiguration.html#cfn-imagebuilder-imagepipeline-ecrconfiguration-containertags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-ecrconfiguration.html#cfn-imagebuilder-imagepipeline-ecrconfiguration-repositoryname)
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty.builder()

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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty,
    ) : EcrConfigurationProperty {
      /**
       * Tags for Image Builder to apply to the output container image that &amp;INS;
       *
       * scans. Tags can help you identify and manage your scanned images.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-ecrconfiguration.html#cfn-imagebuilder-imagepipeline-ecrconfiguration-containertags)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-ecrconfiguration.html#cfn-imagebuilder-imagepipeline-ecrconfiguration-repositoryname)
       */
      override fun repositoryName(): String? = unwrap(this).getRepositoryName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EcrConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty):
          EcrConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcrConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.EcrConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduleProperty {
    /**
     * The condition configures when the pipeline should trigger a new image build.
     *
     * When the `pipelineExecutionStartCondition` is set to
     * `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` , and you use semantic version filters on
     * the base image or components in your image recipe, Image Builder will build a new image only
     * when there are new versions of the image or components in your recipe that match the semantic
     * version filter. When it is set to `EXPRESSION_MATCH_ONLY` , it will build a new image every time
     * the CRON expression matches the current time. For semantic version syntax, see
     * [CreateComponent](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html)
     * in the *Image Builder API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition)
     */
    public fun pipelineExecutionStartCondition(): String? =
        unwrap(this).getPipelineExecutionStartCondition()

    /**
     * The cron expression determines how often EC2 Image Builder evaluates your
     * `pipelineExecutionStartCondition` .
     *
     * For information on how to format a cron expression in Image Builder, see [Use cron
     * expressions in EC2 Image
     * Builder](https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression)
     */
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    /**
     * A builder for [ScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pipelineExecutionStartCondition The condition configures when the pipeline should
       * trigger a new image build.
       * When the `pipelineExecutionStartCondition` is set to
       * `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` , and you use semantic version filters on
       * the base image or components in your image recipe, Image Builder will build a new image only
       * when there are new versions of the image or components in your recipe that match the semantic
       * version filter. When it is set to `EXPRESSION_MATCH_ONLY` , it will build a new image every
       * time the CRON expression matches the current time. For semantic version syntax, see
       * [CreateComponent](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html)
       * in the *Image Builder API Reference* .
       */
      public fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String)

      /**
       * @param scheduleExpression The cron expression determines how often EC2 Image Builder
       * evaluates your `pipelineExecutionStartCondition` .
       * For information on how to format a cron expression in Image Builder, see [Use cron
       * expressions in EC2 Image
       * Builder](https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html) .
       */
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty.builder()

      /**
       * @param pipelineExecutionStartCondition The condition configures when the pipeline should
       * trigger a new image build.
       * When the `pipelineExecutionStartCondition` is set to
       * `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` , and you use semantic version filters on
       * the base image or components in your image recipe, Image Builder will build a new image only
       * when there are new versions of the image or components in your recipe that match the semantic
       * version filter. When it is set to `EXPRESSION_MATCH_ONLY` , it will build a new image every
       * time the CRON expression matches the current time. For semantic version syntax, see
       * [CreateComponent](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html)
       * in the *Image Builder API Reference* .
       */
      override fun pipelineExecutionStartCondition(pipelineExecutionStartCondition: String) {
        cdkBuilder.pipelineExecutionStartCondition(pipelineExecutionStartCondition)
      }

      /**
       * @param scheduleExpression The cron expression determines how often EC2 Image Builder
       * evaluates your `pipelineExecutionStartCondition` .
       * For information on how to format a cron expression in Image Builder, see [Use cron
       * expressions in EC2 Image
       * Builder](https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html) .
       */
      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty,
    ) : ScheduleProperty {
      /**
       * The condition configures when the pipeline should trigger a new image build.
       *
       * When the `pipelineExecutionStartCondition` is set to
       * `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` , and you use semantic version filters on
       * the base image or components in your image recipe, Image Builder will build a new image only
       * when there are new versions of the image or components in your recipe that match the semantic
       * version filter. When it is set to `EXPRESSION_MATCH_ONLY` , it will build a new image every
       * time the CRON expression matches the current time. For semantic version syntax, see
       * [CreateComponent](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html)
       * in the *Image Builder API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition)
       */
      override fun pipelineExecutionStartCondition(): String? =
          unwrap(this).getPipelineExecutionStartCondition()

      /**
       * The cron expression determines how often EC2 Image Builder evaluates your
       * `pipelineExecutionStartCondition` .
       *
       * For information on how to format a cron expression in Image Builder, see [Use cron
       * expressions in EC2 Image
       * Builder](https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression)
       */
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ScheduleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ImageScanningConfigurationProperty {
    /**
     * Contains Amazon ECR settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagescanningconfiguration.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration-ecrconfiguration)
     */
    public fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

    /**
     * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans
     * that Amazon Inspector runs against the build instance when you create a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagescanningconfiguration.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration-imagescanningenabled)
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
      @JvmName("a59d1a658ca357e27cecfc747c2a97b351b22f1eebc075e1fcf2258b78a0a8bd")
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty.builder()

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
      @JvmName("a59d1a658ca357e27cecfc747c2a97b351b22f1eebc075e1fcf2258b78a0a8bd")
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
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty,
    ) : ImageScanningConfigurationProperty {
      /**
       * Contains Amazon ECR settings for vulnerability scans.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagescanningconfiguration.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration-ecrconfiguration)
       */
      override fun ecrConfiguration(): Any? = unwrap(this).getEcrConfiguration()

      /**
       * A setting that indicates whether Image Builder keeps a snapshot of the vulnerability scans
       * that Amazon Inspector runs against the build instance when you create a new image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagescanningconfiguration.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration-imagescanningenabled)
       */
      override fun imageScanningEnabled(): Any? = unwrap(this).getImageScanningEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageScanningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty):
          ImageScanningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageScanningConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnImagePipeline.ImageScanningConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
