@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@CdkDslMarker
public class CfnImagePipelineImageScanningConfigurationPropertyDsl {
  private val cdkBuilder: CfnImagePipeline.ImageScanningConfigurationProperty.Builder =
      CfnImagePipeline.ImageScanningConfigurationProperty.builder()

  public fun ecrConfiguration(ecrConfiguration: IResolvable) {
    cdkBuilder.ecrConfiguration(ecrConfiguration)
  }

  public fun ecrConfiguration(ecrConfiguration: CfnImagePipeline.EcrConfigurationProperty) {
    cdkBuilder.ecrConfiguration(ecrConfiguration)
  }

  public fun imageScanningEnabled(imageScanningEnabled: Boolean) {
    cdkBuilder.imageScanningEnabled(imageScanningEnabled)
  }

  public fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
    cdkBuilder.imageScanningEnabled(imageScanningEnabled)
  }

  public fun build(): CfnImagePipeline.ImageScanningConfigurationProperty = cdkBuilder.build()
}
