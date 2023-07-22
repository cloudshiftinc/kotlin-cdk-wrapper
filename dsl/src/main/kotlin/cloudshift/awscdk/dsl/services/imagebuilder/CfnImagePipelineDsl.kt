@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.constructs.Construct

@CdkDslMarker
public class CfnImagePipelineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImagePipeline.Builder = CfnImagePipeline.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the container recipe that is used for this pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-containerrecipearn)
   * @param containerRecipeArn The Amazon Resource Name (ARN) of the container recipe that is used
   * for this pipeline. 
   */
  public fun containerRecipeArn(containerRecipeArn: String) {
    cdkBuilder.containerRecipeArn(containerRecipeArn)
  }

  /**
   * The description of this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-description)
   * @param description The description of this image pipeline. 
   */
  public fun description(description: String) {
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
  public fun distributionConfigurationArn(distributionConfigurationArn: String) {
    cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
  }

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   *
   * This information is used to enhance the overall experience of using EC2 Image Builder. Enabled
   * by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
   * @param enhancedImageMetadataEnabled Collects additional information about the image being
   * created, including the operating system (OS) version and package list. 
   */
  public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
    cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
  }

  /**
   * Collects additional information about the image being created, including the operating system
   * (OS) version and package list.
   *
   * This information is used to enhance the overall experience of using EC2 Image Builder. Enabled
   * by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-enhancedimagemetadataenabled)
   * @param enhancedImageMetadataEnabled Collects additional information about the image being
   * created, including the operating system (OS) version and package list. 
   */
  public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
    cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
  }

  /**
   * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagerecipearn)
   * @param imageRecipeArn The Amazon Resource Name (ARN) of the image recipe associated with this
   * image pipeline. 
   */
  public fun imageRecipeArn(imageRecipeArn: String) {
    cdkBuilder.imageRecipeArn(imageRecipeArn)
  }

  /**
   * Determines if tests should run after building the image.
   *
   * Image Builder defaults to enable tests to run following the image build, before image
   * distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
   * @param imageScanningConfiguration Determines if tests should run after building the image. 
   */
  public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  /**
   * Determines if tests should run after building the image.
   *
   * Image Builder defaults to enable tests to run following the image build, before image
   * distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagescanningconfiguration)
   * @param imageScanningConfiguration Determines if tests should run after building the image. 
   */
  public
      fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
   * @param imageTestsConfiguration The configuration of the image tests that run after image
   * creation to ensure the quality of the image that was created. 
   */
  public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
    cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
  }

  /**
   * The configuration of the image tests that run after image creation to ensure the quality of the
   * image that was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration)
   * @param imageTestsConfiguration The configuration of the image tests that run after image
   * creation to ensure the quality of the image that was created. 
   */
  public
      fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty) {
    cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
  }

  /**
   * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image
   * pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-infrastructureconfigurationarn)
   * @param infrastructureConfigurationArn The Amazon Resource Name (ARN) of the infrastructure
   * configuration associated with this image pipeline. 
   */
  public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
    cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
  }

  /**
   * The name of the image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-name)
   * @param name The name of the image pipeline. 
   */
  public fun name(name: String) {
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
  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The schedule of the image pipeline.
   *
   * A schedule configures how often and when a pipeline automatically creates a new image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-schedule)
   * @param schedule The schedule of the image pipeline. 
   */
  public fun schedule(schedule: CfnImagePipeline.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * The status of the image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-status)
   * @param status The status of the image pipeline. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * The tags of this image pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-imagepipeline.html#cfn-imagebuilder-imagepipeline-tags)
   * @param tags The tags of this image pipeline. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnImagePipeline = cdkBuilder.build()
}
