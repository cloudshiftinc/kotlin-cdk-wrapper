@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnImage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnImageProps cfnImageProps = CfnImageProps.builder()
 * .infrastructureConfigurationArn("infrastructureConfigurationArn")
 * // the properties below are optional
 * .containerRecipeArn("containerRecipeArn")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html)
 */
public interface CfnImageProps {
  /**
   * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
   * and tested.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-containerrecipearn)
   */
  public fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

  /**
   * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
   * the outputs of your pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
   */
  public fun enhancedImageMetadataEnabled(): Any? = unwrap(this).getEnhancedImageMetadataEnabled()

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to perform workflow actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-executionrole)
   */
  public fun executionRole(): String? = unwrap(this).getExecutionRole()

  /**
   * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
   * tested, and assessed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn)
   */
  public fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

  /**
   * Contains settings for vulnerability scans.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
   */
  public fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

  /**
   * The image tests configuration of the image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
   */
  public fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment
   * in which your image will be built and tested.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn)
   */
  public fun infrastructureConfigurationArn(): String

  /**
   * The tags of the image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Contains an array of workflow configuration objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
   */
  public fun workflows(): Any? = unwrap(this).getWorkflows()

  /**
   * A builder for [CfnImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that defines
     * how images are configured and tested.
     */
    public fun containerRecipeArn(containerRecipeArn: String)

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration that defines and configures the outputs of your pipeline.
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
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
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
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty)

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a724bb4c00e7637af5d3dc480b2b555d359df5624afb5f22b61ec1ac4ab683f7")
    public
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty.Builder.() -> Unit)

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable)

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty)

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("941d7516ffaaa630c5054110e10d0ea7d989a4a4195c65b6a3bcddbe2af78d03")
    public
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration that defines the environment in which your image will be built and tested. 
     */
    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String)

    /**
     * @param tags The tags of the image.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    public fun workflows(workflows: IResolvable)

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    public fun workflows(workflows: List<Any>)

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    public fun workflows(vararg workflows: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnImageProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnImageProps.builder()

    /**
     * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that defines
     * how images are configured and tested.
     */
    override fun containerRecipeArn(containerRecipeArn: String) {
      cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    /**
     * @param distributionConfigurationArn The Amazon Resource Name (ARN) of the distribution
     * configuration that defines and configures the outputs of your pipeline.
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
     * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
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
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty) {
      cdkBuilder.imageScanningConfiguration(imageScanningConfiguration.let(CfnImage.ImageScanningConfigurationProperty::unwrap))
    }

    /**
     * @param imageScanningConfiguration Contains settings for vulnerability scans.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a724bb4c00e7637af5d3dc480b2b555d359df5624afb5f22b61ec1ac4ab683f7")
    override
        fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageScanningConfiguration(CfnImage.ImageScanningConfigurationProperty(imageScanningConfiguration))

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    override fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty) {
      cdkBuilder.imageTestsConfiguration(imageTestsConfiguration.let(CfnImage.ImageTestsConfigurationProperty::unwrap))
    }

    /**
     * @param imageTestsConfiguration The image tests configuration of the image.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("941d7516ffaaa630c5054110e10d0ea7d989a4a4195c65b6a3bcddbe2af78d03")
    override
        fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty.Builder.() -> Unit):
        Unit =
        imageTestsConfiguration(CfnImage.ImageTestsConfigurationProperty(imageTestsConfiguration))

    /**
     * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
     * configuration that defines the environment in which your image will be built and tested. 
     */
    override fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
      cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    /**
     * @param tags The tags of the image.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    override fun workflows(workflows: IResolvable) {
      cdkBuilder.workflows(workflows.let(IResolvable::unwrap))
    }

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    override fun workflows(workflows: List<Any>) {
      cdkBuilder.workflows(workflows)
    }

    /**
     * @param workflows Contains an array of workflow configuration objects.
     */
    override fun workflows(vararg workflows: Any): Unit = workflows(workflows.toList())

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageProps,
  ) : CdkObject(cdkObject), CfnImageProps {
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured
     * and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-containerrecipearn)
     */
    override fun containerRecipeArn(): String? = unwrap(this).getContainerRecipeArn()

    /**
     * The Amazon Resource Name (ARN) of the distribution configuration that defines and configures
     * the outputs of your pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-distributionconfigurationarn)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-enhancedimagemetadataenabled)
     */
    override fun enhancedImageMetadataEnabled(): Any? =
        unwrap(this).getEnhancedImageMetadataEnabled()

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to perform workflow actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-executionrole)
     */
    override fun executionRole(): String? = unwrap(this).getExecutionRole()

    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured,
     * tested, and assessed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagerecipearn)
     */
    override fun imageRecipeArn(): String? = unwrap(this).getImageRecipeArn()

    /**
     * Contains settings for vulnerability scans.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagescanningconfiguration)
     */
    override fun imageScanningConfiguration(): Any? = unwrap(this).getImageScanningConfiguration()

    /**
     * The image tests configuration of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-imagetestsconfiguration)
     */
    override fun imageTestsConfiguration(): Any? = unwrap(this).getImageTestsConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration that defines the
     * environment in which your image will be built and tested.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-infrastructureconfigurationarn)
     */
    override fun infrastructureConfigurationArn(): String =
        unwrap(this).getInfrastructureConfigurationArn()

    /**
     * The tags of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Contains an array of workflow configuration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-image.html#cfn-imagebuilder-image-workflows)
     */
    override fun workflows(): Any? = unwrap(this).getWorkflows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnImageProps):
        CfnImageProps = CdkObjectWrappers.wrap(cdkObject) as? CfnImageProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageProps):
        software.amazon.awscdk.services.imagebuilder.CfnImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnImageProps
  }
}
