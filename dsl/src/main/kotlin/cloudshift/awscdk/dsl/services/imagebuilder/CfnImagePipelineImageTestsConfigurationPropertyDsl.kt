@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

/**
 * When you create an image or container recipe with Image Builder , you can add the build or test
 * components that your image pipeline uses to create the final image.
 *
 * You must have at least one build component to create a recipe, but test components are not
 * required. Your pipeline runs tests after it builds the image, to ensure that the target image is
 * functional and can be used reliably for launching Amazon EC2 instances.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ImageTestsConfigurationProperty imageTestsConfigurationProperty =
 * ImageTestsConfigurationProperty.builder()
 * .imageTestsEnabled(false)
 * .timeoutMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html)
 */
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
