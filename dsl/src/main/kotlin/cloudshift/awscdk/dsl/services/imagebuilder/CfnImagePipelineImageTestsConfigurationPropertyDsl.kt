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

  /**
   * @param imageTestsEnabled Defines if tests should be executed when building this image.
   * For example, `true` or `false` .
   */
  public fun imageTestsEnabled(imageTestsEnabled: Boolean) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  /**
   * @param imageTestsEnabled Defines if tests should be executed when building this image.
   * For example, `true` or `false` .
   */
  public fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  /**
   * @param timeoutMinutes The maximum time in minutes that tests are permitted to run.
   *
   * The timeoutMinutes attribute is not currently active. This value is ignored.
   */
  public fun timeoutMinutes(timeoutMinutes: Number) {
    cdkBuilder.timeoutMinutes(timeoutMinutes)
  }

  public fun build(): CfnImagePipeline.ImageTestsConfigurationProperty = cdkBuilder.build()
}
