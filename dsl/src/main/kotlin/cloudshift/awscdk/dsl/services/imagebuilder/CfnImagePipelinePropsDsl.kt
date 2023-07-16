@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps

@CdkDslMarker
public class CfnImagePipelinePropsDsl {
  private val cdkBuilder: CfnImagePipelineProps.Builder = CfnImagePipelineProps.builder()

  public fun containerRecipeArn(containerRecipeArn: String) {
    cdkBuilder.containerRecipeArn(containerRecipeArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun distributionConfigurationArn(distributionConfigurationArn: String) {
    cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
  }

  public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
    cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
  }

  public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
    cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
  }

  public fun imageRecipeArn(imageRecipeArn: String) {
    cdkBuilder.imageRecipeArn(imageRecipeArn)
  }

  public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  public
      fun imageScanningConfiguration(imageScanningConfiguration: CfnImagePipeline.ImageScanningConfigurationProperty) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
    cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
  }

  public
      fun imageTestsConfiguration(imageTestsConfiguration: CfnImagePipeline.ImageTestsConfigurationProperty) {
    cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
  }

  public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
    cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schedule(schedule: IResolvable) {
    cdkBuilder.schedule(schedule)
  }

  public fun schedule(schedule: CfnImagePipeline.ScheduleProperty) {
    cdkBuilder.schedule(schedule)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnImagePipelineProps = cdkBuilder.build()
}
