@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

/**
 * The destination repository for the container image.
 */
public inline
    fun CfnContainerRecipe.setTargetRepository(block: CfnContainerRecipeTargetContainerRepositoryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContainerRecipeTargetContainerRepositoryPropertyDsl()
  builder.apply(block)
  return setTargetRepository(builder.build())
}

/**
 * A group of options that can be used to configure an instance for building and testing container
 * images.
 */
public inline
    fun CfnContainerRecipe.setInstanceConfiguration(block: CfnContainerRecipeInstanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContainerRecipeInstanceConfigurationPropertyDsl()
  builder.apply(block)
  return setInstanceConfiguration(builder.build())
}

/**
 * The instance metadata option settings for the infrastructure configuration.
 */
public inline
    fun CfnInfrastructureConfiguration.setInstanceMetadataOptions(block: CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl()
  builder.apply(block)
  return setInstanceMetadataOptions(builder.build())
}

/**
 * The logging configuration defines where Image Builder uploads your logs.
 */
public inline
    fun CfnInfrastructureConfiguration.setLogging(block: CfnInfrastructureConfigurationLoggingPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInfrastructureConfigurationLoggingPropertyDsl()
  builder.apply(block)
  return setLogging(builder.build())
}

/**
 * Determines if tests should run after building the image.
 */
public inline
    fun CfnImagePipeline.setImageScanningConfiguration(block: CfnImagePipelineImageScanningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineImageScanningConfigurationPropertyDsl()
  builder.apply(block)
  return setImageScanningConfiguration(builder.build())
}

/**
 * The configuration of the image tests that run after image creation to ensure the quality of the
 * image that was created.
 */
public inline
    fun CfnImagePipeline.setImageTestsConfiguration(block: CfnImagePipelineImageTestsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineImageTestsConfigurationPropertyDsl()
  builder.apply(block)
  return setImageTestsConfiguration(builder.build())
}

/**
 * The schedule of the image pipeline.
 */
public inline fun CfnImagePipeline.setSchedule(block: CfnImagePipelineSchedulePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}

/**
 * Before you create a new AMI, Image Builder launches temporary Amazon EC2 instances to build and
 * test your image configuration.
 */
public inline
    fun CfnImageRecipe.setAdditionalInstanceConfiguration(block: CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl()
  builder.apply(block)
  return setAdditionalInstanceConfiguration(builder.build())
}

/**
 * Contains settings for Image Builder image resource and container image scans.
 */
public inline
    fun CfnImage.setImageScanningConfiguration(block: CfnImageImageScanningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageImageScanningConfigurationPropertyDsl()
  builder.apply(block)
  return setImageScanningConfiguration(builder.build())
}

/**
 * The configuration settings for your image test components, which includes a toggle that allows
 * you to turn off tests, and a timeout setting.
 */
public inline
    fun CfnImage.setImageTestsConfiguration(block: CfnImageImageTestsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageImageTestsConfigurationPropertyDsl()
  builder.apply(block)
  return setImageTestsConfiguration(builder.build())
}
