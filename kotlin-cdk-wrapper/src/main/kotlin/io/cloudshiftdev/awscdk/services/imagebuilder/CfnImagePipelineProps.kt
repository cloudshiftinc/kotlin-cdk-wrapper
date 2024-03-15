@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnImagePipeline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnImagePipelineProps cfnImagePipelineProps = CfnImagePipelineProps.builder()
 * .infrastructureConfigurationArn("infrastructureConfigurationArn")
 * .name("name")
 * // the properties below are optional
 * .containerRecipeArn("containerRecipeArn")
 * .description("description")
 * .distributionConfigurationArn("distributionConfigurationArn")
 * .enhancedImageMetadataEnabled(false)
 * .executionRole("executionRole")
 * .imageRecipeArn("imageRecipeArn")
 * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
 * .ecrConfiguration(EcrConfigurationProperty.builder()
 * .containerTags(List.of("containerTags"))
 * .repositoryName("repositoryName")
 * .build())
 * .imageScanningEnabled(false)
 * .build())
 * .imageTestsConfiguration(ImageTestsConfigurationProperty.builder()
 * .imageTestsEnabled(false)
 * .timeoutMinutes(123)
 * .build())
 * .schedule(ScheduleProperty.builder()
 * .pipelineExecutionStartCondition("pipelineExecutionStartCondition")
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .status("status")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .workflows(List.of(WorkflowConfigurationProperty.builder()
 * .onFailure("onFailure")
 * .parallelGroup("parallelGroup")
 * .parameters(List.of(WorkflowParameterProperty.builder()
 * .name("name")
 * .value(List.of("value"))
 * .build()))
 * .workflowArn("workflowArn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html)
 */
public interface CfnImagePipelineProps {
  /**
   * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-containerrecipearn)
   */
  public fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  /**
   * The description of this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
   * pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn)
   */
  public fun distributionConfigurationArn(): String? =
      unwrap(this).getDistributionConfigurationArn()

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   *
   * This information is used to enhance the overall experience of using EC2 Image Builder. Enabled
   * by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
   */
  public fun enhancedImageMetadataEnabled(): Any? = unwrap(this).getEnhancedImageMetadataEnabled()

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to perform workflow actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-executionrole)
   */
  public fun executionRole(): String? = unwrap(this).getExecutionRole()

  /**
   * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn)
   */
  public fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  /**
   * Contains settings for vulnerability scans.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
   */
  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
   */
  public fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
   * pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn)
   */
  public fun infrastructureConfigurationArn(): String

  /**
   * The name of the image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name)
   */
  public fun name(): String

  /**
   * The schedule of the image pipeline.
   *
   * A schedule configures how often and when a pipeline automatically creates a new image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The status of the image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The tags of this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Contains the workflows that run for the image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
   */
  public fun workflows(): Any? = unwrap(this).getWorkflows()

  /**
   * A builder for [CfnImagePipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     * for this pipeline.
     */
    public fun containerRecipeArn(containerRecipeArn: String)

    /**
     * @param description The description of this image pipeline.
     */
    public fun description(description: String)

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration associated with this image pipeline.
     */
    public fun distributionConfigurationArn(distributionConfigurationArn: String)

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list.
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean)

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list.
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     */
    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable)

    /**
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions.
     */
    public fun executionRole(executionRole: String)

    /**
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     */
    public fun imageRecipeArn(imageRecipeArn: String)

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable)

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty)

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01575e6db59a5c41c439638cd1e395d120a8ed816f1694668f6f8068f7226f29")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty)

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0535aba38d68e141fd6030b5efe1f84a47b1a1c3c5cda46c45fa231cd8272bd9")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration associated with this image pipeline. 
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    /**
     * @param name The name of the image pipeline. 
     */
    public fun name(name: String)

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    public fun schedule(schedule: CfnImagePipeline.ScheduleProperty)

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1a93b050f45e235d806569abacad74d044c27e770b80f315e79da2f45ce3e4")
    public fun schedule(schedule: CfnImagePipeline.ScheduleProperty.Builder.() -> Unit)

    /**
     * @param status The status of the image pipeline.
     */
    public fun status(status: String)

    /**
     * @param tags The tags of this image pipeline.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    public fun workflows(workflows: IResolvable)

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    public fun workflows(workflows: List<Any>)

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps.builder()

    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
     * for this pipeline.
     */
    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * @param description The description of this image pipeline.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration associated with this image pipeline.
     */
    override fun distributionConfigurationArn(distributionConfigurationArn: String) {
      cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list.
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     */
    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    /**
     * @param enhancedImageMetadataEnabled Collects additional information about the image being
     * created, including the operating system (OS) version and package list.
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     */
    override fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
      cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to perform workflow actions.
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     */
    override fun imageRecipeArn(imageRecipeArn: String) {
      cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    override fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnImagePipeline.ImageScanningConfigurationProperty::unwrap))
    }

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01575e6db59a5c41c439638cd1e395d120a8ed816f1694668f6f8068f7226f29")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnImagePipeline.ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(CfnImagePipeline.ImageTestsConfigurationProperty::unwrap))
    }

    /**
     * @param imageTestsConfiguration The configuration of the image tests that run after image
     * creation to ensure the quality of the image that was created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0535aba38d68e141fd6030b5efe1f84a47b1a1c3c5cda46c45fa231cd8272bd9")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageTestsConfiguration(CfnImagePipeline.ImageTestsConfigurationProperty(imageTestsConfiguration))

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration associated with this image pipeline. 
     */
    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /**
     * @param name The name of the image pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    override fun schedule(schedule: CfnImagePipeline.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnImagePipeline.ScheduleProperty::unwrap))
    }

    /**
     * @param schedule The schedule of the image pipeline.
     * A schedule configures how often and when a pipeline automatically creates a new image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1a93b050f45e235d806569abacad74d044c27e770b80f315e79da2f45ce3e4")
    override fun schedule(schedule: CfnImagePipeline.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnImagePipeline.ScheduleProperty(schedule))

    /**
     * @param status The status of the image pipeline.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags of this image pipeline.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    override fun workflows(workflows: IResolvable) {
      cdkBuilder.workflows(workflows.let(IResolvable::unwrap))
    }

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    override fun workflows(workflows: List<Any>) {
      cdkBuilder.workflows(workflows)
    }

    /**
     * @param workflows Contains the workflows that run for the image pipeline.
     */
    override fun workflows(vararg workflows: Any): Unit = workflows(workflows.toList())

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps,
  ) : CdkObject(cdkObject), CfnImagePipelineProps {
    /**
     * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-containerrecipearn)
     */
    override fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

    /**
     * The description of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-distributionconfigurationarn)
     */
    override fun distributionConfigurationArn(): String? =
        unwrap(this).getDistributionConfigurationArn()

    /**
     * Collects additional information about the image being created, including the operating system
     * (OS) version and package list.
     *
     * This information is used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
     */
    override fun enhancedImageMetadataEnabled(): Any? =
        unwrap(this).getEnhancedImageMetadataEnabled()

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to perform workflow actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-executionrole)
     */
    override fun executionRole(): String? = unwrap(this).getExecutionRole()

    /**
     * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn)
     */
    override fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
     */
    override fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

    /**
     * The configuration of the image tests that run after image creation to ensure the quality of
     * the image that was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
     */
    override fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
     * pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn)
     */
    override fun infrastructureConfigurationArn(): String =
        unwrap(this).getInfrastructureConfigurationArn()

    /**
     * The name of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The schedule of the image pipeline.
     *
     * A schedule configures how often and when a pipeline automatically creates a new image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The status of the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The tags of this image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Contains the workflows that run for the image pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-workflows)
     */
    override fun workflows(): Any? = unwrap(this).getWorkflows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImagePipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps):
        CfnImagePipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImagePipelineProps):
        software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
  }
}
