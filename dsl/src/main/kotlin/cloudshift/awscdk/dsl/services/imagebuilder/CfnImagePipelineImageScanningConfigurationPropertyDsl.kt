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

  /**
   * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
   * container images that are scanned.
   */
  public fun ecrConfiguration(ecrConfiguration: IResolvable) {
    cdkBuilder.ecrConfiguration(ecrConfiguration)
  }

  /**
   * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
   * container images that are scanned.
   */
  public fun ecrConfiguration(ecrConfiguration: CfnImagePipeline.EcrConfigurationProperty) {
    cdkBuilder.ecrConfiguration(ecrConfiguration)
  }

  /**
   * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
   * vulnerability scans that Amazon Inspector runs against the build instance when you create a new
   * image.
   */
  public fun imageScanningEnabled(imageScanningEnabled: Boolean) {
    cdkBuilder.imageScanningEnabled(imageScanningEnabled)
  }

  /**
   * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
   * vulnerability scans that Amazon Inspector runs against the build instance when you create a new
   * image.
   */
  public fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
    cdkBuilder.imageScanningEnabled(imageScanningEnabled)
  }

  public fun build(): CfnImagePipeline.ImageScanningConfigurationProperty = cdkBuilder.build()
}
