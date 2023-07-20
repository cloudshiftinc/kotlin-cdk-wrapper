@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

public inline
    fun CfnImageRecipe.setAdditionalInstanceConfiguration(block: CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageRecipeAdditionalInstanceConfigurationPropertyDsl()
  builder.apply(block)
  return setAdditionalInstanceConfiguration(builder.build())
}

public inline
    fun CfnInfrastructureConfiguration.setInstanceMetadataOptions(block: CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl()
  builder.apply(block)
  return setInstanceMetadataOptions(builder.build())
}

public inline
    fun CfnInfrastructureConfiguration.setLogging(block: CfnInfrastructureConfigurationLoggingPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInfrastructureConfigurationLoggingPropertyDsl()
  builder.apply(block)
  return setLogging(builder.build())
}

public inline
    fun CfnContainerRecipe.setTargetRepository(block: CfnContainerRecipeTargetContainerRepositoryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContainerRecipeTargetContainerRepositoryPropertyDsl()
  builder.apply(block)
  return setTargetRepository(builder.build())
}

public inline
    fun CfnContainerRecipe.setInstanceConfiguration(block: CfnContainerRecipeInstanceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContainerRecipeInstanceConfigurationPropertyDsl()
  builder.apply(block)
  return setInstanceConfiguration(builder.build())
}

public inline
    fun CfnImage.setImageScanningConfiguration(block: CfnImageImageScanningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageImageScanningConfigurationPropertyDsl()
  builder.apply(block)
  return setImageScanningConfiguration(builder.build())
}

public inline
    fun CfnImage.setImageTestsConfiguration(block: CfnImageImageTestsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImageImageTestsConfigurationPropertyDsl()
  builder.apply(block)
  return setImageTestsConfiguration(builder.build())
}

public inline
    fun CfnImagePipeline.setImageScanningConfiguration(block: CfnImagePipelineImageScanningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineImageScanningConfigurationPropertyDsl()
  builder.apply(block)
  return setImageScanningConfiguration(builder.build())
}

public inline
    fun CfnImagePipeline.setImageTestsConfiguration(block: CfnImagePipelineImageTestsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineImageTestsConfigurationPropertyDsl()
  builder.apply(block)
  return setImageTestsConfiguration(builder.build())
}

public inline fun CfnImagePipeline.setSchedule(block: CfnImagePipelineSchedulePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnImagePipelineSchedulePropertyDsl()
  builder.apply(block)
  return setSchedule(builder.build())
}
