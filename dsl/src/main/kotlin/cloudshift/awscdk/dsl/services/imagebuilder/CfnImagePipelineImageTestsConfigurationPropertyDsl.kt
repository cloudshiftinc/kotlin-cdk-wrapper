@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@CdkDslMarker
public class CfnImagePipelineImageTestsConfigurationPropertyDsl {
  private val cdkBuilder: CfnImagePipeline.ImageTestsConfigurationProperty.Builder =
      CfnImagePipeline.ImageTestsConfigurationProperty.builder()

  public fun imageTestsEnabled(imageTestsEnabled: Boolean) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  public fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  public fun timeoutMinutes(timeoutMinutes: Number) {
    cdkBuilder.timeoutMinutes(timeoutMinutes)
  }

  public fun build(): CfnImagePipeline.ImageTestsConfigurationProperty = cdkBuilder.build()
}
